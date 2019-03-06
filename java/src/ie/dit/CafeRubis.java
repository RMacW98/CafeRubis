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
        loadData();
        // printProducts();
    }

    public void loadData()
    {
        Table table = loadTable("cafe.csv", "header");

        for(int i = 0 ; i < table.getRowCount() ; i ++) { 
            TableRow row = table.getRow(i);
            System.out.println(row.getString("Name"));
            System.out.println(row.getString("Price")); 
        }
    }

    public void draw()
    {

    }

    public ArrayList<Product> products = new ArrayList<Product>();
    public ArrayList<Product> bill = new ArrayList<Product>();
}