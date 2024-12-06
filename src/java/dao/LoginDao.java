package dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import person.bus.customer;
import util.DBConnection;

/**
 *
 * @author USER
 */
public class LoginDao {
    
    public String authenticateUser(customer loginBean)
    {
        String email = loginBean.getEmail();
        String password = loginBean.getPassword();
        
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String emailDB = "";
        String passwordDB = "";
        
        try
        {
            con = DBConnection.createConnection();//Fetch database connection object
            statement = con.createStatement();//statement is used to write queries
            resultSet = statement.executeQuery("select * from users");
            while(resultSet.next())//until next row is present otherwise it return false
            {
                emailDB = resultSet.getString("email");
                passwordDB = resultSet.getString("password");
                
                if(email.equals(emailDB) && password.equals(passwordDB))
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
