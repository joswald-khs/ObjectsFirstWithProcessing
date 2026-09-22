
/**
 * Write a description of class Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Shape extends Canvas.Shape {
    protected int xPosition;
    protected int yPosition;
    protected int fillColor;
    protected boolean isVisible = true;
    protected int xMovement = 0;
    protected int yMovement = 0;  
    
    public void makeVisible() { isVisible = true; }
    public void makeInvisible() { isVisible = false; }
    


    /**
     * Move the circle a few pixels to the right.
     */
    public void moveRight()
    {
        moveHorizontal(20);
    }

    /**
     * Move the circle a few pixels to the left.
     */
    public void moveLeft()
    {
        moveHorizontal(-20);
    }

    /**
     * Move the circle a few pixels up.
     */
    public void moveUp()
    {
        moveVertical(-20);
    }

    /**
     * Move the circle a few pixels down.
     */
    public void moveDown()
    {
        moveVertical(20);
    }

    /**
     * Move the circle horizontally by 'distance' pixels.
     */
    public void moveHorizontal(int distance)
    {
        xPosition += distance;
    }

    /**
     * Move the circle vertically by 'distance' pixels.
     */
    public void moveVertical(int distance)
    {
        yPosition += distance;
    }

    /**
     * Slowly move the circle horizontally by 'distance' pixels.
     */
    public void slowMoveHorizontal(int distance)
    {
        xMovement = distance;
    }

    /**
     * Slowly move the circle vertically by 'distance' pixels.
     */
    public void slowMoveVertical(int distance)
    {
        yMovement = distance;
    }

    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     */

    
    /**
     * Change the color. Valid colors are "red", "yellow", "blue", "green",
     * "magenta" and "black".
     */    
    public void changeColor(String newColor) {
        fillColor = getColor(newColor);        
    } 
    
    public void move() {
        if( xMovement > 0 ) {
            xPosition++;
            xMovement--;
        }
        if( xMovement < 0 ) {
            xPosition--;
            xMovement++;
        }        

        if( yMovement > 0 ) {
            yPosition++;
            yMovement--;
        }
        if( yMovement < 0 ) {
            yPosition--;
            yMovement++;
        } 
        
        bounceOffEdges();
    } 
    
    public void bounceOffEdges() {
        
    }

    /**
     * Erase the circle on screen.
     */
    protected void erase()
    {
        sketch.erase(this);
    }           
}