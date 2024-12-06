<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
    <link rel="stylesheet" type="text/css" href="stylesheet/staffPrint.css">
    <link rel="icon" type="image/x-icon" href="bus.jpg" sizes="90x90"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>QBUS - Ticket Page</title>
    <style>
        /* CSS for styling */
        body {
        }

        header {
        }

        #logo {
        }

        form {
        }

        .head {
        }

        .list-field {
        }

        .list-field label {
        }

        .list-field .table-list table {
        }

        .list-field .table-list table th {
        }

        table {
        }

        button {
        }

        button a {
        }
    </style>
</head>
<body>
    <header>
    </header>

    <form>
        <div class="head">
            Print Ticket <img src="bus.jpg" id="logo" alt="bus" width="100" height="100">
        </div>
        <hr>
        <% 
        try {
            int id = Integer.parseInt(request.getParameter("busid"));
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/customers", "app", "app");
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM bus WHERE busid = ?");
            pstmt.setInt(1, id);
            
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                // Retrieve the data from the result set
                String origin = rs.getString("origin");
                String destination = rs.getString("destination");
                String dates = rs.getString("dates");
                String bustype = rs.getString("bustype");
                String seatnum = rs.getString("seatnum");
                String price = rs.getString("ticket_price");
        %>

        <div class="list-field">
            <label>DESTINATION</label>
            <br><br>
            <p><%= destination %></p>

            <br>
            <label>TYPE OF BUS</label>
            <br><br>
            <%= bustype %>
            <br><br>
            <label>DESCRIPTION</label>
            <div class="table-list"><br/>
                <table>
                    <tr>
                        <th>SEAT NO</th>
                        <th><%= seatnum %></th>
                    </tr>
                    <tr>
                        <th>DATE/TIME</th>
                        <th><p><%= dates %></p></th>
                    </tr>
                </table>
            </div>
            <label>TICKET PRICE</label>
            <br><br>
            <%= price %>
            <br><br>
            <br><br>
            <button><a href="staffCancel.jsp?busid=<%= id %>">print</a></button>
            <button><a href="staffHome.jsp">back</a></button>
        </div>
    </form>
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
</body>
</html>
