package ie.dit;

import processing.data.TableRow;

public class Product
{
    private String name;
    private float price;

    //BigDecimal is used to store currency
    //Accessor
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }

    public float getPrice()
    {
        return price;
    }

    public String toString()
    {
        return name + "\t" + price;  
    }

    public Product(TableRow row)
    {
        name = row.getString("Name");
        price = row.getFloat("Price");
    }

    /*
    public Product(String name, float price)
    {
        private String name;
        private float price;
    }

    public Product(Table tr)
    {
        //Constructor chaining
        this(tr.getString("Name"), tr.getFloat("Price"));
    }
    */
}