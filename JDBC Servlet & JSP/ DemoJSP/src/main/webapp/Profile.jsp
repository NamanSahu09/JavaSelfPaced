<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fetch Data from MySQL</title>
</head>
<body>

<%
out.println("Start<br/>");
    // Declare variables
    ResultSet rs = null;
    Connection conn = null;
    Statement st = null;

    try {
        String url = "jdbc:mysql://localhost:3306/test"; 
        String user = "root";
        String pass = "";

        String query = "SELECT * FROM testing WHERE id = 2"; 
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        conn = DriverManager.getConnection(url, user, pass);
        st = conn.createStatement();
        rs = st.executeQuery(query);

        if (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
           // int name1 = rs.getInt("name1");
%>

<h2>User Details</h2>
ID: <%= id %> <br/>
Name: <%= name %> <br/>
Age: <%= age %> <br/>

<%
        } else {
%>
<p>No record found with id = 2</p>
<%
        }
    }catch (Exception e) {
        out.println("<h3>Error Occurred:</h3>");
        java.io.StringWriter sw = new java.io.StringWriter();
        java.io.PrintWriter pw = new java.io.PrintWriter(sw);
        e.printStackTrace(pw); // Convert stack trace to string
        out.println("<pre>" + sw.toString() + "</pre>"); // Display nicely
    } 
        // Close connections (recommended)
        if (rs != null) rs.close();
        if (st != null) st.close();
        if (conn != null) conn.close();
    
%>

</body>
</html>