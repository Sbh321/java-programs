
import javax.swing.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class login 
{
  public static void main(String[] args) 
  {
    JFrame f=new JFrame("Login page");

    JLabel l=new JLabel("Username:");
    l.setBounds(50,50,95,30); 
    JTextField tf=new JTextField("pdeepak503");  
    tf.setBounds(140,53, 100,25); 

    JLabel l1=new JLabel("Password:");
    l1.setBounds(50,90,95,30); 
    JTextField tf1=new JTextField("********");  
    tf1.setBounds(140,93, 100,25); 

    JButton b=new JButton("submit");
    b.setBounds(110,130,80,25);

    JButton c=new JButton("cancel");
    c.setBounds(200,130,80,25);

    JLabel error=new JLabel();
    error.setBounds(80,260,90,30); 

    b.addActionListener(new ActionListener()
    {  
      public void actionPerformed(ActionEvent e)
      {  
        String num1=tf.getText();
        String num2=tf1.getText();

        if(num1.equals("subham") && num2.equals("admin"))
        {
          System.out.println("Sucessfull login");
          error.setText("Sucessfull login");
        }
        else
        {
          System.out.println("*Invalid username or password");
          error.setText("*Invalid username or password");
        }
      }  
    });

    f.add(l);
    f.add(tf);
    f.add(l1);
    f.add(tf1);
    f.add(b);
    f.add(c);
    f.add(error);


    f.setSize(350,200);  
    f.setLayout(null);  
    f.setVisible(true);   
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    

    
  }
}
