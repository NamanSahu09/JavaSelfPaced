import java.util.*;
import java.sql.*;
public class connectionn
{
  public static void main(String args[])
  {
    String url="jdbc:mysql://localhost:3306/college";
    String username="root";
    String password="root";
    try{
      Class.forName("com.mysql.jdbc.Driver");//Load Driver
      Connection conn = DriverManager.getConnection(url,username,password);//Create Connection
      Statement st = conn.createStatement();//Create statement
      ResultSet rs = st.executeQuery("select * from student");//Execute Query
      while(rs.next())
      {
        System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
      }
    }
    catch(Exception e)
    {
      System.out.println(e);
    }

  }
}