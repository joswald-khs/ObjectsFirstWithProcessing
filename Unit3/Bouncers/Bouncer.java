
/**
 * A Bouncer moves around a Processing canvas and interacts
 * with the walls and other bouncers. 
 *
 * @author Jason Oswald
 * @version 20261008
 */
public class Bouncer extends Canvas.Shape {
    float x, y; // position
    float dx, dy; // velocity
    float r;
    
    public Bouncer() {
        x = sketch.random(0, sketch.width);
        y = sketch.random(0, sketch.height);
        dx = sketch.random(-1,1);
        dy = sketch.random(-1,1);
        r = sketch.random(10,20);
    }
    
    public void draw() {
        sketch.circle(x,y,r);
        x += dx;
        y += dy;
        if( hittingLR() ) {
            dx *= -1;
        }
        if( hittingTB() ) {
            dy *= -1;
        }
    }
    
    public float getX() { return x; }
    public float getY() { return y; }
    public float getR() { return r; }
    public float getDX() { return dx; }
    public float getDY() { return dy; }
    
    public void setDX( float newDX ) { dx = newDX; }
    public void setDY( float newDY ) { dy = newDY; }
    
    public boolean hittingOtherBouncer( Bouncer other ) {
        return sketch.dist( x, y, other.getX(), other.getY() ) < r + other.getR();
    }
    
    public void bounceOff( Bouncer other ) {
        // dx = DX ... before: dx = 5, DX = 3... after: dx = 3, DX = 3
        // DX = dx ... before: dx = 3, DX = 3... after: dx = 3, DX = 3
        float tempDX = dx;
        float tempDY = dy;
        dx = other.getDX();
        dy = other.getDY();
        other.setDX( tempDX );
        other.setDY( tempDY );
    }
    
    private boolean hittingLR() {
        return x - r < 0 || x + r > sketch.width;
    }
    
    private boolean hittingTB() {
        return y - r < 0 || y + r > sketch.height;
    }
}