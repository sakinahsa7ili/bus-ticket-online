/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.LoginDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import person.bus.customer;
import util.DBConnection;

/**
 *
 * @author USER
 */
@WebServlet("/search.servlet")
public class searchServlet extends HttpServlet {
    public searchServlet(){}
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //response.setContentType("text/html");
        //PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String originlDB = "";
        String destinationDB = "";
        String datesDB = "";
        
            String origin = request.getParameter("origin");
            String destination = request.getParameter("destination");
            String dates = request.getParameter("dates");
            
            customer loginBean = new customer();
            //loginBean.setEmail(email);
            //loginBean.setPassword(password);
            
            LoginDao loginDao = new LoginDao();
            
            String userValidate = loginDao.authenticateUser(loginBean);
            
            try
        {
            con = DBConnection.createConnection();//Fetch database connection object
            statement = con.createStatement();//statement is used to write queries
            //resultSet = statement.executeQuery("select * from users where email='"+email+"' and password='"+password+"'");
            while(resultSet.next())//until next row is present otherwise it return false
                {
              //  useridDB = resultSet.getInt("userid");
                //emailDB = resultSet.getString("email");
                //passwordDB = resultSet.getString("password");
                //usernameDB = resultSet.getString("username");
                
            if(userValidate.equals("SUCCESS"))
            {
                HttpSession session = request.getSession();
                //session.setAttribute("userid",useridDB);
                //session.setAttribute("email", emailDB);
                //session.setAttribute("password",passwordDB);
                //session.setAttribute("username",usernameDB);
                
                response.sendRedirect("booking.jsp"); 
                //request.getRequestDispatcher("/booking.jsp").forward(request, response);
            }
            else
            {
                request.setAttribute("errMessage", userValidate);
                request.getRequestDispatcher("/customerLogin.jsp").forward(request, response);
            }
        }
            }catch(Exception e)
        {
            e.printStackTrace();
        }

}
}