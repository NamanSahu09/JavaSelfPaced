import java.util.*;
import java.sql.*;

public class Connection {
    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3306/StudentDatabase"; // Correct DB name
        String username = "root"; // Your MySQL username
        String password = "root"; // Your MySQL password
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Student ID: ");
        int studentID = sc.nextInt();
        sc.nextLine(); // Consume newline
        
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load MySQL Driver
            
            // Establish connection
            Connection conn = DriverManager.getConnection(url, username, password);
            
            // Prepare SQL query to insert data
            String query = "INSERT INTO Student (studentID, Name, Address) VALUES (?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(query);
            
            // Set values dynamically
            pst.setInt(1, studentID);
            pst.setString(2, name);
            pst.setString(3, address);
            
            // Execute query
            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Data inserted successfully!");
            }
            
            // Close resources
            pst.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            sc.close();
        }
    }
}
