<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <script>
        function showAlert() {
          var myText = "booking is Successful";
          alert (myText);
        }
    </script>
    <style>
        /* CSS for styling */
        body {
          background-color:#796463;
          margin: 0;
          padding: 0;
        }

        header {
          background-color:#796463;
          padding: 10px;
        }

        #logo {
          float: right;
          height: 50px;
          width: 50px;
        }

        nav {
          float: left;
          margin-top: 150px;
          margin-left: 4px;
          padding: 0;
          list-style-type: none;
          padding: 0;
          width: 10%;
          background-color: #f1f1f1;
          position: fixed;
          height: 20%;
          overflow: auto;

        }

        nav a {
               display: block;
               color: #000;
               padding: 10px 16px;
               text-decoration: none;

        }

            nav a.active {
                background-color: #04AA6D;
                color: white;
            }

        nav a:hover:not(.active) {
                background-color: #555;
                color: white;
            }


        #timestamp-search {
          display: flex;
          justify-content: space-between;
          align-items: center;
          margin-top: 20px;
          margin-left: 400px;
          margin-right: 400px;
        }

        #timestamp {
          text-align: center;
        }

        #search {
          text-align: center;
        }

        #bus-details {
          margin: 30px auto;
          width: 80%;
          border-collapse: collapse;
        }

        #bus-details th,
        #bus-details td {
          padding: 10px;
          border: 1px solid #ccc;
           background-color: #f2f2f2;
        }

        #bus-details th{
            padding-top: 12px;
                    padding-bottom: 12px;
                    text-align: left;
                    background-color: #04AA6D;
                    color: white;
        }
        
        form {
            margin: auto;
            margin-top:130px;
            margin-bottom:200px;
            width: 45%; 
            padding: 20px;
            background: #fff;
            box-shadow: 1px 1px 5px  rgba(0, 0, 0, 0.582);
        }

        .head{
           font-size: 20px;
           font-weight: bold;
        }

        .list-field{
            margin: 10px 10px 10px 10px;
        } 

        .list-field label{
            color:#356fbb;
            font-weight: bold;
        }

        .list-field .table-list table{
            margin:5px 0px 60px 0px;
            border-collapse:collapse;
            width: 60%;
        }
        .list-field .table-list table th{
            border:1px solid rgba(158, 157, 157, 0.979);
            padding:5px 0px 5px 10px;
            text-align:left;
        }
        
        table{
            border:1px solid black;
            border:none;
            margin:auto;
            margin-top:15px;
            overflow: hidden;
            transition:max-height 0.5;
        }
        
        button
            {
                background-color: white;
                border: none;
            }
            
        button a{
                color: white;
                text-decoration: none;
                text-align: center;
                background-color: #f59931;
                border: 3px solid white;
                border-radius: 10px;
                padding: 8px;
            }
        
    </style>
    <head>
        <link rel="icon" type="image/x-icon" href="bus.jpg" sizes="90x90"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>QBUS - Ticket Page</title>
        </head>
        <body onload="showAlert()">
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
                <p><%=destination%></p>
                
                <br>
                <label>TYPE OF BUS</label>
                <br><br>
                <%=bustype%>
                <br><br>
                <label>DESCRIPTION</label>
                <div class="table-list"><br/>
                    <table>
                        <tr>
                            <th>SEAT NO</th>
                            <th><%=seatnum%></th>
                        </tr>
                        <tr>
                            <th>DATE/TIME</th>
                            <th><p><%=dates%></p>
                            </th>
                        </tr>
                    </table>
                </div>
                <label>TICKET PRICE</label>
                <br><br>
                <%=price%>
                <br><br>
                <br><br>
                <button><a href="cancelBus.jsp?busid=<%= id %>">print</a></button>
            </div>
            </form>
                <%
}else{
out.println("No record");
}

rs.close();
pstmt.close();
con.close();
}catch (Exception e){
e.printStackTrace();
}
        %>
        
        
    </body>
</html>