<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="stylesheet.css">
        <link rel="stylesheet" type="text/css" href="stylesheet/edit.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
        /* CSS for styling */
        body {
        }

        header {
        }

        #logo {
        }

        nav {
        }

        nav a {
        }

        nav a.active {
        }

        nav a:hover:not(.active) {
        }


        #timestamp-search {
        }

        #timestamp {
        }

        #search {
        }

        #bus-details {
        }

        #bus-details th,
        #bus-details td {
        }

        #bus-details th{
        }
        
        .form-all{
        }
        
        .head{
        }

        .list-field{
        } 

        .list-field label{
        }

        .list-field .table-list table{
        }
        .list-field .table-list table th{
        }
        
        h2{
        }
        
        table{
        }
        
        .but-on{
        }
        
        button{
        }
            
        button a{
        }
            
        .container {
        }

        .in-container {
        }

        .col-25 {
        }

        .col-75 {
        }
    </style>
    </head>
    <body>
        
        <% 
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
        <div class="form-all">
            <div class="head">
                Ticket Details <img src="bus.jpg" id="logo" alt="bus" width="100" height="100">
            </div>
            <hr>
            <div class="list-field">
                <label>ORIGIN</label>
                <br><br>
                <p><%= select_origin %></p>
                
                <label>DESTINATION</label>
                <br><br>
                <p><%= select_destination %></p>
                
                <br>
                <label>TYPE OF BUS</label>
                <br><br>
                <p><%= select_bustype %></p>
                <br><br>
                <label>DESCRIPTION</label>
                <div class="table-list"><br/>
                    <table>
                        <tr>
                            <th>SEAT NO</th>
                            <th><p><%= select_seatnum %></p></th>
                        </tr>
                        <tr>
                            <th>DATE/TIME</th>
                            <th><p><%= select_dates %></p></th>
                        </tr>
                    </table>
                </div>
                <label>TICKET PRICE</label>
                <br><br>
                <p><%= select_price %></p>
                <br><br>
                <br><br>
                
            </div>
                
            <h2>Edit bus schedule here :</h2>
            <div class="container">
                <form action="update.jsp?busid=<%= id %>" method="POST">
                    <div class="row">
                        <div class="col-25">
                            <label for="origin">ORIGIN </label>
                        </div>
                        <div class="col-75">
                            <select name="ORIGIN" id="origin">
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
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="destination">DESTINATION </label>
                        </div>
                        <div class="col-75">
                            <select name="DESTINATION" id="destination">
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
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="dates">Date </label>
                        </div>
                        <div class="col-75">
                            <input type="date" name="DATES" id="dates" />
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="bustype">Bus Type </label>
                        </div>
                        <div class="col-75">
                            <select name="BUSTYPE" id="bustype">
                                <option value="" disabled selected hidden>Choose your bus</option>
                                <option value="Plusliner">Plusliner</option>
                                <option value="Naik selalu">Naik Selalu</option>
                                <option value="Billion Star">Billion Star</option>
                                <option value="Confidence">Confidence</option>
                                <option value="Star Mart Express">Star Mert Express</option>
                                <option value="Persada">Persada</option>
                                <option value="Jasmine">Jasmine</option>
                                <option value="Super Nice">Super Nice</option>
                                <option value="Permata Utara Sdn Bhd">Permata Utara Sdn Bhd</option>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="seatnum">Seat number </label>
                        </div>
                        <div class="col-75">
                            <select name="SEATNUM" id="seatnum">
                                <option value="" disabled selected hidden>Choose your seat</option>
                                <option value="1C">1C</option>
                                <option value="1B">1B</option>
                                <option value="1A">1A</option>
                                <option value="2C">2C</option>
                                <option value="2B">2B</option>
                                <option value="2A">2A</option>
                                <option value="3C">3C</option>
                                <option value="3B">3B</option>
                                <option value="3A">3A</option>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-25">
                            <label for="ticketprice">Ticket Price </label>
                        </div>
                        <div class="col-75">
                            <input type="price" name="TICKET_PRICE" id="ticketprice" />
                        </div>
                    </div>
                    <br><br>
                    <div class="row">
                        <input type="submit" value="Save">
                        <input type="reset" value="Reset">
                    </div>
                </form>
            </div>
        </div>
                    
        <div class="but-on">
            <button><a href="adminHome.jsp">Back</a></button>
        </div>
                
    <%            
            
    rs.close();
    pstmt.close();
    con.close();
}

%>
</body>
</html>
