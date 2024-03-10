import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection
{
    public static void main(String[] args) 
    {
      String url = "jdbc:mysql://localhost:3306/user";
      String user = "subham";
      String password = "password";

      try 
      {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, user, password);

         if (connection != null) 
        {
          System.out.println("Connected to the database!");
          connection.close();
        } 
        else 
        {
          System.out.println("Failed to connect to the database!");
        }

      } 
      catch (ClassNotFoundException | SQLException e) 
      {
        e.printStackTrace();
      }
    }
}