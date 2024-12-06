package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class staffOrAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet/staffOrAdmin.css\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        form {\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .but-on {\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        button {\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        button a {\n");
      out.write("        }\n");
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
      out.write("                        window.location.replace(\"staffLogin.jsp\");\n");
      out.write("                    } else if (selection[i].value == \"admin\") {\n");
      out.write("                        window.location.replace(\"adminLogin.jsp\");\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <form name=\"form\">\n");
      out.write("        staff<input type=\"radio\" value=\"staff\" name=\"radios\" onclick=\"openPage();\"><br>\n");
      out.write("        admin<input type=\"radio\" value=\"admin\" name=\"radios\" onclick=\"openPage();\"><br>\n");
      out.write("    </form>\n");
      out.write("\n");
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
