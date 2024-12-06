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
import person.bus.admin;
import dao.adminDao;
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
@WebServlet("/admin.servlet")
public class adminLogin extends HttpServlet {
    public adminLogin(){}
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //response.setContentType("text/html");
        //PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
        
            String adminEmail = request.getParameter("adminEmail");
            String admin_id = request.getParameter("adminId");
            
            admin loginBean = new admin();
            loginBean.setAdminEmail(adminEmail);
            loginBean.setAdminId(admin_id);
            
            adminDao loginDao = new adminDao();
            
            String userValidate = loginDao.authenticateUser(loginBean);
                
            if(userValidate.equals("SUCCESS"))
            {
                HttpSession session = request.getSession();
                session.setAttribute("adminId",admin_id);
                response.sendRedirect("adminHome.jsp"); 
            }
            else
            {
                request.setAttribute("errMessage", userValidate);
                response.sendRedirect("adminLogin.jsp");
            }

}
}