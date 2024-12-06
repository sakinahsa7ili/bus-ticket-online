<!--I have rearranged the code by placing the table tags around the <tr> 
element inside the while loop, ensuring that each record is displayed in a 
separate table row. Additionally, I ensured that the necessary opening and 
closing tags are in place.-->

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <h1>My info</h1>
    
    <% 
    try {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/customers", "app", "app");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users");
        
        while (rs.next()) {
            int id = rs.getInt("userid");
            String username = rs.getString("username");
            String email = rs.getString("email");
            String password = rs.getString("password");
            %>
            <table>
                <tr>
                    <td><%= username %></td>
                    <td><%= email %></td>
                    <td><%= password %></td>

                    <td>
                        <a href="cancelBus.jsp?userid=<%= id %>">Delete</a>
                    </td>
                </tr>
            </table>
            <%
        }
        
        rs.close();
        stmt.close();
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    %>
</body>
</html>
