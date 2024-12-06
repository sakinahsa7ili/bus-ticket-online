<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
    <title>Delete Bus</title>
</head>
<body>
    <%
    try {
        int id = Integer.parseInt(request.getParameter("busid"));
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/customers", "app", "app");
        PreparedStatement pstmt = con.prepareStatement("DELETE FROM bus WHERE busid = ?");
        pstmt.setInt(1, id);
        pstmt.executeUpdate();
        pstmt.close();
        con.close();
        
        response.sendRedirect("staffHome.jsp");
    } catch (Exception e) {
        e.printStackTrace();
    }
    %>
</body>
</html>
