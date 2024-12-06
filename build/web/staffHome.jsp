<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 

<sql:setDataSource var="myDatasource" 
    driver="org.apache.derby.jdbc.ClientDriver" 
    url="jdbc:derby://localhost:1527/customers" 
    user="app" password="app"/>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
    <title>Staff Home | QBus</title>
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
            <h1>Hello <%=session.getAttribute("staff_username")%>!</h1>

            <div class="container">
                <form action="staffHome.jsp" method="POST">
                    <div class="row">
                        <div class="col-25">
                            <label for="userid">Customer ID</label>
                        </div>
                        <div class="col-75">
                            <input type="number" name="userid" id="userid" placeholder="Customer ID...">
                        </div>
                    </div>
                    <input type="submit" value="Search">
                </form>
            </div>
            
            <section id="bus-details" style="text-align: center;">
                <table id="bus-table" style="margin: 0 auto;" border="1">
                    <tr>
                        <th>Origin</th>
                        <th>Destination</th>
                        <th>Dates</th>
                        <th>Bus Type</th>
                        <th>Seat Number</th>
                        <th>Ticket Price</th>
                        <th>Print</th>
                    </tr>

                    <% 
                    try {
                        int selectUserid = Integer.parseInt(request.getParameter("userid"));
                        String selectOrigin = request.getParameter("origin");
                        String selectDestination = request.getParameter("destination");

                        Class.forName("org.apache.derby.jdbc.ClientDriver");
                        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/customers", "app", "app");
                        PreparedStatement stmt = con.prepareStatement("SELECT * FROM bus where userid=?");

                        stmt.setInt(1, selectUserid);

                        ResultSet rs = stmt.executeQuery();

                        while (rs.next()) {
                            int id = rs.getInt("busid");
                            String origin = rs.getString("origin");
                            String destination = rs.getString("destination");
                            String dates = rs.getString("dates");
                            String bustype = rs.getString("bustype");
                            String seatnum = rs.getString("seatnum");
                            String price = rs.getString("ticket_price");
                    %>
                    <tr>
                        <td><%= origin %></td>
                        <td><%= destination %></td>
                        <td><%= dates %></td>
                        <td><%= bustype %></td>
                        <td><%= seatnum %></td>
                        <td><%= price %></td>
                        <td>
                            <a href="staffPrint.jsp?busid=<%= id %>">Print</a>
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

            <div class="container">
                <form action="addSchedule.jsp" method="POST">
                    <div class="row">
                        <div class="col-25">
                            <label for="origin">Origin</label>
                        </div>
                        <div class="col-75">
                            <select name="ORIGIN" id="ORIGIN" placeholder="Origin..">
                                <option selected="true" disabled="disabled">Choose Origin</option>
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
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="destination">Destination</label>
                        </div>
                        <div class="col-75">
                            <select name="DESTINATION" id="DESTINATION">
                                <option selected="true" disabled="disabled">Choose Destination</option>
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
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="dates">Dates</label>
                        </div>
                        <div class="col-75">
                            <input type="date" name="DATES" id="DATES">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="bustype">Bus Type</label>
                        </div>
                        <div class="col-75">
                            <select name="BUSTYPE" id="BUSTYPE">
                                <option selected="true" disabled="disabled">Choose Bus Type</option>
                                <option value="Plusliner">Plusliner</option>
                                <option value="Billion Star">Billion Star</option>
                                <option value="Naik Selalu">Naik Selalu</option>
                                <option value="Star Mart Express">Star Mart Express</option>
                                <option value="Jasmine">Jasmine</option>
                                <option value="Super Nice">Super Nice</option>
                                <option value="Persada">Persada</option>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="seatnum">Seat Number</label>
                        </div>
                        <div class="col-75">
                            <select name="SEATNUM" id="SEATNUM">
                                <option selected="true" disabled="disabled">Choose Seat</option>
                                <option value="1A">1A</option>
                                <option value="1B">1B</option>
                                <option value="1C">1C</option>
                                <option value="2A">2A</option>
                                <option value="2B">2B</option>
                                <option value="2C">2C</option>
                                <option value="3A">3A</option>
                                <option value="3B">3B</option>
                                <option value="3C">3C</option>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="price">Price</label>
                        </div>
                        <div class="col-75">
                            <input type="text" name="PRICE" id="PRICE">
                        </div>
                    </div>
                    <input type="submit" value="Add">
                </form>
            </div>
        </div>
    </div>
</body>
</html>
