/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import person.bus.staff;
import dao.staffDao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import util.DBConnection;

/**
 *
 * @author USER
 */
@WebServlet("/staff.login")
public class staffLoginServlet extends HttpServlet {
    public staffLoginServlet(){}
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //response.setContentType("text/html");
        //PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String staffemailDB = "";
        String staffusernameDB = "";
        String staffidDB = "";
        
            String staffemail = request.getParameter("staffemail");
            String staff_id = request.getParameter("staffid");
            
            staff loginBean = new staff();
            loginBean.setStaffEmail(staffemail);
            loginBean.setStaffId(staff_id);
            
            staffDao loginDao = new staffDao();
            
            String userValidate = loginDao.authenticateUser(loginBean);
            
            try
        {
            con = DBConnection.createConnection();//Fetch database connection object
            statement = con.createStatement();//statement is used to write queries
            resultSet = statement.executeQuery("select * from staff where staff_email='"+staffemail+"' and staffid='"+staff_id+"'");
            while(resultSet.next())//until next row is present otherwise it return false
                {
                staffidDB = resultSet.getString("staffid");
                staffemailDB = resultSet.getString("staff_email");
                staffusernameDB = resultSet.getString("staff_username");
                
            if(userValidate.equals("SUCCESS"))
            {
                HttpSession session = request.getSession();
                session.setAttribute("staffid",staffidDB);
                session.setAttribute("staff_email", staffemailDB);
                session.setAttribute("staff_username",staffusernameDB);
                
                response.sendRedirect("staffHome.jsp"); 
            }
            else
            {
                request.setAttribute("errMessage", userValidate);
                response.sendRedirect("staffLogin.jsp");
            }
        }
            }catch(Exception e)
        {
            e.printStackTrace();
        }

}
}