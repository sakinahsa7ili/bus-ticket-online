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
public class admin {
    private String adminId;
    private String adminEmail;
    
    public admin()
    {
        adminId = "";
        adminEmail = "";
    }
    
    public admin(String em, String p)
    {
        this.adminId = em;
        this.adminEmail = p;
    }
    
    public String getAdminId()
    {
        return adminId;
    }
    
    public String getAdminEmail()
    {
        return adminEmail;
    }

    //setter
    public void setAdminId(String n)
    {
        this.adminId = n;
    }
    
    public void setAdminEmail(String p)
    {
        this.adminEmail = p;
    }
    
    public void setAdmin(String em, String p)
    {
        this.adminId = em;
        this.adminEmail = p;
    }
}
