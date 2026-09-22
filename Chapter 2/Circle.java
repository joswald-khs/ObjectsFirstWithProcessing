import processing.core.*;

/**
 * A circle that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kölling and David J. Barnes (original)
 * @author  Jason Oswald (adapted to PApplet)
 * @version 7.P.0
 */

public class Circle extends Shape
{
    private int diameter;
    
    /**
     * Create a new circle at default position with default color.
     */
    public Circle()
    {
        super();
        diameter = 68;
        xPosition = 230;
        yPosition = 90;
        fillColor = sketch.color(0,0,255);
    }

    /**
     * Make this circle visible. If it was already visible, do nothing.
     */
    
    
    /**
     * Make this circle invisible. If it was already invisible, do nothing.
     */
    
        public void changeSize(int newDiameter)
        {
            diameter = newDiameter;
        }
    /**
     * Draw the circle with current specifications on screen.
     */
    public void draw()
    {
        move();
        
        if(isVisible) {
            sketch.fill(fillColor);
            sketch.ellipse(xPosition, yPosition, diameter, diameter);            
        }
    }
    
    // public void move() { // add bouncing
        // super.move();        
        // bounceOffEdges();
    // }
    
    public void bounceOffEdges() {
        if( xPosition + diameter/2 >= sketch.width || xPosition - diameter/2 <= 0 ) {
            slowMoveHorizontal(-xMovement);
        }        
    }
    
   
}