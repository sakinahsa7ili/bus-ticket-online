/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import person.bus.customer;
import dao.LoginDao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import util.DBConnection;

/**
 *
 * @author USER
 */
@WebServlet("/login.servlet")
public class loginServlet extends HttpServlet {
    public loginServlet(){}
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //response.setContentType("text/html");
        //PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String emailDB = "";
        String passwordDB = "";
        String usernameDB = "";
        Integer useridDB = 0;
        
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            
            customer loginBean = new customer();
            loginBean.setEmail(email);
            loginBean.setPassword(password);
            
            LoginDao loginDao = new LoginDao();
            
            String userValidate = loginDao.authenticateUser(loginBean);
            
            try
        {
            con = DBConnection.createConnection();//Fetch database connection object
            statement = con.createStatement();//statement is used to write queries
            resultSet = statement.executeQuery("select * from users where email='"+email+"' and password='"+password+"'");
            while(resultSet.next())//until next row is present otherwise it return false
                {
                useridDB = resultSet.getInt("userid");
                emailDB = resultSet.getString("email");
                passwordDB = resultSet.getString("password");
                usernameDB = resultSet.getString("username");
                
            if(userValidate.equals("SUCCESS"))
            {
                HttpSession session = request.getSession();
                session.setAttribute("userid",useridDB);
                session.setAttribute("email", emailDB);
                session.setAttribute("password",passwordDB);
                session.setAttribute("username",usernameDB);
                
                response.sendRedirect("booking.jsp"); 
                //request.getRequestDispatcher("/booking.jsp").forward(request, response);
            }
            else
            {
                //request.setAttribute("errMessage", userValidate);
                response.sendRedirect("customerLogin.jsp");
            }
        }
            }catch(Exception e)
        {
            e.printStackTrace();
        }

}
}