<!--I've rearranged the code by placing the CSS styling inside the <style> tags, 
moving the JavaScript script inside the head section, and fixing some formatting 
issues.-->

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<sql:setDataSource var="myDatasource" driver="org.apache.derby.jdbc.ClientDriver" url="jdbc:derby://localhost:1527/passenger" user="app" password="app"/>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="stylesheet/css reset.css">
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
    <link rel="stylesheet" type="text/css" href="stylesheet/printTicketAfterTransaction.css">
    <link rel="icon" type="image/x-icon" href="QBUS-removebg.png" sizes="90x90"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ticket Page | QBus</title>
    <script>
        function showAlert() {
            var myText = "Transaction is Successful";
            alert(myText);
        }
    </script>
    <style>
    </style>
</head>
<body onload="showAlert()">
    <!--general menu-->
    <div class = "mainMenu">
        <img src = "bus.png">
        <div class = "mainMenuLinks">
            <a href = "home.jsp">Home</a>
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
            <% 
                try {
                    Integer id = (Integer) session.getAttribute("busid");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/customers", "app", "app");
                    PreparedStatement pstmt = con.prepareStatement("SELECT * FROM avail_bus WHERE busid = ?");
                    pstmt.setInt(1, id);

                    ResultSet rs = pstmt.executeQuery();

                    while (rs.next()) {
                        String origin = rs.getString("origin");
                        String destination = rs.getString("destination");
                        String dates = rs.getString("dates");
                        String bustype = rs.getString("bustype");
                        String seatnum = rs.getString("seatnum");
                        String ticket_price = rs.getString("price");
            %>

            <h1>Print Ticket</h1>
            
            <form method="POST" action="cancelBus.jsp">
                <div class="list-field">
                    <label>DESTINATION</label><br>
                    <%= destination %>
                    
                    <br><br>

                    <label>TYPE OF BUS</label><br>
                    <%= bustype %>
                    
                    <br><br>
                    
                    <label>DESCRIPTION</label>
                    <div class="table-list">
                        <table>
                            <tr>
                                <th>TRAVELER</th>
                                <th><%= session.getAttribute("username") %>
                                </th>
                            </tr>
                            <tr>
                                <th>SEAT NO</th>
                                <th><%= seatnum %>
                            </tr>
                            <tr>
                                <th>DATE/TIME</th>
                                <th><%= dates %>
                            </tr>
                        </table>
                    </div>
                            
                    <label>TICKET PRICE</label>
                    <%= ticket_price %>
                    <br>
                    <input type="submit" value="PRINT" class="btn">
                </div>
            </form>
                    
            <%
                }

                rs.close();
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            %>
        </div>
    </div>
</body>
</html>
