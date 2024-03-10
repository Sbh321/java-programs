
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

// class math
// {
//   int fact(int a)
//   {
//     int i;
//     int c;
//     for (i=0;i<=a;i++)
//     {
//       c = c * i;
//     }
//     return c;
//   }
// }
/////////(1/2+2)+1
public class example
{

  public static void main(String[] args)throws Exception 
  {
    JFrame f=new JFrame("Button Example");  
    JTextField tf=new JTextField();  
    tf.setBounds(50,50, 195,25); 
    JTextField tf2=new JTextField();  
    tf2.setBounds(50,80, 195,25); 
    
    
    // JLabel l1=new JLabel();
    JButton b=new JButton("Add");  
    b.setBounds(50,110,95,30);  
    
    JButton diff=new JButton("Subtract");  
    diff.setBounds(150,110,95,30);

    JButton mult=new JButton("Mul");  
    mult.setBounds(50,150,62,30);  
    
    JButton div=new JButton("Div");  
    div.setBounds(117,150,61,30);

    JButton mod=new JButton("Mod");  
    mod.setBounds(183,150,61,30);

    JButton power=new JButton("Power");
    power.setBounds(50, 190, 95, 30);

    JButton root=new JButton("Root");
    root.setBounds(150, 190, 95, 30);

    JTextField tf3=new JTextField();  
    tf3.setBounds(50,230, 31,30); 
    
    JButton fact=new JButton("!");  
    fact.setBounds(86,230,50,30);

    JButton sqr=new JButton("^2");  
    sqr.setBounds(141,230,50,30);

    JButton sqrt=new JButton("\u221A");  
    sqrt.setBounds(196,230,50,30);

    JTextField tf4=new JTextField();  
    tf4.setBounds(50,270, 100,30);
    
    JLabel l4=new JLabel("RESULT :");
    l4.setBounds(50,310,95,30); 

    JLabel l3=new JLabel();
    l3.setBounds(120,310,95,30); 

    JButton save=new JButton("Save");  
    save.setBounds(200,310,65,30); 
    
    
    f.add(save);
    f.add(tf);
    f.add(tf2);
    f.add(tf3);
    f.add(l3);
    f.add(diff);
    f.add(fact);
    f.add(l4);
    f.add(tf4);
    f.add(mult);
    f.add(div);
    f.add(mod);
    f.add(sqr);
    f.add(sqrt);
    f.add(power);
    f.add(root);
    
    b.addActionListener(new ActionListener()
    {  
      public void actionPerformed(ActionEvent e)
      {  
        String num1=tf.getText();
        int num11=Integer.parseInt(num1);
        String num2=tf2.getText();
        int num22=Integer.parseInt(num2);
        int sum=num11+num22;
        System.out.println(sum);
        l3.setText(Integer.toString(sum));
        
      }  
    });

    //////////////FOR SUBTRACTION///////
    diff.addActionListener(new ActionListener()
    {  
      public void actionPerformed(ActionEvent e)
      {  
        String num1=tf.getText();
        int num11=Integer.parseInt(num1);
        String num2=tf2.getText();
        int num22=Integer.parseInt(num2);
        int sum=num11-num22;
        System.out.println(sum);
        l3.setText(Integer.toString(sum));

      }  
    });

    //////////////FOR MULTIPLICATION///////
    mult.addActionListener(new ActionListener()
    {  
      public void actionPerformed(ActionEvent e)
      {  
        String num1=tf.getText();
        int num11=Integer.parseInt(num1);
        String num2=tf2.getText();
        int num22=Integer.parseInt(num2);
        int sum=num11*num22;
        System.out.println(sum);
        l3.setText(Integer.toString(sum));

      }  
    });

    //////////////FOR DIVISION///////
    div.addActionListener(new ActionListener()
    {  
      public void actionPerformed(ActionEvent e)
      {  
        String num1=tf.getText();
        int num11=Integer.parseInt(num1);
        String num2=tf2.getText();
        int num22=Integer.parseInt(num2);
        int sum=num11/num22;
        System.out.println(sum);
        l3.setText(Integer.toString(sum));
      }  
    });

    //////////////FOR MODULAS///////
    mod.addActionListener(new ActionListener()
    {  
      public void actionPerformed(ActionEvent e)
      {  
        String num1=tf.getText();
        int num11=Integer.parseInt(num1);
        String num2=tf2.getText();
        int num22=Integer.parseInt(num2);
        int sum=num11%num22;
        System.out.println(sum);
        l3.setText(Integer.toString(sum));
      }  
    });

    //////////////FOR POWER///////
    power.addActionListener(new ActionListener()
    {  
      public void actionPerformed(ActionEvent e)
      {  
        String num1=tf.getText();
        double num11=Double.parseDouble(num1);
        String num2=tf2.getText();
        Double num22=Double.parseDouble(num2);
        Double sum=Math.pow(num11, num22);
        System.out.println(sum);
        l3.setText(Double.toString(sum));
      }  
    });

    //////////////FOR ROOT///////
    root.addActionListener(new ActionListener()
    {  
      public void actionPerformed(ActionEvent e)
      {  
        String num1=tf.getText();
        double num11=Double.parseDouble(num1);
        String num2=tf2.getText();
        double num22=Double.parseDouble(num2);
        Double num3 = Math.pow(num11, 1.0 / num22);
        System.out.println(num3);
        l3.setText(Double.toString(num3));
      }  
    });


    ////////////FOR FACTORIAL/////////////
    fact.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        String num3=tf3.getText();
        int num33=Integer.parseInt(num3);

        int i;
        int c = 1;
        for (i=1;i<=num33;i++)
        {
          c = c * i;
        }

        System.out.println(c);
        l3.setText(Integer.toString(c));
      }
    });

    ///////////////FOR SQUARE////////////////
    sqr.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e)
      {
        String num3 = tf3.getText();
        int num33 = Integer.parseInt(num3);
        int num44 = num33 * num33;
        System.out.println(num44);
        l3.setText(Integer.toString(num44));
      }
    });

    ///////////////FOR SQUARE ROOT////////////////
    sqrt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e)
      {
        String num3 = tf3.getText();
        double num33 = Double.parseDouble(num3);
        double num44 = Math.sqrt(num33);
        System.out.println(num44);
        l3.setText(Double.toString(num44));
      }
    });

    //////////////FOR save///////
    save.addActionListener(new ActionListener()
    {  
      public void actionPerformed(ActionEvent e)
      {  
        //code for save data.
        try
        {    
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/bca","root","");
          Statement st = con.createStatement();
          String query = "INSERT INTO "
                  + "marks(id,java) "
                  + "VALUES(100,120)";
          st.execute(query);
          System.out.println("value inserted");
        }
        catch(Exception ex)
        {
        
        }
      }  
    });

    f.add(b);
    f.add(tf);  
    f.setSize(320,400);  
    f.setLayout(null);  
    f.setVisible(true);   
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }   
}
