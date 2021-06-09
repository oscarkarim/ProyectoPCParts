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
class Laptop {
    private int laptopID;
    private double price;
    private String name,gpu,storage,cpu,memory,resolution,screen_size;
    
    public Laptop(int laptopID,double price, String name,String gpu,String storage,String cpu,String memory,String resolution,String screen_size)
    {
        this.laptopID=laptopID;
        this.price=price;
        this.name=name;
        this.gpu=gpu;
        this.storage=storage;
        this.cpu=cpu;
        this.memory=memory;
        this.resolution=resolution;
        this.screen_size=screen_size;
    }
    public int getlaptopID(){
        return laptopID;
    }
    public double getprice(){
        return price;
    }
    public String getname(){
        return name;
    }
    public String getgpu(){
        return gpu;
    }
    public String getstorage(){
        return storage;
    }
    public String getcpu(){
        return cpu;
    }
    public String getmemory(){
        return memory;
    }
    public String getresolution(){
        return resolution;
    }
    public String getscreen_size(){
        return screen_size;
    }
}
