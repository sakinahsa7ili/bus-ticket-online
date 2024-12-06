<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="stylesheet/css reset.css">
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
    <link rel="stylesheet" type="text/css" href="stylesheet/database.css">
    <link rel="icon" type="image/x-icon" href="bus.png" sizes="90x90"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Tickets | QBus</title>
    
    <style>
    </style>
</head>
<body>
    <!--general menu-->
    <div class = "mainMenu">
        <img src = "bus.png">
        <div class = "mainMenuLinks">
            <a href = "logoutServlet">Log Out</a>
        </div>    
    </div>
    
    <!--contain all contents below main menu in its own div-->
    <div class = "contentsUnderMainMenu">
        <!--side menu-->
        <div class = "sideMenu">
            <a href="database.jsp?<%=session.getAttribute("userid") %>">View ticket</a> <hr>
            <a href="profile.jsp">Profile</a> <hr>
            <a href="booking.jsp">Book Bus</a> <hr>
        </div>
                
        <!--other deets-->
        <div class = "actualContents">
            <h1>Tickets</h1>

            <section id="bus-details">
                <table id="bus-table">
                    <tr>
                        <th>Origin</th>
                        <th>Destination</th>
                        <th>Dates</th>
                        <th>Bus type</th>
                        <th>Seat number</th>
                        <th>Ticket price</th>
                        <th>Cancel</th>
                        <th>Print</th>
                    </tr>
                    <% 
                    try {
                        Integer user_id = (Integer)session.getAttribute("userid");
                        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/customers", "app", "app");
                        PreparedStatement pstmt = con.prepareStatement("SELECT * FROM bus WHERE userid = ?");
                        pstmt.setInt(1, user_id);

                        ResultSet rs = pstmt.executeQuery();

                        while (rs.next()) {
                            int id = rs.getInt("busid");
                            String origin = rs.getString("origin");
                            String destination = rs.getString("destination");
                            String dates = rs.getString("dates");
                            String bustype = rs.getString("bustype");
                            String seatnum = rs.getString("seatnum");
                            String ticket_price = rs.getString("ticket_price");
                        %>
                        <tr>
                            <td><%= origin %></td>
                            <td><%= destination %></td>
                            <td><%= dates %></td>
                            <td><%= bustype %></td>
                            <td><%= seatnum %></td>
                            <td><%= ticket_price %></td>
                            <td>
                                <a href="cancelBus.jsp?busid=<%= id %>">Delete</a>
                            </td>
                            <td>
                                <a href="print.jsp?busid=<%= id %>">Print</a>
                            </td>
                        </tr>
                        <%
                        }

                        rs.close();
                        pstmt.close();
                        con.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    %>
                </table>
            </section>
        </div>
    </div>
</body>
</html>
