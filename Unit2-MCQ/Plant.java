
/**
 * Write a description of class Plant here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Plant {
   private String leafColor;

   public Plant(String leafColor) {
      this.leafColor = leafColor;
   }

   public void setLeafColor(String color) {
      leafColor = color;
   }
   
   public void calculate( int a, int b) {}
   public void calculate( int a, int b, int c) {}
   public void calculate( double a, double b ) {}
   public int calculate(int a, int b) {return 0;} 
}