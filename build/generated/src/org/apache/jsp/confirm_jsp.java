package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class confirm_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!--In addition to rearranging the code, I made the following updates:\n");
      out.write("\n");
      out.write("    Applied consistent indentation and formatting for better readability.\n");
      out.write("    Updated the style block and added relevant comments.\n");
      out.write("    Corrected the formatting and placement of HTML tags.\n");
      out.write("    Adjusted the CSS classes for better styling.\n");
      out.write("    Fixed a few typos and formatting issues in the code.\n");
      out.write("\n");
      out.write("Please note that without the associated Java class and the correct database \n");
      out.write("configuration, it's not possible to verify the functionality of the code.-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      person.bus.Bus Bus = null;
      synchronized (_jspx_page_context) {
        Bus = (person.bus.Bus) _jspx_page_context.getAttribute("Bus", PageContext.PAGE_SCOPE);
        if (Bus == null){
          Bus = new person.bus.Bus();
          _jspx_page_context.setAttribute("Bus", Bus, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("Bus"), request);
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet/css reset.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet/confirm.css\">\n");
      out.write("    <link rel=\"icon\" type=\"image/x-icon\" href=\"bus.png\" sizes=\"90x90\"/>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Confirmation | QBus</title>\n");
      out.write("    <style>\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("     \n");
      out.write("    </header>\n");
      out.write("            \n");
      out.write("    ");
 
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
    
      out.write("\n");
      out.write("    <div class=\"form-all\">\n");
      out.write("        <div class=\"head\">\n");
      out.write("            Ticket Details <img src=\"bus.jpg\" id=\"logo\" alt=\"bus\" width=\"100\" height=\"100\">\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("        <form action=\"get.servlet\" method=\"get\">\n");
      out.write("            <div class=\"list-field\">\n");
      out.write("                <label>ORIGIN</label>\n");
      out.write("                <br><br>\n");
      out.write("                <p id=\"origin\">");
      out.print(select_origin);
      out.write("</p>\n");
      out.write("                \n");
      out.write("                <label>DESTINATION</label>\n");
      out.write("                <br><br>\n");
      out.write("                <p id=\"destination\">");
      out.print( select_destination );
      out.write("</p>\n");
      out.write("                \n");
      out.write("                <br>\n");
      out.write("                <label>TYPE OF BUS</label>\n");
      out.write("                <br><br>\n");
      out.write("                <p id=\"bustype\">");
      out.print( select_bustype );
      out.write("</p>\n");
      out.write("                <br><br>\n");
      out.write("                <label>DESCRIPTION</label>\n");
      out.write("                <div class=\"table-list\"><br/>\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>SEAT NO</th>\n");
      out.write("                            <th><p id=\"seatnum\">");
      out.print( select_seatnum );
      out.write("</p></th>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>DATE/TIME</th>\n");
      out.write("                            <th><p id=\"dates\">");
      out.print( select_dates );
      out.write("</p></th>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <label>TICKET PRICE</label>\n");
      out.write("                <br><br>\n");
      out.write("                <p id=\"price\">");
      out.print( select_price );
      out.write("</p>\n");
      out.write("                <br><br>\n");
      out.write("                <br><br>\n");
      out.write("            </div>  \n");
      out.write("                \n");
      out.write("            <input type=\"hidden\" name=\"busid\" value=\"");
      out.print( id);
      out.write("\">\n");
      out.write("            <input type=\"hidden\" name=\"origin\" value=\"");
      out.print(select_origin);
      out.write("\">\n");
      out.write("            <input type=\"hidden\" name=\"destination\" value=\"");
      out.print( select_destination );
      out.write("\">\n");
      out.write("            <input type=\"hidden\" name=\"bustype\" value=\"");
      out.print( select_bustype );
      out.write("\">\n");
      out.write("            <input type=\"hidden\" name=\"seatnum\" value=\"");
      out.print( select_seatnum );
      out.write("\">\n");
      out.write("            <input type=\"hidden\" name=\"dates\" value=\"");
      out.print( select_dates );
      out.write("\">\n");
      out.write("            <input type=\"hidden\" name=\"price\" value=\"");
      out.print( select_price );
      out.write("\">\n");
      out.write("                \n");
      out.write("            <div>\n");
      out.write("                <button type=\"submit\">Book</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("                \n");
      out.write("        <button><a href=\"booking.jsp\">Back</a></button>\n");
      out.write("    </div>\n");
      out.write("    ");
 } else {
        out.println("No record");
    }

    rs.close();
    pstmt.close();
    con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    
      out.write("\n");
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
