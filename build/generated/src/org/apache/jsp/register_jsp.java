package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!--I've rearranged the code by placing the CSS styling inside the <style> tags \n");
      out.write("and fixing some formatting issues.-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet/css reset.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet/register.css\">\n");
      out.write("    <link rel=\"icon\" type=\"image/x-icon\" href=\"bus.png\" sizes=\"90x90\"/>\n");
      out.write("    <title>Registration Page | QBus</title>\n");
      out.write("    <style>\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2>Registration</h2>\n");
      out.write("        <form action=\"registerServlet\" method=\"POST\">\n");
      out.write("            <div class=\"col-25\">\n");
      out.write("                <label for=\"name\">Name:</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-75\">\n");
      out.write("                <input type=\"text\" id=\"USERNAME\" name=\"USERNAME\" required><br>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-25\">\n");
      out.write("                <label for=\"email\">Email:</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-75\">\n");
      out.write("                <input type=\"email\" id=\"EMAIL\" name=\"EMAIL\" required><br>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-25\">\n");
      out.write("                <label for=\"password\">Password:</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-75\">\n");
      out.write("                <input type=\"password\" id=\"PASSWORD\" name=\"PASSWORD\" required><br>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" value=\"Register\">\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"but-on\">\n");
      out.write("        <button><a href=\"logIn.jsp\">back</a></button>\n");
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
