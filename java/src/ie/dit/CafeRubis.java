package ie.dit;

import java.util.ArrayList;

import org.graalvm.compiler.hotspot.nodes.aot.PluginFactory_ResolveMethodAndLoadCountersStubCall;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

//Name: Ross MacWilliam
//Student No. C17407712

public class CafeRubis extends PApplet
{
    int selected = -1;

    public void settings()
    {
        size(800, 600);
    }

    public void setup()
    {
        loadData();
        printProducts();
    }

    public void loadData()
    {
        Table table = loadTable("cafe.csv", "header");

        // for(int i = 0 ; i < table.getRowCount() ; i ++) { 
        //     TableRow row = table.getRow(i);
        //     System.out.println(row.getString("Name"));
        //     System.out.println(row.getString("Price")); 
        // }

        for (TableRow row : table.rows()) {
            Product product = new Product(row);
            products.add(product);
        }

    }

    public void printProducts()
    {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void displayProducts()
    {
        int y = 100;
        int x = 20;

        for (Product product : products) {
            fill(255);
            rect(x, y, 200, 40);
            fill(0);
            textAlign(LEFT, CENTER);
            text(product.getName(), x + 10, y + 17);
            textAlign(RIGHT, CENTER);
            text(product.getPrice(), x + 150, y + 17);
            y = y + 65;
        }
    }


    float border = 20;
    float buttonWidth = 100;
    float buttonHeight = 50;
    float gap = 10;


    public void drawProductButtons()
    {
        

        for(int i = 0; i < products.size(); i++;)
        {
            Product p = products.get
            float y = border + (i * buttonHeight + gap);
            float x = border;

        }
    }

    public void displayBill()
    {
        int x = 400;
        int y = 100;

        textAlign(CENTER, CENTER);
        fill(255);
        rect(x, y, 250, 450);

        for (Product product : bill)
        {

        }

    }

    // which = (int) ((mouseY - border) / (buttonheight + gap))

    public void mouseClicked() {
        float x = 100;
        float y = 20;

        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);

            

            if (dist(mouseX, mouseY, x, y) ==  {
                if (selected == -1) {
                    selected = i;
                    System.out.println("Selected");
                }
            }
            y = y + 65;
        }
    }

    public void draw()
    {
        displayProducts();
        displayBill();
    }

    public ArrayList<Product> products = new ArrayList<Product>();
    public ArrayList<Product> bill = new ArrayList<Product>();
}