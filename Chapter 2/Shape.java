
/**
 * The Shape Class extends Canvas.Shape to implement
 * functionality found in Chapter 1, but pared down
 * somewhat for cleaner development in Chapter 2.
 *
 * @author Jason Oswald 
 * @version 20260928
 */
public abstract class Shape extends Canvas.Shape {
    protected float xPosition;
    protected float yPosition;
    protected int fillColor;
    protected boolean isVisible = true;
    protected float xMovement = 0;
    protected float yMovement = 0;  
    
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
    public void moveHorizontal(double distance)
    {
        xPosition += distance;
    }

    /**
     * Move the circle vertically by 'distance' pixels.
     */
    public void moveVertical(double distance)
    {
        yPosition += distance;
    }         
}