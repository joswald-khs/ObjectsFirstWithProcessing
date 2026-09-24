import processing.core.*;

/**
 * Write a description of class Polygon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Polygon extends Shape {
    private int numberOfSides;
    private int size;
    private float rotation;
    
    public Polygon(int numberOfSides, int size ) {
        this.size = size;
        this.numberOfSides = numberOfSides;
        xPosition = sketch.width/2;
        yPosition = sketch.height/2;
        rotation = 0;
    }
    
    public void changeSize(int newSize) {
        size = newSize;
    }
    
    public void rotate(float theta) {
        rotation += theta;
    }
    
    public void draw() {    
        sketch.push();
        sketch.translate(xPosition,yPosition);
        sketch.rotate(rotation);
        sketch.beginShape();
        int sidesDrawn = 0;
        float theta = 0;
        float dTheta = sketch.TWO_PI / numberOfSides;
        while( sidesDrawn < numberOfSides ) {
            float xd = size * (float) Math.cos(theta); // x and y are 0
            float yd = size * (float) Math.sin(theta); // because of translate 
            sketch.vertex(xd,yd);
            sidesDrawn = sidesDrawn + 1;
            theta = sidesDrawn * dTheta;
        }
        sketch.endShape(sketch.CLOSE); 
        sketch.pop();
    }
}