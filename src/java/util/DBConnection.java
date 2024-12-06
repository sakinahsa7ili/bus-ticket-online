/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class DBConnection {
    
    Connection con = null;
    public static Connection createConnection()
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
                    
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/customers",
                            "app","app");
                    
                    return con;
        }
        catch(SQLException | ClassNotFoundException e)
        {
            System.out.println(e);
            
            return null;
        }
        
    }
}
