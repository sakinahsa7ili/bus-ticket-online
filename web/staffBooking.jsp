<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="stylesheet/css reset.css">
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
    <link rel="icon" type="image/x-icon" href="bus.png" sizes="90x90"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Booking - Staff | QBus</title>
    
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
            <a href="staffHome.jsp">Add Schedule</a> <hr>
            <a href="staffBooking.jsp">Book Bus</a> <hr>
            <a href="searchCustomer.jsp">Check Ticket</a><hr>
            <a href="allTicket.jsp">View Tickets</a> <hr>
            <a href="staffHome.jsp">Home</a><hr>
        </div>
                
        <!--other deets-->
        <div class = "actualContents">
            <h1>Book Ticket</h1>

            <form action="staffBooking.jsp" method="POST">
                <div class="row">
                    <label for="origin">ORIGIN</label>
                    <select name="ORIGIN" id="ORIGIN">
                        <option selected="true" disabled="disabled">choose origin</option>
                        <option value="Ipoh">Ipoh</option>
                        <option value="Shah Alam">Shah Alam</option>
                        <option value="Melaka">Melaka</option>
                        <option value="Kuala Lumpur">Kuala Lumpur</option>
                        <option value="Penang">Penang</option>
                        <option value="Johor Bahru">Johor Bahru</option>
                        <option value="Seremban">Seremban</option>
                        <option value="Kelantan">Kelantan</option>
                    </select>
                </div>
                <div class="row">
                    <label for="destination">DESTINATION</label>
                    <select name="DESTINATION" id="DESTINATION">
                        <option selected="true" disabled="disabled">choose destination</option>
                        <option value="Ipoh">Ipoh</option>
                        <option value="Shah Alam">Shah Alam</option>
                        <option value="Melaka">Melaka</option>
                        <option value="Kuala Lumpur">Kuala Lumpur</option>
                        <option value="Penang">Penang</option>
                        <option value="Johor Bahru">Johor Bahru</option>
                        <option value="Seremban">Seremban</option>
                        <option value="Kelantan">Kelantan</option>
                    </select>
                </div>
                <div class="row">
                    <label for="destination">DATES</label>
                    <input type="date" name="DATES" id="DATES"/>
                </div>
                <input type="submit" value="search">
            </form>

            <section id="bus-details">
                <table id="bus-table">
                    <tr>
                        <th>Origin</th>
                        <th>Destination</th>
                        <th>Dates</th>
                        <th>Bus Type</th>
                        <th>Seat number</th>
                        <th>Ticket price</th>
                        <th>Booking</th>
                    </tr>

                    <% 
                    try {
                        String selectOrigin = request.getParameter("ORIGIN");
                        String selectDestination = request.getParameter("DESTINATION");
                        String selectDates = request.getParameter("DATES");

                        Class.forName("org.apache.derby.jdbc.ClientDriver");
                        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/customers", "app", "app");
                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery("SELECT * FROM avail_bus where origin='"+selectOrigin+"' and destination='"+selectDestination+"' and dates='"+selectDates+"'");

                        while (rs.next()) {
                            int id = rs.getInt("busid");
                            String origin = rs.getString("origin");
                            String destination = rs.getString("destination");
                            String dates = rs.getString("dates");
                            String bustype = rs.getString("bustype");
                            String seatnum = rs.getString("seatnum");
                            String price = rs.getString("price");
                            %>
                            <tr>
                                <td><%= origin %></td>
                                <td><%= destination %></td>
                                <td><%= dates %></td>
                                <td><%= bustype %></td>
                                <td><%= seatnum %></td>
                                <td><%= price %></td>
                                <td>
                                    <a href="staffConfirm.jsp?busid=<%= id %>">Book</a>
                                </td>
                            </tr>
                            <%
                        }

                        rs.close();
                        stmt.close();
                        con.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    %>
                </table>
            </section>
        </div>
    </div>
</body>
</html>
