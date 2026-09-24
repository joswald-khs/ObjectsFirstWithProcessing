import processing.core.*;
import processing.data.*;
import processing.event.*;
import processing.opengl.*;
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
        size(1000,800);
    }
    
    public void setup() {
        p = new Polygon(8,70);
    }
    
    public void draw() {
        background(128);        
        p.draw();        
    }
    
    public void keyPressed() {
        if( keyCode == RIGHT ) {
            p.moveHorizontal(3);
        }
        if( keyCode == LEFT ) {
            p.moveHorizontal(-3);
        } 
        
        if( key == '+' ) {
            p.changeNumberOfSides( p.getNumberOfSides() + 1 );
        }
        
        if( key == '-' ) {
            p.changeNumberOfSides( p.getNumberOfSides() - 1 );
        }        
    }

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
        
        public boolean equals(Object o) {
            if( this == o ) { return true; }
            
            if( o == null || getClass() != o.getClass() ) { return false; }
            
            Shape s = (Shape) o;
            return id == s.id;
        }
    }
}