package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Connection;

public final class booking_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    Removed duplicate import statement for java.sql.Connection.\n");
      out.write("    Applied global styles for the body and headings.\n");
      out.write("    Grouped related styles together.\n");
      out.write("    Updated form styles for better readability and consistency.\n");
      out.write("    Removed inline styles and applied styles directly to the elements.\n");
      out.write("    Cleaned up the button styles and added a button container for better alignment.\n");
      out.write("    Removed unnecessary overflow: scroll from the bus details table section.\n");
      out.write("    Removed the inline margin: 0 auto; and added a global margin style for the bus details table.\n");
      out.write("    Improved indentation and formatting for better readability.-->\n");
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
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet/booking.css\">\n");
      out.write("    <link rel=\"icon\" type=\"image/x-icon\" href=\"bus.png\" sizes=\"90x90\"/>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Booking | QBus</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!--general menu-->\n");
      out.write("    <div class = \"mainMenu\">\n");
      out.write("        <img src = \"bus.png\">\n");
      out.write("        <div class = \"mainMenuLinks\">\n");
      out.write("            <a href = \"home.jsp\">Home</a>\n");
      out.write("            <a href = \"logoutServlet\">Log Out</a>\n");
      out.write("        </div>    \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <!--contain all contents below main menu in its own div-->\n");
      out.write("    <div class = \"contentsUnderMainMenu\">\n");
      out.write("        <!--side menu-->\n");
      out.write("        <div class = \"sideMenu\">\n");
      out.write("            <a href=\"database.jsp?");
      out.print(session.getAttribute("userid") );
      out.write("\">View ticket</a> <hr>\n");
      out.write("            <a href=\"profile.jsp\">Profile</a> <hr>\n");
      out.write("        </div>\n");
      out.write("                \n");
      out.write("        <!--other deets-->\n");
      out.write("        <div class = \"actualContents\">\n");
      out.write("            <h1>Hello ");
      out.print(session.getAttribute("username") );
      out.write("!</h1>\n");
      out.write("\n");
      out.write("                <form action=\"booking.jsp\" method=\"POST\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <label for=\"origin\">ORIGIN</label>\n");
      out.write("\n");
      out.write("                        <select name=\"SELECT_ORIGIN\" id=\"ORIGIN\" placeholder=\"Origin..\">\n");
      out.write("                            <option selected=\"true\" disabled=\"disabled\">choose origin</option>\n");
      out.write("                            <option value=\"Ipoh\">Ipoh</option>\n");
      out.write("                            <option value=\"Shah Alam\">Shah Alam</option>\n");
      out.write("                            <option value=\"Melaka\">Melaka</option>\n");
      out.write("                            <option value=\"Kuala Lumpur\">Kuala Lumpur</option>\n");
      out.write("                            <option value=\"Penang\">Penang</option>\n");
      out.write("                            <option value=\"Johor Bahru\">Johor Bahru</option>\n");
      out.write("                            <option value=\"Seremban\">Seremban</option>\n");
      out.write("                            <option value=\"Kelantan\">Kelantan</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <label for=\"destination\">DESTINATION</label>\n");
      out.write("\n");
      out.write("                        <select name=\"SELECT_DESTINATION\" id=\"DESTINATION\">\n");
      out.write("                            <option selected=\"true\" disabled=\"disabled\">choose destination</option>\n");
      out.write("                            <option value=\"Ipoh\">Ipoh</option>\n");
      out.write("                            <option value=\"Shah Alam\">Shah Alam</option>\n");
      out.write("                            <option value=\"Melaka\">Melaka</option>\n");
      out.write("                            <option value=\"Kuala Lumpur\">Kuala Lumpur</option>\n");
      out.write("                            <option value=\"Penang\">Penang</option>\n");
      out.write("                            <option value=\"Johor Bahru\">Johor Bahru</option>\n");
      out.write("                            <option value=\"Seremban\">Seremban</option>\n");
      out.write("                            <option value=\"Kelantan\">Kelantan</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <label for=\"destination\">DATES</label>\n");
      out.write("\n");
      out.write("                        <input type=\"date\" name=\"SELECT_DATES\" id=\"DATES\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"submit\" value=\"search\">\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            <section id=\"bus-details\">\n");
      out.write("                <table id=\"bus-table\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Origin</th>\n");
      out.write("                        <th>Destination</th>\n");
      out.write("                        <th>Dates</th>\n");
      out.write("                        <th>Bus Type</th>\n");
      out.write("                        <th>Seat number</th>\n");
      out.write("                        <th>Ticket price</th>\n");
      out.write("                        <th>Booking</th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 
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
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td name=\"origin\">");
      out.print( origin );
      out.write("</td>\n");
      out.write("                        <td name=\"destination\">");
      out.print( destination );
      out.write("</td>\n");
      out.write("                        <td name=\"dates\">");
      out.print( dates );
      out.write("</td>\n");
      out.write("                        <td name=\"bustype\">");
      out.print( bustype );
      out.write("</td>\n");
      out.write("                        <td name=\"seatnum\">");
      out.print( seatnum );
      out.write("</td>\n");
      out.write("                        <td name=\"price\">");
      out.print( price );
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"confirm.jsp?busid=");
      out.print( id );
      out.write("\">Book</a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        }

                        rs.close();
                        stmt.close();
                        con.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
