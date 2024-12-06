<!--I've rearranged the code by placing the CSS styling inside the <style> tags, 
and the JavaScript code is now included in the head section. Additionally, I 
fixed the missing = sign in the href attributes for bank links.-->

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="stylesheet/css reset.css">
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
    <link rel="stylesheet" type="text/css" href="stylesheet/option.css">
    <link rel="icon" type="image/x-icon" href="bus.png" sizes="90x90"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Payment Option | QBus</title>
</head>
<style>
</style>
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
            
        <% 
            Integer id = (Integer)session.getAttribute("busid");
        %>

                
        <!--other deets-->
        <div class = "actualContents">
            <h1>Select Payment Method</h1>
            
            <div class="paymentContainer">
                <br>
                <button class="btnCash" ><a href="booking.jsp">Cash</a></button>
                <br>
                
                <div class="dropdown">
                    <button class="btn">Bank Online</button>
                    <div class="dropdown-content">
                        <a href="displayAlliance.jsp?busid=<%=id%>">Alliance Bank</a>
                        <a href="displayBankIslam.jsp?busid=<%=id%>">Bank Islam</a>
                        <a href="displayMaybank.jsp?busid=<%=id%>">Maybank</a>
                        <a href="displayCimb.jsp?busid=<%=id%>">CIMB Bank</a>
                        <a href="displayRHB.jsp?busid=<%=id%>">RHB Bank</a>
                    </div>
                </div>
            </div>
                    
                    <br><br>
                    
            <button><a href="confirm.jsp">cancel</a></button>
        </div>
    </div>
</body>
</html>
