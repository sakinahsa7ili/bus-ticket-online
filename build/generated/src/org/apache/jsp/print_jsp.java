package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class print_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!--I've rearranged the code by placing the CSS styling inside the <style> tags, \n");
      out.write("moving the JavaScript script inside the head section, and fixing some formatting \n");
      out.write("issues.-->\n");
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
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet/print.css\">\n");
      out.write("    <link rel=\"icon\" type=\"image/x-icon\" href=\"bus.jpg\" sizes=\"90x90\"/>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>QBUS - Ticket Page</title>\n");
      out.write("    <script>\n");
      out.write("        function showAlert() {\n");
      out.write("            var myText = \"Booking is Successful\";\n");
      out.write("            alert(myText);\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    <style>\n");
      out.write("        /* CSS for styling */\n");
      out.write("        body {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        header {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #logo {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nav {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nav a {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nav a.active {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nav a:hover:not(.active) {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #timestamp-search {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #timestamp {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #search {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #bus-details {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #bus-details th,\n");
      out.write("        #bus-details td {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #bus-details th {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        form {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .head {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .list-field {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .list-field label {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .list-field .table-list table {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .list-field .table-list table th {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        table {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button a {\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body onload=\"showAlert()\">\n");
      out.write("<header>\n");
      out.write("</header>\n");
      out.write("<form>\n");
      out.write("    <div class=\"head\">\n");
      out.write("        Print Ticket <img src=\"bus.jpg\" id=\"logo\" alt=\"bus\" width=\"100\" height=\"100\">\n");
      out.write("    </div>\n");
      out.write("    <hr>\n");
      out.write("    ");
 
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
    
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"list-field\">\n");
      out.write("        <label>DESTINATION</label>\n");
      out.write("        <br><br>\n");
      out.write("        <p>");
      out.print( destination );
      out.write("</p>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <label>TYPE OF BUS</label>\n");
      out.write("        <br><br>\n");
      out.write("        ");
      out.print( bustype );
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("        <label>DESCRIPTION</label>\n");
      out.write("        <div class=\"table-list\"><br/>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>SEAT NO</th>\n");
      out.write("                    <th>");
      out.print( seatnum );
      out.write("</th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>DATE/TIME</th>\n");
      out.write("                    <th><p>");
      out.print( dates );
      out.write("</p></th>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <label>TICKET PRICE</label>\n");
      out.write("        <br><br>\n");
      out.write("        ");
      out.print( price );
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("        <br><br>\n");
      out.write("        <button><a href=\"cancelBus.jsp?busid=");
      out.print( id );
      out.write("\">print</a></button>\n");
      out.write("        <button><a href=\"database.jsp\">back</a></button>\n");
      out.write("    </div>\n");
      out.write("    </form>\n");
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
