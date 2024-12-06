package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logIn_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!--I have rearranged the code by placing the CSS styles in the <style> tag \n");
      out.write("within the <head> section. Additionally, I ensured that the script tag is \n");
      out.write("within the <body> section, and all the necessary closing tags are in place.-->\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet/css reset.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet/logIn.css\">\n");
      out.write("    <link rel=\"icon\" type=\"image/x-icon\" href=\"bus.png\" sizes=\"90x90\"/>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Sign In | QBus</title>\n");
      out.write("    <style>\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <script>\n");
      out.write("        function openPage() {\n");
      out.write("            var selection = document.form.radios;\n");
      out.write("\n");
      out.write("            for (i = 0; i < selection.length; i++) {\n");
      out.write("                if (selection[i].checked == true) {\n");
      out.write("                    if (selection[i].value == \"staff\") {\n");
      out.write("                        window.location.replace(\"staffOrAdmin.jsp\");\n");
      out.write("                    } else if (selection[i].value == \"customer\") {\n");
      out.write("                        window.location.replace(\"customerLogin.jsp\");\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <form name=\"form\">\n");
      out.write("        staff<input type=\"radio\" value=\"staff\" name=\"radios\" onclick=\"openPage();\"><br>\n");
      out.write("        customer<input type=\"radio\" value=\"customer\" name=\"radios\" onclick=\"openPage();\"><br>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <div class=\"but-on\">\n");
      out.write("        <button><a href=\"welcome.html\">back</a></button>\n");
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
