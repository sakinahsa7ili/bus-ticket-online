package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class adminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!--In addition to the rearrangement, I made the following updates:\n");
      out.write("\n");
      out.write("    Applied global styles for the body.\n");
      out.write("    Grouped related styles together.\n");
      out.write("    Updated heading styles for consistency.\n");
      out.write("    Added a search input field to filter the table rows based on the origin name.\n");
      out.write("    Cleaned up the button styles and added a button container for better alignment.\n");
      out.write("    Improved indentation and formatting for better readability.-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet/css reset.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet/adminHome.css\">\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Admin Homepage | QBus</title>\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("        /* Global Styles */\n");
      out.write("        body {\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        /* Heading Styles */\n");
      out.write("        h1 {\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        /* Search Input Styles */\n");
      out.write("        #myInput {\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        /* Table Styles */\n");
      out.write("        #bus-details {\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        #bus-details th,\n");
      out.write("        #bus-details td {\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        #bus-details th {\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        #bus-table {\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        /* Button Styles */\n");
      out.write("        .but-on {\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        button {\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        button a {\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!--general menu-->\n");
      out.write("    <div class = \"mainMenu\">\n");
      out.write("        <img src = \"bus.png\">\n");
      out.write("        <div class = \"mainMenuLinks\">\n");
      out.write("            <a href = \"adminHome.jsp\">Home</a>\n");
      out.write("            <a href = \"logoutServlet\">Log Out</a>\n");
      out.write("        </div>    \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <!--contain all contents below main menu in its own div-->\n");
      out.write("    <div class = \"contentsUnderMainMenu\">\n");
      out.write("        <!--admin menu-->\n");
      out.write("        <div class = \"adminMenu\">\n");
      out.write("            <a href=\"addScheduleAdmin.jsp\">Add Schedule</a> <hr>\n");
      out.write("            <a href=\"registerStaff.jsp\">Register New Staff</a> <hr>\n");
      out.write("            <a href=\"customerAnalysis.jsp\">Customer Analysis</a> <hr>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!--searchbar and other deets-->\n");
      out.write("        <div class = \"actualContents\">\n");
      out.write("            <h1>Hello, ");
      out.print(session.getAttribute("adminId"));
      out.write("!</h1>\n");
      out.write("\n");
      out.write("            <input type=\"text\" id=\"myInput\" onkeyup=\"myFunction()\" placeholder=\"Search for names..\" title=\"Type in a name\">\n");
      out.write("\n");
      out.write("            <section id=\"bus-details\">\n");
      out.write("                <table id=\"bus-table\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Origin</th>\n");
      out.write("                        <th>Destination</th>\n");
      out.write("                        <th>Dates</th>\n");
      out.write("                        <th>Bus type</th>\n");
      out.write("                        <th>Seat number</th>\n");
      out.write("                        <th>Ticket price</th>\n");
      out.write("                        <th>Cancel</th>\n");
      out.write("                        <th>Modify</th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 
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
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print( origin );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( destination );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( dates );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( bustype );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( seatnum );
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( ticket_price );
      out.write("</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <a href=\"cancelBus.jsp?busid=");
      out.print( id );
      out.write("\">Cancel</a>\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <a href=\"edit.jsp?busid=");
      out.print( id );
      out.write("\">Modify</a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                        }

                        rs.close();
                        pstmt.close();
                        con.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("            \n");
      out.write("    <script>\n");
      out.write("        function myFunction() {\n");
      out.write("            var input, filter, table, tr, td, i, txtValue;\n");
      out.write("            input = document.getElementById(\"myInput\");\n");
      out.write("            filter = input.value.toUpperCase();\n");
      out.write("            table = document.getElementById(\"bus-table\");\n");
      out.write("            tr = table.getElementsByTagName(\"tr\");\n");
      out.write("            for (i = 0; i < tr.length; i++) {\n");
      out.write("                td = tr[i].getElementsByTagName(\"td\")[0];\n");
      out.write("                if (td) {\n");
      out.write("                    txtValue = td.textContent || td.innerText;\n");
      out.write("                    if (txtValue.toUpperCase().indexOf(filter) > -1) {\n");
      out.write("                        tr[i].style.display = \"\";\n");
      out.write("                    } else {\n");
      out.write("                        tr[i].style.display = \"none\";\n");
      out.write("                    }\n");
      out.write("                }       \n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
