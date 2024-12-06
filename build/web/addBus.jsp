<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="javax.servlet.http.HttpSession;" %>
<!DOCTYPE html>
<html>
<head>
    <title>Create Bus</title>
</head>
<body>
    <%
        try {
        Integer busid = (Integer)request.getAttribute("busid");
        String origin = (String)request.getAttribute("origin");
        String destination = (String)request.getAttribute("destination");
        String dates = (String)request.getAttribute("dates");
        String bustype = (String)request.getAttribute("bustype");
        String seatnum = (String)request.getAttribute("seatnum");
        String ticket_price = (String)request.getAttribute("price");
        Integer id = (Integer)session.getAttribute("userid");
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/customers", "app", "app");
        PreparedStatement pstmt = con.prepareStatement("INSERT INTO BUS (ORIGIN, DESTINATION, DATES, BUSTYPE, SEATNUM, TICKET_PRICE, USERID) VALUES (?, ?, ?, ?, ?, ?, ?) ");
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
        
        session.setAttribute("busid",busid);
        response.sendRedirect("option.jsp");
    } catch (Exception e) {
        e.printStackTrace();
    }
    %>
</body>
</html>