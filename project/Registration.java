
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Registration {

  public static void main(String[] args) {
    JFrame f1 = new JFrame("Database Connection");
    //////// coding///////
    JTextField tf = new JTextField();
    tf.setBounds(50, 50, 190, 25);
    JTextField tf1 = new JTextField();
    tf1.setBounds(50, 80, 190, 25);
    JTextField tf2 = new JTextField();
    tf2.setBounds(50, 110, 190, 25);

    //// button///
    JButton b = new JButton("register");
    b.setBounds(50, 140, 95, 30);
    JButton c = new JButton("cancel");
    c.setBounds(150, 140, 95, 30);

    f1.add(tf);
    f1.add(tf1);
    f1.add(tf2);
    f1.add(b);
    f1.add(c);

    f1.setLayout(null);
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f1.setSize(500, 500);
    f1.setVisible(true);

    ////// connection////
    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String name1 = tf.getText();
        String address1 = tf1.getText();
        String phone1 = tf2.getText();
        try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection(
              "jdbc:mysql://localhost:3306/student", "root", "");

          String query = "INSERT INTO registration (name,address,phone) VALUES (?,?,?)";
          PreparedStatement st = con.prepareStatement(query);

          st.setString(1, name1);
          st.setString(2, address1);
          st.setString(3, phone1);
          int rowsInserted = st.executeUpdate();
          if (rowsInserted > 0) {
            System.out.println("A new user is inserted successfully!");
          }

        } catch (Exception ex) {
          System.out.println("not connected");
        }

      }
    });
  }

}
