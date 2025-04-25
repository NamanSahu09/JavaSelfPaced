<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
 <%--  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Page</title>
</head>
<body>

<%-- <h2>Hello, <%= request.getAttribute("label") %>!</h2>

<%
String name = request.getAttribute("label").toString();
out.println(name);

%> --%>

<h3>Hello, ${student}</h3>


<h3>Student List:</h3>

<ul>
    <c:forEach var="stu" items="${student}">
        <li>ID: ${stu.rollNo}, Name: ${stu.name}</li>
    </c:forEach>
</ul>

</body>
</html>
