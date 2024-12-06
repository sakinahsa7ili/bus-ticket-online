<!--I've rearranged the code by placing the CSS styling inside the <style> tags 
and fixing some formatting issues.-->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="stylesheet/css reset.css">
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
    <link rel="stylesheet" type="text/css" href="stylesheet/register.css">
    <link rel="icon" type="image/x-icon" href="bus.png" sizes="90x90"/>
    <title>Registration Page | QBus</title>
    <style>
    </style>
</head>
<body>
    <!--general menu-->
    <div class = "mainMenu">
        <img src = "bus.png">
        <div class = "mainMenuLinks">
            <a href = "welcome.html">Home</a>
            <a href = "logIn.jsp">Sign In</a>
            <a href = "register.jsp">Register</a>
        </div>    
    </div>
    
    <!--contain all contents below main menu in its own div-->
    <div class = "contentsUnderMainMenu">
        <!--side menu-->
      
                
        <!--other deets-->
        <div class = "actualContents">
            <h1>Registration</h1>
                
            <form action="registerServlet" method="POST">
                <div class="row">
                    <label for="name">Name:</label>
                    <input type="text" id="USERNAME" name="USERNAME" required><br>
                </div>

                <div class="row">
                    <label for="email">Email:</label>
                    <input type="email" id="EMAIL" name="EMAIL" required><br>
                </div>

                <div class="row">
                    <label for="password">Password:</label>
                    <input type="password" id="PASSWORD" name="PASSWORD" required><br>
                </div>

                <input type="submit" value="Register">
            </form>
        </div>
    </div>
</body>
</html>
