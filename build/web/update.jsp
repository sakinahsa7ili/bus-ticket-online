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
        String origin = request.getParameter("ORIGIN");
        String destination = request.getParameter("DESTINATION");
        String dates = request.getParameter("DATES");
        String bustype = request.getParameter("BUSTYPE");
        String seatnum = request.getParameter("SEATNUM");
        String ticket_price = request.getParameter("TICKET_PRICE");
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/customers", "app", "app");
        PreparedStatement pstmt = con.prepareStatement("UPDATE avail_bus SET origin=?, destination=?, dates=?, bustype=?, seatnum=?, price=? WHERE busid = ?");
        pstmt.setString(1, origin);
        pstmt.setString(2, destination);
        pstmt.setString(3, dates);
        pstmt.setString(4, bustype);
        pstmt.setString(5, seatnum);
        pstmt.setString(6, ticket_price);
        pstmt.setInt(7, id);
        
        pstmt.executeUpdate();
        pstmt.close();
        con.close();
        
        response.sendRedirect("adminHome.jsp");
    } catch (Exception e) {
        e.printStackTrace();
    }
    %>
</body>
</html>
