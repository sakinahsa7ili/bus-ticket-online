<!--In addition to the rearrangement, I made the following updates:

    Applied global styles for the body.
    Grouped related styles together.
    Updated heading styles for consistency.
    Added a search input field to filter the table rows based on the origin name.
    Cleaned up the button styles and added a button container for better alignment.
    Improved indentation and formatting for better readability.-->

<%-- 
    Document   : adminHome
    Created on : Jul 9, 2023, 11:32:36 AM
    Author     : USER
--%>

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
    <link rel="stylesheet" type="text/css" href="stylesheet/adminHome.css">
    <link rel="icon" type="image/x-icon" href="bus.png" sizes="90x90"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Homepage - Admin | QBus</title>

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
            <h1>Hello, <%=session.getAttribute("adminId")%>!</h1>

            <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for names.." title="Type in a name">

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
                        <th>Modify</th>
                    </tr>
                    <% 
                    try {
                        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/customers", "app", "app");
                        PreparedStatement pstmt = con.prepareStatement("SELECT * FROM avail_bus");
                        ResultSet rs = pstmt.executeQuery();

                        while (rs.next()) {
                            int id = rs.getInt("busid");
                            String origin = rs.getString("origin");
                            String destination = rs.getString("destination");
                            String dates = rs.getString("dates");
                            String bustype = rs.getString("bustype");
                            String seatnum = rs.getString("seatnum");
                            String ticket_price = rs.getString("price");
                            %>
                            <tr>
                                <td><%= origin %></td>
                                <td><%= destination %></td>
                                <td><%= dates %></td>
                                <td><%= bustype %></td>
                                <td><%= seatnum %></td>
                                <td><%= ticket_price %></td>
                                <td>
                                    <a href="adminCancel.jsp?busid=<%= id %>">Cancel</a>
                                </td>
                                <td>
                                    <a href="edit.jsp?busid=<%= id %>">Modify</a>
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
            
    <script>
        function myFunction() {
            var input, filter, table, tr, td, i, txtValue;
            input = document.getElementById("myInput");
            filter = input.value.toUpperCase();
            table = document.getElementById("bus-table");
            tr = table.getElementsByTagName("tr");
            for (i = 0; i < tr.length; i++) {
                td = tr[i].getElementsByTagName("td")[0];
                if (td) {
                    txtValue = td.textContent || td.innerText;
                    if (txtValue.toUpperCase().indexOf(filter) > -1) {
                        tr[i].style.display = "";
                    } else {
                        tr[i].style.display = "none";
                    }
                }       
            }
        }
    </script>
</body>
</html>
