<!--I've rearranged the code by placing the CSS styling inside the <style> tags 
and fixing some formatting issues.-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="stylesheet/css reset.css">
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
    <link rel="stylesheet" type="text/css" href="stylesheet/profile.css">
    <link rel="icon" type="image/x-icon" href="bus.png" sizes="90x90"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
            <form>
                <div class="head">
                    My Profile
                </div>
                <hr>
                <div class="list-field">
                    <label for="name">Name:</label>
                    <%= session.getAttribute("username") %><br>
                    <label for="email">Email:</label>
                    <%= session.getAttribute("email") %><br>
                </div>
            </form>
        </div>
    </div>
</body>
</html>
