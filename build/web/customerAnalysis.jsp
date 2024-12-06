<!--Note: I removed the JavaScript code at the end since it seems incomplete 
and it's not clear what the searchResults variable is. Please modify and 
complete the JavaScript code as per your requirements.-->

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<sql:setDataSource var="myDatasource" 
    driver="org.apache.derby.jdbc.ClientDriver" 
    url="jdbc:derby://localhost:1527/customers" 
    user="app" password="app"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="stylesheet/css reset.css">
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
    <link rel="stylesheet" type="text/css" href="stylesheet/customerAnalysis.css">
    <link rel="icon" type="image/x-icon" href="bus.png" sizes="90x90"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>Customer Analysis - Admin | QBus</title>
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
                
        <!--other deets-->
        <div class = "actualContents">
            <div class="container">
                <form action="customerAnalysis.jsp" method="POST">
                    <div class="row">
                            <label for="destination">DATES</label>
                            <input type="date" name="DATES" id="DATES"/>
                    </div>
                    <input type="submit" value="search"/>
                </form>
            </div>

            <section id="bus-details">
                <div id="selected-date"></div>
                <table id="bus-table">
                    <thead>
                        <tr>
                            <th>Origin</th>
                            <th>Destination</th>
                            <th>Dates</th>
                            <th>Bus type</th>
                            <th>Seat number</th>
                            <th>Ticket price</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% 
                        try {
                            String selectDates = request.getParameter("DATES");
                            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/customers", "app", "app");
                            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM bus where dates=?");
                            pstmt.setString(1, selectDates);
                            ResultSet rs = pstmt.executeQuery();

                            while (rs.next()) {
                                String origin = rs.getString("origin");
                                String destination = rs.getString("destination");
                                String dates = rs.getString("dates");
                                String bustype = rs.getString("bustype");
                                String seatnum = rs.getString("seatnum");
                                String ticket_price = rs.getString("ticket_price");
                                %>
                                <tr>
                                    <td><%= origin %></td>
                                    <td><%= destination %></td>
                                    <td><%= dates %></td>
                                    <td><%= bustype %></td>
                                    <td><%= seatnum %></td>
                                    <td><%= ticket_price %></td>
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
                    </tbody>
                </table>
            </section>

            <script>
                busTable.innerHTML = "";
                totalElement.textContent = "";

                if (searchResults.length > 0) {
                    var tableRows = "";
                    var totalTickets = 0;

                    for (var i = 0; i < searchResults.length; i++) {
                        tableRows += "<tr>";
                        tableRows += "<td>" + searchResults[i].date + "</td>";
                        tableRows += "<td>" + searchResults[i].customerName + "</td>";
                        tableRows += "<td>" + searchResults[i].numOfTickets + "</td>";
                        tableRows += "</tr>";

                        totalTickets += searchResults[i].numOfTickets;
                    }

                    busTable.innerHTML = tableRows;
                    totalElement.textContent = "Total Tickets: " + totalTickets;
                } else {
                    busTable.innerHTML = "<tr><td colspan='3'>No results found for the selected date.</td></tr>";
                }
            </script>
        </div>
    </div>
</body>
</html>
