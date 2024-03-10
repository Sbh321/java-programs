import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class signupr {
    public static void main(String[] args) {
        JFrame f = new JFrame("Register");

        JLabel l = new JLabel("Username");
        l.setBounds(50, 50, 95, 30);
        JTextField tf = new JTextField();
        tf.setBounds(50, 90, 195, 25);

        JLabel l0 = new JLabel("E-mail");
        l0.setBounds(50, 130, 95, 30);
        JTextField tf0 = new JTextField();
        tf0.setBounds(50, 170, 195, 25);

        JLabel l1 = new JLabel("Password");
        l1.setBounds(50, 210, 95, 30);
        JTextField tf1 = new JTextField();
        tf1.setBounds(50, 250, 195, 25);

        JButton b = new JButton("Register");
        b.setBounds(90, 290, 120, 25);

        // Add action listener to the Register button
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = tf.getText();
                String email = tf0.getText();
                String password = tf1.getText();

                // Call a method to insert the data into the database
                insertData(username, email, password);
            }
        });

        f.add(l);
        f.add(tf);
        f.add(l1);
        f.add(tf1);
        f.add(b);
        f.add(l0);
        f.add(tf0);

        f.setSize(320, 400);
        f.setLayout(null);



           f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Method to insert data into the database
    private static void insertData(String username, String email, String password) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Replace 'your_database_url', 'your_username', and 'your_password' with your
            // actual database credentials
            String url = "jdbc:mysql://localhost:3306/everestDB";
            String usernameDB = "your_username";
            String passwordDB = "your_password";

            // Create a database connection
            Connection con = DriverManager.getConnection(url, usernameDB, passwordDB);

            // Create a prepared statement to insert data into the 'signup' table
            String insertQuery = "INSERT INTO signup (username, email, password) VALUES (?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(insertQuery);
            pst.setString(1, username);
            pst.setString(2, email);
            pst.setString(3, password);

            // Execute the insert statement
            pst.executeUpdate();

            // Close the resources
            pst.close();
            con.close();

            // Show a message dialog indicating successful registration
            JOptionPane.showMessageDialog(null, "Registration successful!");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred during registration.");
        }
    }
}
