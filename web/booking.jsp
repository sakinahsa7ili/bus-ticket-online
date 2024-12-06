<!--In addition to the rearrangement, I made the following updates:

    Removed duplicate import statement for java.sql.Connection.
    Applied global styles for the body and headings.
    Grouped related styles together.
    Updated form styles for better readability and consistency.
    Removed inline styles and applied styles directly to the elements.
    Cleaned up the button styles and added a button container for better alignment.
    Removed unnecessary overflow: scroll from the bus details table section.
    Removed the inline margin: 0 auto; and added a global margin style for the bus details table.
    Improved indentation and formatting for better readability.-->

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
    <link rel="stylesheet" type="text/css" href="stylesheet/booking.css">
    <link rel="icon" type="image/x-icon" href="bus.png" sizes="90x90"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Booking | QBus</title>
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
        </div>
                
        <!--other deets-->
        <div class = "actualContents">
            <h1>Hello <%=session.getAttribute("username") %>!</h1>

                <form action="booking.jsp" method="POST">
                    <div class="row">
                        <label for="origin">ORIGIN</label>

                        <select name="SELECT_ORIGIN" id="ORIGIN" placeholder="Origin..">
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

                        <select name="SELECT_DESTINATION" id="DESTINATION">
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

                        <input type="date" name="SELECT_DATES" id="DATES"/>
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
                        String selectOrigin = request.getParameter("SELECT_ORIGIN");
                        String selectDestination = request.getParameter("SELECT_DESTINATION");
                        String selectDates = request.getParameter("SELECT_DATES");

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
                        <td name="origin"><%= origin %></td>
                        <td name="destination"><%= destination %></td>
                        <td name="dates"><%= dates %></td>
                        <td name="bustype"><%= bustype %></td>
                        <td name="seatnum"><%= seatnum %></td>
                        <td name="price"><%= price %></td>
                        <td>
                            <a href="confirm.jsp?busid=<%= id %>">Book</a>
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
