import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;

public class logoutServlet extends HttpServlet {
    public static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession(true);//Fetch session object
        
        if(session!=null)
        {
            session.invalidate();//removes all session attribute bound to the session
            request.setAttribute("errMessage", "You have logged out successfully");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/welcome.html");
            requestDispatcher.forward(request, response);
            System.out.println("Logged out");
        }
    }
}
