import java.sql.*;
import java.util.Scanner;

public class InsertStudent {
    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3306/StudentDatabase";
        String username = "root"; // Change if you have a different user
        String password = ""; // Change if you have set a MySQL password

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        int studentID = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Student Address: ");
        String address = sc.nextLine();

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish Connection
            Connection conn = DriverManager.getConnection(url, username, password);

            // SQL Insert Query
            String query = "INSERT INTO Student (studentID, Name, Address) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, studentID);
            pstmt.setString(2, name);
            pstmt.setString(3, address);

            // Execute Insert
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Data inserted successfully!");
            }

            // Close resources
            pstmt.close();
            conn.close();
            sc.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
