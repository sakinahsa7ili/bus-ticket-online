/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person.bus;

/**
 *
 * @author USER
 */
public class customer {
    private String username;
    private String password;
    private String email;
    
    public customer()
    {
        username = "";
        email = "";
        password = "";
    }
    
    public customer(String n, String em, String p)
    {
        this.username = n;
        this.email = em;
        this.password = p;
    }
    
    public customer(String em, String p)
    {
        this.email = em;
        this.password = p;
    }
    
    public String getUserName()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public String getEmail()
    {
        return email;
    }

    //setter
    public void setUserName(String n)
    {
        this.username = n;
    }
    
    public void setPassword(String p)
    {
        this.password = p;
    }
    
    public void setEmail(String em)
    {
        this.email = em;
    }
    
    public void setCustomer(String n, String em, String pass)
    {
        this.username = n;
        this.email = em;
        this.password = pass;
    }
}
