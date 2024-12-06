/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person.bus;

import java.time.LocalDateTime;

/**
 *
 * @author USER
 */
public class Bus {
    private String origin;
    private String destination;
    private LocalDateTime dates;
    private String bustype;
    private String seatnum;
    private String price;
    private int userid;
    
    public Bus()
    {
        origin = "";
        destination = "";
        dates = null;
        bustype = "";
        seatnum = "";
        price = "";
        userid = 0;
    }
    
    public Bus(String o, String d, LocalDateTime dat, String bt, String seat, String pricee, int user)
    {
        this.origin = o;
        this.destination = d;
        this.dates = dat;
        this.bustype = bt;
        this.seatnum = seat;
        this.price = pricee;
        this.userid = user;
    }
    
    public String getOrigin()
    {
        return origin;
    }
    
    public String getDestination()
    {
        return destination;
    }
    
    public LocalDateTime getDates()
    {
        return dates;
    }
    
    public String getBustype()
    {
        return bustype;
    }
    
    public String getPrice()
    {
        return price;
    }
    
    public int getUserid()
    {
        return userid;
    }
    
    public String getSeatnum()
    {
        return seatnum;
    }

    //setter
    public void setOrigin(String o)
    {
        this.origin = o;
    }
    
    public void setDestination(String d)
    {
        this.destination = d;
    }
    
    public void setDates(LocalDateTime dat)
    {
        this.dates = dat;
    }
    
    public void setBustype(String bus)
    {
        this.bustype = bus;
    }
    
    public void setSeatnum(String seat)
    {
        this.seatnum = seat;
    }
    
    public void setPrice(String p)
    {
        this.price = p;
    }
    
    public void setUserid(int user)
    {
        this.userid = user;
    }
    
    public void setCustomer(String o, String d, LocalDateTime dat, String bt, String seat, String pricee, int user)
    {
        this.origin = o;
        this.destination = d;
        this.dates = dat;
        this.bustype = bt;
        this.seatnum = seat;
        this.price = pricee;
        this.userid = user;
    }
}
