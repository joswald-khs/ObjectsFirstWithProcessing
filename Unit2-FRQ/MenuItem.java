
/**
 * A food truck has opened in the neighborhood. 
 *   The food truck menu includes a variety of 
 *   burgers, fries, salads, drinks, and milkshakes.
 *   Each menu item has a name and a price. The 
 *   MenuItem superclass is shown below. 
 *
 * @author Code.org
 * @version 20261001
 */
public class MenuItem {
    private String name;
    private double price;
    
    /** Constructs a MenuItem object with a name and a price */
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    /** Returns the name of the menu item */
    public String getName() { 
        // implementation not shown
        return this.name; // to compile
    }
    
    public double getPrice() {
        // implementation not shown
        return this.price;
    }
    
    // There may be instance variables, constructors, and methods not shown
}