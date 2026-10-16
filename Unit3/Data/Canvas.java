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
    Student[] students;
    
    public void settings() {
        size(800,800);
        
    }
    
    public void setup() {
        try {
            students = Student.createStudentArrayFromFiles("student_data.txt","gpa_data.txt");
        }
        catch (java.io.IOException ioe) {
            ioe.printStackTrace();
        }
        noLoop();
    }
    
    public void draw() {
        background(128);
        float w = width/students.length;
        for( int i = 0; i < students.length; i++ ) {
            float y = map((float) students[i].getGPA(),0,4,height,0);
            String name = students[i].getName();
            circle( w/2 + w * i,y, name.length() );
            // text( students[i].getName(), w/2 + w * i,y);
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
        protected final Canvas sketch;
        
        public Shape() {
            sketch = Canvas.getCanvas();
        }   
        
        public abstract void draw();
    }
}