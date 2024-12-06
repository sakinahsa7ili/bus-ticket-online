<!--In addition to the rearrangement, I made the following updates:

    Applied global styles for the body, links, and buttons.
    Created a container class to wrap the form for better alignment and responsiveness.
    Removed unused styles and unnecessary styling.
    Adjusted some styles for consistency and readability.-->

<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<sql:setDataSource var="myDatasource" 
    driver="org.apache.derby.jdbc.ClientDriver" 
    url="jdbc:derby://localhost:1527/passenger" user="app" 
    password="app" />
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
    <link rel="stylesheet" type="text/css" href="stylesheet/displayRHB.css">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Display RHB Bank Transaction Page</title>    
    <style>
        /* Global Styles */
        body {
        }

        a {
        }

        .container {
        }

        .button {
        }

        .button:hover {
        }

        /* Form Styles */
        form {
        }

        .head {
        }

        .list-field {
        }

        .list-field label {
        }

        .table-list table {
        }

        .table-list table th {
        }

        .payment-field {
        }

        .line-1 {
        }

        .line-1 sup { 
        }

        .line-1 .date {
        }

        .dropdown {
        }

        .Bank {
        }

        select {
        }

        table {
        }

        td {
        }

        img {
        }

        .input-pay table {
        }

        .input-pay table input {
        }

        .btn {
        }

        .btn:hover {
        }

        p {
        }
    </style>
</head>
<body>
    <%
    try {
        Integer id = (Integer) session.getAttribute("busid");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/customers", "app", "app");
        PreparedStatement pstmt = con.prepareStatement("SELECT * FROM avail_bus WHERE busid = ?");
        pstmt.setInt(1, id);

        ResultSet rs = pstmt.executeQuery();


        while (rs.next()) {
            String origin = rs.getString("origin");
            String destination = rs.getString("destination");
            String dates = rs.getString("dates");
            String bustype = rs.getString("bustype");
            String seatnum = rs.getString("seatnum");
            String ticket_price = rs.getString("price");
    %>
    <div class="container">
        <form method="POST" action="printTicketAfterTransaction.jsp">
            <img src="rhbbank.jpg" alt="RHB Bank">
            <div class="head">
                Payment Details
                <hr>
            </div>

            <div class="list-field">
                <label>NAME</label>
                <br><br>
                <%= session.getAttribute("username") %>
            </div>

            <div class="list-field">
                <label>BILL</label>
                <br><br>
                <div class="payment-field">
                    <div class="line-1">
                        <p>MYR</p>
                        <%= ticket_price %>
                    </div>

                    <div class="input-pay">
                        <p>Online Bank:-</p>
                        <p>Bank Type: RHB Bank</p>
                        <p>Date / Time: <span id="date-time"></span></p>
                        <text class="input">Click the button to <b>"Proceed"</b> the transaction below.</text>
                        <input type="submit" value="PROCEED" class="btn" />
                    </div>
                </div>
            </div>
        </form>
    </div>
    
    <%
    }

    rs.close();
    pstmt.close();
    con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    %>
    <script>
        var dt = new Date();
        document.getElementById('date-time').innerHTML = dt;
    </script>
</body>
</html>
