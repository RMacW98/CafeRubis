package ie.dit;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

//Name: Ross MacWilliam
//Student No. C17407712

public class CafeRubis extends PApplet
{
    public void settings()
    {
        size(800, 600);
    }

    public void setup()
    {
        
    }

    public void draw()
    {

    }
}

public class Product
{
    private String name;
    private float price;

    //Accessor
    public void setName(String name)
    {
        this.name = name;
    }

    public String getname()
    {
        return name;
    }

    public void setName(float price)
    {
        this.price = price;
    }

    public String getprice()
    {
        return price;
    }

    public product(TableRow row)
    {
        name = row.getString("Name");
        price = row.getFloat("price");
    }

    public ArrayList<Product> products = new ArrayList<products>();
    public ArrayList<Product> bill = new ArrayList<bill>();
}