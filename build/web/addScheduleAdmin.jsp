<!--In addition to rearranging the code, I made the following updates:

    Applied global styles for the body.
    Grouped related styles together.
    Updated heading styles for consistency.
    Adjusted container styles for better alignment.
    Added placeholders for select elements.
    Improved indentation and formatting for better readability.-->

<%-- 
    Document   : addScheduleAdmin
    Created on : Jul 9, 2023, 8:22:54 PM
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
    <link rel="stylesheet" type="text/css" href="stylesheet/addScheduleAdmin.css">
    <link rel="icon" type="image/x-icon" href="bus.png" sizes="90x90"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Add Schedule - Admin | QBus</title>
    
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
            <h1>Add Schedule</h1>

            <div class="container">
                <form action="addAdmin.jsp" method="POST">
                    <div class="row">
                        <label for="origin">ORIGIN</label>

                        <select name="ORIGIN" id="ORIGIN" placeholder="Origin..">
                            <option selected="true" disabled="disabled">Choose origin</option>
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
                            <option selected="true" disabled="disabled">Choose destination</option>
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
                        <label for="dates">DATES</label>

                        <input type="date" name="DATES" id="DATES" />
                    </div>
                    <div class="row">
                        <label for="bustype">BUS TYPE</label>

                        <select name="BUSTYPE" id="BUSTYPE">
                            <option selected="true" disabled="disabled">Choose bus type</option>
                            <option value="Plusliner">Plusliner</option>
                            <option value="Billion Star">Billion Star</option>
                            <option value="Naik Selalu">Naik Selalu</option>
                            <option value="Star Mart Express">Star Mart Express</option>
                            <option value="Jasmine">Jasmine</option>
                            <option value="Super Nice">Super Nice</option>
                            <option value="Persada">Persada</option>
                        </select>
                    </div>
                    <div class="row">
                        <label for="seatnum">SEAT NUMBER</label>
                        <select name="SEATNUM" id="SEATNUM">
                            <option selected="true" disabled="disabled">Choose seat</option>
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
                    <div class="row">
                        <label for="price">PRICE</label>
                        <input type="text" name="PRICE" id="PRICE">
                    </div>
                    <input type="submit" value="Add">
                </form>
            </div>

            <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for names.." title="Type in a name">

            <section id="bus-details" style="text-align: center;">
                <table id="bus-table" style="margin: 0 auto;" border="1">
                    <tr>
                        <th>Origin</th>
                        <th>Destination</th>
                        <th>Dates</th>
                        <th>Bus type</th>
                        <th>Seat number</th>
                        <th>Ticket price</th>
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
        </div>
    </div>
</body>
</html>
