
/**
 * Write a description of class ReferencesExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReferencesExample
{
    public static void main() {
        Integer a = 127;
        Integer b = 127; 
        Integer c = 128;
        Integer d = 128;
        System.out.println( a == b );
        System.out.println( c == d );
    }
}