<!--I have rearranged the code by placing the CSS styles in the <style> tag 
within the <head> section. Additionally, I ensured that the script tag is 
within the <body> section, and all the necessary closing tags are in place.-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="stylesheet/css reset.css">
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
    <link rel="stylesheet" type="text/css" href="stylesheet/logIn.css">
    <link rel="icon" type="image/x-icon" href="bus.png" sizes="90x90"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Sign In | QBus</title>
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
            <script>
                function openPage() {
                    var selection = document.form.radios;

                    for (i = 0; i < selection.length; i++) {
                        if (selection[i].checked == true) {
                            if (selection[i].value == "staff") {
                                window.location.replace("staffOrAdmin.jsp");
                            } else if (selection[i].value == "customer") {
                                window.location.replace("customerLogin.jsp");
                            }
                        }
                    }
                }
            </script>

            <form name="form">
                <input type="radio" value="staff" name="radios" onclick="openPage();"> Staff<br>
                <input type="radio" value="customer" name="radios" onclick="openPage();"> Customer<br>
            </form>
            
            <br><br>
            
            <div class="but-on">
                <button><a href="welcome.html">back</a></button>
            </div>
        </div>
    </div>
</body>
</html>
