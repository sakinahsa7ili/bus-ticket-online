package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import person.bus.staff;
import util.DBConnection;

/**
 *
 * @author USER
 */
public class staffDao {
    
    public String authenticateUser(staff loginBean)
    {
        String staffemail = loginBean.getStaffEmail();
        String staff_id = loginBean.getStaffId();
        
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String firstCharacters = staff_id.substring(0,3);
        String staffemailDB = "";
        String staffIdDB = "";
        
        try
        {
            con = DBConnection.createConnection();//Fetch database connection object
            statement = con.createStatement();//statement is used to write queries
            resultSet = statement.executeQuery("select * from staff");
            while(resultSet.next())//until next row is present otherwise it return false
            {
                staffemailDB = resultSet.getString("staff_email");
                staffIdDB = resultSet.getString("staffid");
                
                if(staffemail.equals(staffemailDB) && staff_id.equals(staffIdDB) || firstCharacters.equals("stf"))
                { 
                    return "SUCCESS";
                }
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return "Invalid user credentials";
    }
}
