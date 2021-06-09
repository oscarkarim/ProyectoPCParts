/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConfiguradorPC;

/**
 *
 * @author Usuario
 */
class Cpu {
    private int cpuID,core_count;
    private double price;
    private String name,smt,integrated_graphics,tdp,boost_clock,core_clock;
    
    public Cpu(int cpuID,int core_count,double price, String name, String smt, String integrated_graphics, String tdp, String boost_clock, String core_clock)
    {
        this.cpuID=cpuID;
        this.core_count=core_count;
        this.price=price;
        this.name=name;
        this.smt=smt;
        this.integrated_graphics=integrated_graphics;
        this.tdp=tdp;
        this.boost_clock=boost_clock;
        this.core_clock=core_clock;
        
    }
    public int getcpuID(){
        return cpuID;
    }
    public int getcorecount(){
        return core_count;
    }
    public double getprice(){
        return price;
    }
    public String getname(){
        return name;
    }
    public String getsmt(){
        return smt;
    }
    public String getintegratedgraphics(){
        return integrated_graphics;
    }
    public String gettdp(){
        return tdp;
    }
    public String getboostclock(){
        return boost_clock;
    }
    public String getcoreclock(){
        return core_clock;
    }
}
