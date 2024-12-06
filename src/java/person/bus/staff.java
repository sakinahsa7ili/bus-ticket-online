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
public class staff {
    private String staffUsername;
    private String staffId;
    private String staffEmail;
    
    public staff()
    {
        staffId = "";
        staffEmail = "";
    }
    
    public staff(String n, String em, String p)
    {
        this.staffUsername = n;
        this.staffEmail = em;
        this.staffId = p;
    }
    
    public String getStaffUsername()
    {
        return staffUsername;
    }
    
    public String getStaffId()
    {
        return staffId;
    }
    
    public String getStaffEmail()
    {
        return staffEmail;
    }

    //setter
    public void setStaffUsername(String n)
    {
        this.staffUsername = n;
    }
    
    public void setStaffId(String p)
    {
        this.staffId = p;
    }
    
    public void setStaffEmail(String em)
    {
        this.staffEmail = em;
    }
    
    public void setStaff(String n, String em, String p)
    {
        this.staffUsername = n;
        this.staffEmail = em;
        this.staffId = p;
    }
}
