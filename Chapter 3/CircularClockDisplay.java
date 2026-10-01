
/**
 * A Processing-based visual output for the Clock
 * class. What is displayed is a traditional round
 * clock with a minute hand and an hour hand. 
 *
 * @author Jason Oswald
 * @version 20260929
 */
public class CircularClockDisplay extends Canvas.Shape {
    private Clock clock;
    float x, y, r;
    private double dh;
    private double dm;
    private double minuteHandR;
    private double hourHandR;
    private double minuteTickR;
    private double hourTickR;
    private final double offset = -sketch.HALF_PI;
    
    public CircularClockDisplay( float x, float y, float r ) {        
        this(0,0,x,y,r);
    }
    
    public CircularClockDisplay( int h, int m, float x, float y, float r ) {
        clock = new Clock(h,m);
        this.x = x;
        this.y = y;
        this.r = r; 
        
        dh = sketch.TWO_PI / 12;
        dm = sketch.TWO_PI / 60;
        minuteHandR = this.r * 0.7;
        hourHandR = this.r * 0.45;
        minuteTickR = this.r * 0.9;
        hourTickR = this.r * 0.8;
    }
    
    public void draw() {
        sketch.noFill();
        sketch.strokeCap(sketch.SQUARE);
        sketch.strokeWeight(1);
        // circle
        sketch.circle(x,y,r);
        // minute hand (longer, thinner)
        sketch.line(x,y, 
            (float) (x + minuteHandR * Math.cos(clock.getMinute() * dm + offset)),
            (float) (y + minuteHandR * Math.sin(clock.getMinute() * dm + offset)));
        
        // hour hand (shorter, thicker)
        sketch.strokeWeight(4);        
        sketch.line(x,y, 
            (float) (x + hourHandR * Math.cos(clock.getHour() * dh + offset)),
            (float) (y + hourHandR * Math.sin(clock.getHour() * dh + offset)));        
        
        // hour ticks (12, longer)
        // minute ticks (60, shorter)
        
    }
    
    public void tick() {
        clock.tick();
    }
}