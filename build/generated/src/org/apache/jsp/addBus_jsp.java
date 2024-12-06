package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.PrintWriter;

public final class addBus_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Create Bus</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");

    try {
        String origin = request.getParameter("ORIGIN");
        String destination = request.getParameter("DESTINATION");
        String dates = request.getParameter("DATES");
        String returndate = request.getParameter("RETURNDATE");
        String bustype = request.getParameter("BUSTYPE");
        String seatnum = request.getParameter("SEATNUM");
        String ticket_price = request.getParameter("TICKET_PRICE");
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/customers", "app", "app");
        PreparedStatement pstmt = con.prepareStatement("INSERT INTO BUS (ORIGIN, DESTINATION, DATES, RETURNDATE, BUSTYPE, SEATNUM, ticket_price) VALUES (?, ?, ?, ?, ?, ?, ?)");
        pstmt.setString(1, origin);
        pstmt.setString(2, destination);
        pstmt.setString(3, dates);
        pstmt.setString(4, returndate);
        pstmt.setString(5, bustype);
        pstmt.setString(6, seatnum);
        pstmt.setString(7, ticket_price);
        pstmt.executeUpdate();
        pstmt.close();
        con.close();
        
        response.sendRedirect("booking.jsp");
    } catch (Exception e) {
        e.printStackTrace();
    }
    
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
