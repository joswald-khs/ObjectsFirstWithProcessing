
/**
 * Write a description of class Tree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tree extends Plant {
   private double treeDiameter;
   
   public Tree (String treeColor, double diameter) {
      // super(treeColor);
      // this.leafColor = treeColor;
      super.setLeafColor(treeColor);
      this.treeDiameter = diameter;
   }
}