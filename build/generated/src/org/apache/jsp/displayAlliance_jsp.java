package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class displayAlliance_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet/css reset.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet/displayAlliance.css\">\n");
      out.write("    <link rel=\"icon\" type=\"image/x-icon\" href=\"bus.png\" sizes=\"90x90\"/>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Alliance Bank Transaction Page | QBus</title>\n");
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
      out.write("            ");

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
            
      out.write("\n");
      out.write("            \n");
      out.write("            <h1>Payment Details</h1>\n");
      out.write("            \n");
      out.write("            <form method=\"POST\" action=\"printTicketAfterTransaction.jsp\">\n");
      out.write("                <img src=\"alliance.jpg\" alt=\"Alliance\">\n");
      out.write("\n");
      out.write("                <div class=\"table\">\n");
      out.write("                    <div class=\"list-field\">\n");
      out.write("                        <label>NAME</label>\n");
      out.write("                        ");
      out.print( session.getAttribute("username") );
      out.write("\n");
      out.write("\n");
      out.write("                        <br><br>\n");
      out.write("                        <label>BILL</label>\n");
      out.write("                        <div class=\"payment-field\">\n");
      out.write("                            <div class=\"line-1\">\n");
      out.write("                                <p>MYR</p>\n");
      out.write("                                ");
      out.print( ticket_price );
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"input-pay\">\n");
      out.write("                                <p>Online Bank:-</p>\n");
      out.write("                                <p>Bank Type: Alliance Bank</p>\n");
      out.write("                                <p>Date / Time: <span id=\"date-time\"></span></p>\n");
      out.write("                                <text class=\"input\">Click the button below to <b>\"Proceed\"</b> with the transaction.\n");
      out.write("                                <input type=\"submit\" value=\"PROCEED\" class=\"btn\" />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            ");

                }

                rs.close();
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
      out.write("\n");
      out.write("            <script>\n");
      out.write("                var dt = new Date();\n");
      out.write("                document.getElementById('date-time').innerHTML = dt;\n");
      out.write("            </script>\n");
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
