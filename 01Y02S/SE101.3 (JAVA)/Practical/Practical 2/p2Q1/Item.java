package com.mycompany.p2q1;
public class Item
{
    private int location;
    private String description;
    
    public Item(int location,String description)
    {
        this.location=location;
        this.description=description;
    }
    public int getLocation()
    {
        return location;
    }
    public void setLocation(int location)
    {
        this.location=location;
    }
    public String getDescription()
    {
        return description;
    }
    public void setLocation(String description)
    {
        this.description=description;
    }
}
