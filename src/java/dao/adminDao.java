/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import person.bus.admin;
import util.DBConnection;

/**
 *
 * @author USER
 */
public class adminDao {
    public String authenticateUser(admin loginBean)
    {
        String adminEmail = loginBean.getAdminEmail();
        String admin_id = loginBean.getAdminId();

        String adminemailDB = "s7kinah@gmail.com";
        String adminIdDB = "kikilala";
                
                if(adminEmail.equals(adminemailDB) && admin_id.equals(adminIdDB))
                { 
                    return "SUCCESS";
                }else
            

        return "Invalid user credentials";
    }
}
