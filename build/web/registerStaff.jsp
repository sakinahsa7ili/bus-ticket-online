<!--I've rearranged the code by placing the CSS styling inside the <style> tags 
and fixing some formatting issues.-->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
    <link rel="stylesheet" type="text/css" href="stylesheet/registerStaff.css">
    <title>Registration - Staff | QBus</title>
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
        <!--admin menu-->
        <div class = "sideMenu">
            <a href="addScheduleAdmin.jsp">Add Schedule</a> <hr>
            <a href="registerStaff.jsp">Register New Staff</a> <hr>
            <a href="customerAnalysis.jsp">Customer Analysis</a> <hr>
            <a href="adminHome.jsp">Home</a> <hr>
        </div>
        
        <!--searchbar and other deets-->
        <div class = "actualContents">
            <h1>Registration</h1>
            <form action="register.staff" method="POST">
                <div class="row">
                    <label for="name">Staff Name:</label>
                    <input type="text" id="STAFF_USERNAME" name="STAFF_USERNAME" required><br>
                </div>

                <div class="row">
                    <label for="email">Email:</label>
                    <input type="email" id="STAFF_EMAIL" name="STAFF_EMAIL" required><br>
                </div>

                <div class="row">
                    <label for="id">Staff ID:</label>
                    <input type="text" id="STAFFID" name="STAFFID" required><br>
                </div>

                <input type="submit" value="Register">
            </form>
        </div>
    </div>
</body>
</html>
