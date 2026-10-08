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
 * @version 20261008
 */
public class Canvas extends PApplet {
    // Bouncer b1, b2, b3;
    Bouncer[] bouncers;
    
    public void settings() {
        size(800,800);
        
    }
    
    public void setup() {
        ellipseMode(RADIUS);
        bouncers = new Bouncer[30];
        for( int i = 0; i < bouncers.length; i++ ) {
            bouncers[i] = new Bouncer();
        }
        // bouncers[0] = new Bouncer();
        // bouncers[1] = new Bouncer();
        // bouncers[2] = new Bouncer();
        // bouncers = new Bouncer[] {new Bouncer(),new Bouncer(),new Bouncer()};
    }
    
    public void draw() {
        background(128);
        for( int i = 0; i < bouncers.length; i++ ) {
            bouncers[i].draw();
        }   
        for( int i = 0; i < bouncers.length - 1; i++ ) {
            Bouncer a = bouncers[i];
            // triangle loop
            for( int j = i + 1; j < bouncers.length; j++ ) {
                Bouncer b = bouncers[j];
                if( a.hittingOtherBouncer(b) ) {
                    a.bounceOff(b);
                }
            }
        }
        // bouncers[0].draw();
        // bouncers[1].draw();
        // bouncers[2].draw();

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
        protected final Canvas sketch;
        
        public Shape() {
            sketch = Canvas.getCanvas();
        }   
        
        public abstract void draw();
    }
}