package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class database_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet/css reset.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet/database.css\">\n");
      out.write("    <link rel=\"icon\" type=\"image/x-icon\" href=\"bus.png\" sizes=\"90x90\"/>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Tickets | QBus</title>\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("    </style>\n");
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
      out.write("            <a href=\"booking.jsp\">Book Bus</a> <hr>\n");
      out.write("        </div>\n");
      out.write("                \n");
      out.write("        <!--other deets-->\n");
      out.write("        <div class = \"actualContents\">\n");
      out.write("            <h1>Tickets</h1>\n");
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
      out.write("                        <th>Print</th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 
                    try {
                        Integer user_id = (Integer)session.getAttribute("userid");
                        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/customers", "app", "app");
                        PreparedStatement pstmt = con.prepareStatement("SELECT * FROM bus WHERE userid = ?");
                        pstmt.setInt(1, user_id);

                        ResultSet rs = pstmt.executeQuery();

                        while (rs.next()) {
                            int id = rs.getInt("busid");
                            String origin = rs.getString("origin");
                            String destination = rs.getString("destination");
                            String dates = rs.getString("dates");
                            String bustype = rs.getString("bustype");
                            String seatnum = rs.getString("seatnum");
                            String ticket_price = rs.getString("ticket_price");
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print( origin );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( destination );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( dates );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( bustype );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( seatnum );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( ticket_price );
      out.write("</td>\n");
      out.write("                            <td>\n");
      out.write("                                <a href=\"cancelBus.jsp?busid=");
      out.print( id );
      out.write("\">Delete</a>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <a href=\"print.jsp?busid=");
      out.print( id );
      out.write("\">Print</a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

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
