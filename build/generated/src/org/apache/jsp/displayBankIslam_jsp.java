package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class displayBankIslam_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet/displayBankIslam.css\">\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Display Bank Islam Transaction Page</title>\n");
      out.write("    <style>\n");
      out.write("        /* Global Styles */\n");
      out.write("        body {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        a {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .button {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .button:hover {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Form Styles */\n");
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
      out.write("        .table-list table {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .table-list table th {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .payment-field {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .line-1 {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .line-1 sup { \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .line-1 .date {\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .dropdown {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .Bank {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        select {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        table {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        td {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        img {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .input-pay table {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .input-pay table input {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn:hover {\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        p {\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");

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
      out.write("    <form method=\"POST\" action=\"printTicketAfterTransaction.jsp\">\n");
      out.write("        <img src=\"bankislam.png\" alt=\"Bank Islam\">\n");
      out.write("        <br>\n");
      out.write("        <div class=\"head\">\n");
      out.write("            Payment Details\n");
      out.write("            <hr>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"table\">\n");
      out.write("            <div class=\"list-field\">\n");
      out.write("                <label>NAME</label>\n");
      out.write("                <br><br>\n");
      out.write("                ");
      out.print( session.getAttribute("username") );
      out.write("\n");
      out.write("                \n");
      out.write("                <br>\n");
      out.write("                <label>BILL</label>\n");
      out.write("                <br><br>\n");
      out.write("\n");
      out.write("                <div class=\"payment-field\">\n");
      out.write("                    <div class=\"line-1\">\n");
      out.write("                        <p>MYR</p>\n");
      out.write("                        ");
      out.print( ticket_price );
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"input-pay\">\n");
      out.write("                        <p style=\"margin: 20px\">Online Bank:-</p>\n");
      out.write("                        <p style=\"margin: 20px\">Bank Type: Bank Islam</p>\n");
      out.write("                        <p style=\"margin: 20px\">Date / Time: <span id=\"date-time\"></span></p>\n");
      out.write("                        <text class=\"input\" style=\"margin: 20px\">Clicking the button to <b>\"Proceed\"</b> the transaction below.\n");
      out.write("                        <input type=\"submit\" value=\"PROCEED\" class=\"btn\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("                \n");
      out.write("    ");

        }
        
        rs.close();
        pstmt.close();
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    
      out.write("\n");
      out.write("    <script>\n");
      out.write("        var dt = new Date();\n");
      out.write("        document.getElementById('date-time').innerHTML = dt;\n");
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
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:derby://localhost:1527/passenger");
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
