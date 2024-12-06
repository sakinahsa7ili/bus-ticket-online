package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!--I've rearranged the code by placing the CSS styling inside the <style> tags \n");
      out.write("and fixing some formatting issues.-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet.css\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background-color: #796463;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        form {\n");
      out.write("            margin: auto;\n");
      out.write("            margin-top: 130px;\n");
      out.write("            margin-bottom: 200px;\n");
      out.write("            width: 45%;\n");
      out.write("            padding: 20px;\n");
      out.write("            background: #fff;\n");
      out.write("            box-shadow: 1px 1px 5px rgba(0, 0, 0, 0.582);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .head {\n");
      out.write("            font-size: 20px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .list-field {\n");
      out.write("            margin: 10px 10px 10px 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .list-field label {\n");
      out.write("            color: #356fbb;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .but-on {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button {\n");
      out.write("            background-color: #796463;\n");
      out.write("            border: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button a {\n");
      out.write("            color: white;\n");
      out.write("            text-decoration: none;\n");
      out.write("            text-align: center;\n");
      out.write("            background-color: #f59931;\n");
      out.write("            border: 3px solid white;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            padding: 8px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <form>\n");
      out.write("        <div class=\"head\">\n");
      out.write("            My Profile\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("        <div class=\"list-field\">\n");
      out.write("            <label for=\"name\">Name:</label>\n");
      out.write("            ");
      out.print( session.getAttribute("username") );
      out.write("<br>\n");
      out.write("            <label for=\"email\">Email:</label>\n");
      out.write("            ");
      out.print( session.getAttribute("email") );
      out.write("<br>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("    <div class=\"but-on\">\n");
      out.write("        <button><a href=\"booking.jsp\">back</a></button>\n");
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
