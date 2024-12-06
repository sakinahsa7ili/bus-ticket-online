<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="stylesheet/css reset.css">
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
    <link rel="stylesheet" type="text/css" href="stylesheet/staffOrAdmin.css">
    <link rel="icon" type="image/x-icon" href="bus.png" sizes="90x90"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Staff/Admin Sign In | QBus</title>
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
                                window.location.replace("staffLogin.jsp");
                            } else if (selection[i].value == "admin") {
                                window.location.replace("adminLogin.jsp");
                            }
                        }
                    }
                }
            </script>

            <form name="form">
                <input type="radio" value="staff" name="radios" onclick="openPage();"> Staff<br>
                <input type="radio" value="admin" name="radios" onclick="openPage();"> Admin<br>
            </form>
            <br><br>
            <div class="but-on">
                <button><a href="logIn.jsp">back</a></button>
            </div>
        </div>
    </div>
</body>
</html>
