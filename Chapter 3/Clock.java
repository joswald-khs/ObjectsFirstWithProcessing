
/**
 * Write a description of class ClockDisplay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Clock {
    private NumberWheel hours;
    private NumberWheel minutes;
    
    public Clock() {
        this(0,0);
    }
    
    public Clock(int hour, int minute) {
        hours = new NumberWheel(24);
        minutes = new NumberWheel(60);
        setTime(hour,minute);
    }
    
    public void setTime(int hour, int minute) {
        hours.setValue(hour);
        minutes.setValue(minute);
    }
    
    public void tick() {
        minutes.increment();
        if( minutes.getValue() == 0 ) {
            hours.increment();
        }
    }
    
    public int getHour() { return hours.getValue(); }
    public int getMinute() { return minutes.getValue(); }
}