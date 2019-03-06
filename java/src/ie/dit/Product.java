package ie.dit;

import processing.data.TableRow;

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

    public void setPrice(float price)
    {
        this.price = price;
    }

    public float getprice()
    {
        return price;
    }

    public Product(TableRow row)
    {
        name = row.getString("Name");
        price = row.getFloat("Price");
    }
}