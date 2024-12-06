<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
    <title>Create Bus </title>
</head>
<body>
    <%
        try {
        String origin = request.getParameter("ORIGIN");
        String destination = request.getParameter("DESTINATION");
        String dates = request.getParameter("DATES");
        String bustype = request.getParameter("BUSTYPE");
        String seatnum = request.getParameter("SEATNUM");
        String ticket_price = request.getParameter("PRICE");
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/customers", "app", "app");
        PreparedStatement pstmt = con.prepareStatement("INSERT INTO avail_bus (ORIGIN, DESTINATION, DATES, BUSTYPE, SEATNUM, PRICE) VALUES (?, ?, ?, ?, ?, ?) ");
        pstmt.setString(1, origin);
        pstmt.setString(2, destination);
        pstmt.setString(3, dates);
        pstmt.setString(4, bustype);
        pstmt.setString(5, seatnum);
        pstmt.setString(6, ticket_price);
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