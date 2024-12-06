<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<sql:setDataSource var="myDatasource" 
    driver="org.apache.derby.jdbc.ClientDriver" 
    url="jdbc:derby://localhost:1527/customers" user="app" 
    password="app" />
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="stylesheet/css reset.css">
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
    <link rel="stylesheet" type="text/css" href="stylesheet/displayAlliance.css">
    <link rel="icon" type="image/x-icon" href="bus.png" sizes="90x90"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Alliance Bank Transaction Page | QBus</title>
    <style>
    </style>
</head>
<body>
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
            
            <h1>Payment Details</h1>
            
            <form method="POST" action="printTicketAfterTransaction.jsp">
                <img src="alliance.jpg" alt="Alliance">

                <div class="table">
                    <div class="list-field">
                        <label>NAME</label>
                        <%= session.getAttribute("username") %>

                        <br><br>
                        <label>BILL</label>
                        <div class="payment-field">
                            <div class="line-1">
                                <p>MYR</p>
                                <%= ticket_price %>
                            </div>

                            <div class="input-pay">
                                <p>Online Bank:-</p>
                                <p>Bank Type: Alliance Bank</p>
                                <p>Date / Time: <span id="date-time"></span></p>
                                <text class="input">Click the button below to <b>"Proceed"</b> with the transaction.
                                <input type="submit" value="PROCEED" class="btn" />
                            </div>
                        </div>
                    </div>
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
            <script>
                var dt = new Date();
                document.getElementById('date-time').innerHTML = dt;
            </script>
        </div>
    </div>
</body>
</html>
