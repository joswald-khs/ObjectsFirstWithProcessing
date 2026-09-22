import processing.core.*;

/**
 * A circle that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kölling and David J. Barnes (original)
 * @author  Jason Oswald (adapted to PApplet)
 * @version 7.P.0
 */

public class Triangle extends Shape
{
    private int height;
    private int width;
    
    /**
     * Create a new circle at default position with default color.
     */
    public Triangle()
    {
        super();
        height = 60;
        width = 70;
        xPosition = 310;
        yPosition = 120;
        fillColor = sketch.color(0,255,0);
    }

    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     */
    public void changeSize(int newHeight, int newWidth)
    {
        height = newHeight;
        width = newWidth;
    }
    

    /**
     * Draw the circle with current specifications on screen.
     */
    public void draw()
    {
        move();
        
        if(isVisible) {
            sketch.fill(fillColor);
            sketch.triangle(
                xPosition, yPosition,
                xPosition + (width/2), yPosition + height,
                xPosition - (width/2), yPosition + height                
            );            
        }
    }
    
}
