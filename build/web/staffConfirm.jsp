<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="stylesheet/css reset.css">
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
    <link rel="stylesheet" type="text/css" href="stylesheet/staffConfirm.css">
    <link rel="icon" type="image/x-icon" href="bus.png" sizes="90x90"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style>
    </style>
</head>
<body>
<% 
try {
    int id = Integer.parseInt(request.getParameter("busid"));
            
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/customers", "app", "app");
    PreparedStatement pstmt = con.prepareStatement("SELECT * FROM avail_bus WHERE busid = ?");
    pstmt.setInt(1, id);
        
    ResultSet rs = pstmt.executeQuery();
        
    if (rs.next()) {
        // Retrieve the data from the result set
        String select_origin = rs.getString("origin");
        String select_destination = rs.getString("destination");
        String select_dates = rs.getString("dates");
        String select_bustype = rs.getString("bustype");
        String select_seatnum = rs.getString("seatnum");
        String select_price = rs.getString("price");
%>    
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
            <h1>Ticket Details</h1>
            
            <div class="form-all">
                <hr>
                <form action="staffHome.jsp" method="get">
                    <div class="list-field">
                        <label>ORIGIN</label>
                        <p id="origin"><%=select_origin%></p>
                        <br><br>

                        <label>DESTINATION</label>
                        <p id="destination"><%= select_destination %></p>
                        <br><br>
                        
                        <label>TYPE OF BUS</label>
                        <p id="bustype"><%= select_bustype %></p>
                        <br><br>
                        
                        <label>DESCRIPTION</label>
                        <div class="table-list"><br/>
                            <table>
                                <tr>
                                    <th>SEAT NO</th>
                                    <th><p id="seatnum"><%= select_seatnum %></p></th>
                                </tr>
                                <tr>
                                    <th>DATE/TIME</th>
                                    <th><p id="dates"><%= select_dates %></p></th>
                                </tr>
                            </table>
                        </div>
                                
                        <label>TICKET PRICE</label>
                        <p id="price"><%= select_price %></p>
                    </div>  

                    <input type="hidden" name="busid" value="<%= id%>">
                    <input type="hidden" name="origin" value="<%=select_origin%>">
                    <input type="hidden" name="destination" value="<%= select_destination %>">
                    <input type="hidden" name="bustype" value="<%= select_bustype %>">
                    <input type="hidden" name="seatnum" value="<%= select_seatnum %>">
                    <input type="hidden" name="dates" value="<%= select_dates %>">
                    <input type="hidden" name="price" value="<%= select_price %>">

                    <div class = "centerButton">
                        <button type="submit">Print</button>
                    </div>
                </form>
            </div>
            <%
            } else {
                out.println("No record");
            }

            rs.close();
            pstmt.close();
            con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            %>
        </div>
    </div>
</body>
</html>
