import processing.core.*;
import processing.data.*;
import processing.event.*;
import processing.opengl.*;
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
    CircularClockDisplay clock;
    
    public void settings() {
        size(800,800);
        
    }
    
    public void setup() {
        ellipseMode(RADIUS);
        frameRate(30);
        clock = new CircularClockDisplay(width/2,height/2,width*0.4f);
    }
    
    public void draw() {
        background(128);
        clock.draw();
        if( frameCount % (30 * 60) == 0 ) {
            clock.tick();
        }
    }    
    
    // All of the following can be generally ignored
    private static Canvas canvasSingleton; 

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

    /**
     * An example of how to use the singleton pattern and Canvas
     */
    public static abstract class Shape {
        private static int NEXT_ID = 0;
        protected final Canvas sketch;
        
        public Shape() {
            sketch = Canvas.getCanvas();
        }   
        
        public abstract void draw();
    }
}