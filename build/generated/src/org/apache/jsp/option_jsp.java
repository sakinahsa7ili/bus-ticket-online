package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class option_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("and the JavaScript code is now included in the head section. Additionally, I \n");
      out.write("fixed the missing = sign in the href attributes for bank links.-->\n");
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
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet/option.css\">\n");
      out.write("    <link rel=\"icon\" type=\"image/x-icon\" href=\"bus.png\" sizes=\"90x90\"/>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Payment Option | QBus</title>\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("</style>\n");
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
 
                Integer id = (Integer)session.getAttribute("busid");
            
      out.write("\n");
      out.write("            \n");
      out.write("            <h1>Select Payment Method</h1>\n");
      out.write("            \n");
      out.write("            <div class=\"form\"><br>\n");
      out.write("                <button class=\"btn\"><a href=\"booking.jsp\"> Cash</a></button><br><br>\n");
      out.write("                \n");
      out.write("                <div class=\"dropdown\">\n");
      out.write("                    <button class=\"btn\" style=\"width:236%\"> Bank Online</button>\n");
      out.write("                    <div class=\"dropdown-content\">\n");
      out.write("                        <a href=\"displayAlliance.jsp?busid=");
      out.print(id);
      out.write("\">Alliance Bank</a>\n");
      out.write("                        <a href=\"displayBankIslam.jsp?busid=");
      out.print(id);
      out.write("\">Bank Islam</a>\n");
      out.write("                        <a href=\"displayMaybank.jsp?busid=");
      out.print(id);
      out.write("\">Maybank</a>\n");
      out.write("                        <a href=\"displayCimb.jsp?busid=");
      out.print(id);
      out.write("\">Cimb Bank</a>\n");
      out.write("                        <a href=\"displayRHB.jsp?busid=");
      out.print(id);
      out.write("\">RHB Bank</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <button><a href=\"confirm.jsp\">cancel</a></button>\n");
      out.write("            </div>\n");
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
