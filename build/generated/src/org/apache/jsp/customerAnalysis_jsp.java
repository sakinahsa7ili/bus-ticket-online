package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class customerAnalysis_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.release();
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

      out.write("<!--Note: I removed the JavaScript code at the end since it seems incomplete \n");
      out.write("and it's not clear what the searchResults variable is. Please modify and \n");
      out.write("complete the JavaScript code as per your requirements.-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet/customerAnalysis.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <title>QBUS - Customer Analysis</title>\n");
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
      out.write("        \n");
      out.write("        .but-on {\n");
      out.write("        }\n");
      out.write("            \n");
      out.write("        button {\n");
      out.write("        }\n");
      out.write("            \n");
      out.write("        button a {\n");
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
      out.write("        .dropdown {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .dropbtn {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .dropdown-content {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .dropdown-content a {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .dropdown-content a:hover {}\n");
      out.write("\n");
      out.write("        .dropdown:hover .dropdown-content {}\n");
      out.write("\n");
      out.write("        .dropdown:hover .dropbtn {}\n");
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
      out.write("        #selected-date {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #total {\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <div id=\"logo\">\n");
      out.write("            <img src=\"bus.jpg\" alt=\"bus\" width=\"100\" height=\"100\">\n");
      out.write("        </div>\n");
      out.write("        <nav>\n");
      out.write("            <a href=\"#\">Staff</a>\n");
      out.write("            <a href=\"#\">Bus Route</a>\n");
      out.write("            <a class=\"active\" href=\"#\">Customer Analysis</a>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <form action=\"customerAnalysis.jsp\" method=\"POST\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-25\">\n");
      out.write("                    <label for=\"destination\">DATES</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-75\">\n");
      out.write("                    <input type=\"date\" name=\"DATES\" id=\"DATES\"/>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <input type=\"submit\" value=\"search\"/>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <section id=\"bus-details\" style=\"text-align: center;\">\n");
      out.write("        <div id=\"selected-date\"></div>\n");
      out.write("        <table id=\"bus-table\" style=\"margin: 0 auto;\" border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Origin</th>\n");
      out.write("                    <th>Destination</th>\n");
      out.write("                    <th>Dates</th>\n");
      out.write("                    <th>Bus type</th>\n");
      out.write("                    <th>Seat number</th>\n");
      out.write("                    <th>Ticket price</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");
 
                try {
                    String selectDates = request.getParameter("DATES");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/customers", "app", "app");
                    PreparedStatement pstmt = con.prepareStatement("SELECT * FROM bus where dates=?");
                    pstmt.setString(1, selectDates);
                    ResultSet rs = pstmt.executeQuery();
                    
                    while (rs.next()) {
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
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        busTable.innerHTML = \"\";\n");
      out.write("        totalElement.textContent = \"\";\n");
      out.write("\n");
      out.write("        if (searchResults.length > 0) {\n");
      out.write("            var tableRows = \"\";\n");
      out.write("            var totalTickets = 0;\n");
      out.write("\n");
      out.write("            for (var i = 0; i < searchResults.length; i++) {\n");
      out.write("                tableRows += \"<tr>\";\n");
      out.write("                tableRows += \"<td>\" + searchResults[i].date + \"</td>\";\n");
      out.write("                tableRows += \"<td>\" + searchResults[i].customerName + \"</td>\";\n");
      out.write("                tableRows += \"<td>\" + searchResults[i].numOfTickets + \"</td>\";\n");
      out.write("                tableRows += \"</tr>\";\n");
      out.write("\n");
      out.write("                totalTickets += searchResults[i].numOfTickets;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            busTable.innerHTML = tableRows;\n");
      out.write("            totalElement.textContent = \"Total Tickets: \" + totalTickets;\n");
      out.write("        } else {\n");
      out.write("            busTable.innerHTML = \"<tr><td colspan='3'>No results found for the selected date.</td></tr>\";\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <div class=\"but-on\">\n");
      out.write("        <button><a href=\"adminHome.jsp\">back</a></button>\n");
      out.write("        <button><a href=\"logoutServlet\">Log out</a></button>\n");
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

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setVar("myDatasource");
    _jspx_th_sql_setDataSource_0.setDriver("org.apache.derby.jdbc.ClientDriver");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:derby://localhost:1527/customers");
    _jspx_th_sql_setDataSource_0.setUser("app");
    _jspx_th_sql_setDataSource_0.setPassword("app");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }
}
