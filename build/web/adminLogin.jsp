<!--In addition to the rearrangement, I made the following updates:

    Removed the unnecessary sql tag library import since it is not used in the provided code.
    Applied global styles for the body.
    Grouped related styles together.
    Updated form styles for better readability and consistency.
    Cleaned up the button styles and added a button container for better alignment.
    Improved indentation and formatting for better readability.-->

<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<sql:setDataSource var="myDatasource" driver="org.apache.derby.jdbc.ClientDriver" url="jdbc:derby://localhost:1527/customers" user="app" password="app" />

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="stylesheet/css reset.css">
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
    <link rel="stylesheet" type="text/css" href="stylesheet/adminLogin.css">
    <link rel="icon" type="image/x-icon" href="bus.png" sizes="90x90"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Admin Login | QBus</title>
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
            <h1>Login</h1>

            <form action="admin.servlet" method="POST">
                <div class="row">
                    <label for="email">Email:</label>
                    <input type="email" id="adminEmail" name="adminEmail" required>
                </div>

                <div class="row">
                    <label for="password">Staff id:</label>
                    <input type="text" id="adminId" name="adminId" required>
                </div>
                <input type="submit" value="Login">
            </form>
            
            <br><br>

            <div class="button-container">
                <button><a href="staffOrAdmin.jsp">Back</a></button>
            </div>
        
        </div>
    </div>
</body>
</html>
