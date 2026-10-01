
/**
 * Write a description of class Burger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Burger extends MenuItem {
    boolean withCheese;
    
    public Burger(String name, double price, boolean withCheese) {
        super(name,price);
        this.withCheese = withCheese;
    }
    
    public boolean getCheeseStatus() { return withCheese; }
    
    public void setCheeseStatus( boolean withCheese ) {
        this.withCheese = withCheese;
    }
    
    public String toString() { 
        return "Thank you for visiting our food truck. Enjoy your " + getName() + ".";
    }
}