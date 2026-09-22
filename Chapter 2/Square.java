import processing.core.*;

/**
 * A circle that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kölling and David J. Barnes (original)
 * @author  Jason Oswald (adapted to PApplet)
 * @version 7.P.0
 */

public class Square extends Shape
{
    private int size;
    
    /**
     * Create a new circle at default position with default color.
     */
    public Square()
    {
        super();
        size = 60;
        xPosition = 310;
        yPosition = 120;
        fillColor = sketch.color(255,0,0);
    }

    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     */
    public void changeSize(int newSize)
    {
        size = newSize;
    }

    /**
     * Draw the circle with current specifications on screen.
     */
    public void draw()
    {
        move();
        
        if(isVisible) {
            sketch.fill(fillColor);
            sketch.square(xPosition, yPosition, size);            
        }
    }
    
    public void bounceOffEdges() {
        if( xPosition + size >= sketch.width || xPosition - size <= 0 ) {
            slowMoveHorizontal(-xMovement);
        }        
    }
}
