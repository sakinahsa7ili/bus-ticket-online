package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class staffHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
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
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet.css\">\n");
      out.write("    <title>Staff Home | QBus</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>Hello ");
      out.print(session.getAttribute("staff_username"));
      out.write("!</h1>\n");
      out.write("        \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <form action=\"staffHome.jsp\" method=\"POST\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-25\">\n");
      out.write("                    <label for=\"userid\">Customer ID</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-75\">\n");
      out.write("                    <input type=\"number\" name=\"userid\" id=\"userid\" placeholder=\"Customer ID...\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <input type=\"submit\" value=\"Search\">\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("    <section id=\"bus-details\" style=\"text-align: center;\">\n");
      out.write("        <table id=\"bus-table\" style=\"margin: 0 auto;\" border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Origin</th>\n");
      out.write("                <th>Destination</th>\n");
      out.write("                <th>Dates</th>\n");
      out.write("                <th>Bus Type</th>\n");
      out.write("                <th>Seat Number</th>\n");
      out.write("                <th>Ticket Price</th>\n");
      out.write("                <th>Print</th>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            ");
 
            try {
                int selectUserid = Integer.parseInt(request.getParameter("userid"));
                String selectOrigin = request.getParameter("origin");
                String selectDestination = request.getParameter("destination");

                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/customers", "app", "app");
                PreparedStatement stmt = con.prepareStatement("SELECT * FROM bus where userid=?");

                stmt.setInt(1, selectUserid);

                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    int id = rs.getInt("busid");
                    String origin = rs.getString("origin");
                    String destination = rs.getString("destination");
                    String dates = rs.getString("dates");
                    String bustype = rs.getString("bustype");
                    String seatnum = rs.getString("seatnum");
                    String price = rs.getString("ticket_price");
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( origin );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( destination );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( dates );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( bustype );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( seatnum );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( price );
      out.write("</td>\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"staffPrint.jsp?busid=");
      out.print( id );
      out.write("\">Print</a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                }

                rs.close();
                stmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </section>\n");
      out.write("                \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <form action=\"addSchedule.jsp\" method=\"POST\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-25\">\n");
      out.write("                    <label for=\"origin\">Origin</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-75\">\n");
      out.write("                    <select name=\"ORIGIN\" id=\"ORIGIN\" placeholder=\"Origin..\">\n");
      out.write("                        <option selected=\"true\" disabled=\"disabled\">Choose Origin</option>\n");
      out.write("                        <option value=\"Ipoh\">Ipoh</option>\n");
      out.write("                        <option value=\"Shah Alam\">Shah Alam</option>\n");
      out.write("                        <option value=\"Melaka\">Melaka</option>\n");
      out.write("                        <option value=\"Kuala Lumpur\">Kuala Lumpur</option>\n");
      out.write("                        <option value=\"Penang\">Penang</option>\n");
      out.write("                        <option value=\"Johor Bahru\">Johor Bahru</option>\n");
      out.write("                        <option value=\"Seremban\">Seremban</option>\n");
      out.write("                        <option value=\"Kelantan\">Kelantan</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-25\">\n");
      out.write("                    <label for=\"destination\">Destination</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-75\">\n");
      out.write("                    <select name=\"DESTINATION\" id=\"DESTINATION\">\n");
      out.write("                        <option selected=\"true\" disabled=\"disabled\">Choose Destination</option>\n");
      out.write("                        <option value=\"Ipoh\">Ipoh</option>\n");
      out.write("                        <option value=\"Shah Alam\">Shah Alam</option>\n");
      out.write("                        <option value=\"Melaka\">Melaka</option>\n");
      out.write("                        <option value=\"Kuala Lumpur\">Kuala Lumpur</option>\n");
      out.write("                        <option value=\"Penang\">Penang</option>\n");
      out.write("                        <option value=\"Johor Bahru\">Johor Bahru</option>\n");
      out.write("                        <option value=\"Seremban\">Seremban</option>\n");
      out.write("                        <option value=\"Kelantan\">Kelantan</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-25\">\n");
      out.write("                    <label for=\"dates\">Dates</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-75\">\n");
      out.write("                    <input type=\"date\" name=\"DATES\" id=\"DATES\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-25\">\n");
      out.write("                    <label for=\"bustype\">Bus Type</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-75\">\n");
      out.write("                    <select name=\"BUSTYPE\" id=\"BUSTYPE\">\n");
      out.write("                        <option selected=\"true\" disabled=\"disabled\">Choose Bus Type</option>\n");
      out.write("                        <option value=\"Plusliner\">Plusliner</option>\n");
      out.write("                        <option value=\"Billion Star\">Billion Star</option>\n");
      out.write("                        <option value=\"Naik Selalu\">Naik Selalu</option>\n");
      out.write("                        <option value=\"Star Mart Express\">Star Mart Express</option>\n");
      out.write("                        <option value=\"Jasmine\">Jasmine</option>\n");
      out.write("                        <option value=\"Super Nice\">Super Nice</option>\n");
      out.write("                        <option value=\"Persada\">Persada</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-25\">\n");
      out.write("                    <label for=\"seatnum\">Seat Number</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-75\">\n");
      out.write("                    <select name=\"SEATNUM\" id=\"SEATNUM\">\n");
      out.write("                        <option selected=\"true\" disabled=\"disabled\">Choose Seat</option>\n");
      out.write("                        <option value=\"1A\">1A</option>\n");
      out.write("                        <option value=\"1B\">1B</option>\n");
      out.write("                        <option value=\"1C\">1C</option>\n");
      out.write("                        <option value=\"2A\">2A</option>\n");
      out.write("                        <option value=\"2B\">2B</option>\n");
      out.write("                        <option value=\"2C\">2C</option>\n");
      out.write("                        <option value=\"3A\">3A</option>\n");
      out.write("                        <option value=\"3B\">3B</option>\n");
      out.write("                        <option value=\"3C\">3C</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-25\">\n");
      out.write("                    <label for=\"price\">Price</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-75\">\n");
      out.write("                    <input type=\"text\" name=\"PRICE\" id=\"PRICE\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <input type=\"submit\" value=\"Add\">\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"but-on\">\n");
      out.write("        <button><a href=\"logoutServlet\">Log out</a></button>\n");
      out.write("        <button><a href=\"allTicket.jsp\">View Tickets</a></button>\n");
      out.write("        <button><a href=\"searchCustomer.jsp\">Check Ticket</a></button>\n");
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
