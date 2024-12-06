import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class getting extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public getting() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //get the values submitted to servlet
        Integer id = Integer.parseInt(request.getParameter("busid"));
        String busOrigin = request.getParameter("origin");
        String busDestination = request.getParameter("destination");
        String busBustype = request.getParameter("bustype");
        String busSeatnum = request.getParameter("seatnum");
        String busDates = request.getParameter("dates");
        String busPrice = request.getParameter("price");

        //set the values that will be accessed in userprofile
        request.setAttribute("busid", id);
        request.setAttribute("origin", busOrigin);
        request.setAttribute("destination", busDestination);
        request.setAttribute("bustype", busBustype);
        request.setAttribute("seatnum", busSeatnum);
        request.setAttribute("dates", busDates);
        request.setAttribute("price", busPrice);


      RequestDispatcher rd=request.getRequestDispatcher("addBus.jsp");    
      rd.forward(request,response);  


    }

}