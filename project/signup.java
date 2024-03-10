import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class signup {
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

    f.add(l);
    f.add(tf);
    f.add(l1);
    f.add(tf1);
    f.add(b);
    f.add(l0);
    f.add(tf0);

    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String num1 = tf.getText();
        String num2 = tf0.getText();
        String num3 = tf1.getText();

        System.out.println("Database will be connected");

        try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/everestdb", "root", "");
          System.out.println("Connection sucessful!");

          String query = "INSERT INTO signup (SN,uname,email,password) VALUES (?,?,?,?)";

          PreparedStatement st = con.prepareStatement(query);
          st.setInt(1, 1);
          st.setString(2, num1);
          st.setString(3, num2);
          st.setString(4, num3);
          int rowsInserted = st.executeUpdate();
          if (rowsInserted > 0) {
            System.out.println("A new user is inserted successfully!");
          }
          // else
          // {
          // System.out.println("User not inserted successfully!");
          // }
        }

        catch (Exception ex) {
          System.out.println("not connected");
        }

      }
    });

    f.setSize(320, 400);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
