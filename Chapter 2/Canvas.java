import processing.core.*;
import processing.data.*;
import processing.event.*;
import processing.opengl.*;
import java.util.List;
import java.util.ArrayList;
/**
 * An extension of Processing's PApplet using the
 * singleton pattern.
 * 
 * Write your code in Processing's settings, setup, draw,
 * and event handler methods as usual. Classes outside of 
 * this class need to access the singleton instance using
 * something like:
 * 
 * sketch = Canvas.getCanvas();
 * 
 * to access Processing methods. 
 *
 * @author Jason Oswald
 * @version 20260928
 */
public class Canvas extends PApplet {
    private static Canvas canvasSingleton; 
    Polygon p;

    public static void main(String[] args){
        String[] processingArgs = {"Canvas"};
        PApplet.runSketch(processingArgs, Canvas.getCanvas());
    }    
    
    public static Canvas getCanvas() {
        if( canvasSingleton == null ) {
            canvasSingleton = new Canvas();
        }
        return canvasSingleton;
    }
    
    public Canvas() {
        super();
    }
    
    public void settings() {
        size(500,300);
    }
    
    public void setup() {
        p = new Polygon(8,70);
    }
    
    public void draw() {
        background(128);
        p.draw();
    }
    
    public void keyPressed() {
        if( keyCode == UP ) {
            p.moveVertical(-2);
        }
        //... build out movement in other directions using same pattern
        if( key == 'm' ) {
            p.toggleAutonomousMovement();
        }
    }
    
    public void mouseClicked() {
        p.toggleSpin();        
    }

    /**
     * An example of how to use the singleton pattern and Canvas
     */
    public static abstract class Shape {
        private static int NEXT_ID = 0;
        protected final Canvas sketch;
        protected final int id;      
        
        public Shape() {
            sketch = Canvas.getCanvas();
            id = NEXT_ID;
            NEXT_ID++;
        }   
        
        public abstract void draw();
    }
}