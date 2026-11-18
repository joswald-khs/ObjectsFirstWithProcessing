
/**
 * Write a description of class PCSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PCSystem {
    /**
     * Initializes inventory from a google doc CSV
     * Initializes recipe list from a google doc CSV
     */
    public PCSystem() {
        
    }
    
    /**
     * Creates a batch of a given recipe and puts it into a
     * container. 
     * 
     * This method can throw two different exceptions:
     * 
     * InsufficientInventoryException should be thrown if there aren't
     *   enough ingredients in the inventory to make the current Batch
     *   
     * NoAvailableContainerException should be thrown if the batch size 
     *   is greater than the container or if the container isn't clean.
     *   
     * If the recipe gets created, 
     * - the supplies from the inventory should be removed
     * - the Batch object should be added to the container
     * - the container should be marked as dirty
     */
    public void make( Batch batch, Container container ) {
        
    }
    
    /** 
     * Empties a container and marks it as dirty. 
     * 
     * Throws an InvalidArgumentException if the container is empty.
     * 
     * Returns the Batch object.
     */
    public Batch packageProduct( Container container ) {
        return null;
    }
    
    /**
     * Cleans a given container.
     * 
     * This method should mark the container as clean. 
     */    
    public void cleanContainer( Container container ) {
        
    }
    
    /**
     * Adds a given amount of an ingredient to the inventory.
     */
    public void addIngredient( Ingredient ingredient, double quantity ) {
        
    }
    
    /**
     * 
     * Throws an InvalidArgumentException if the lengths of ingredients
     *   and quantities don't match.
     */
    public void createRecipe( Ingredient[] ingredients, double[] quantities ) {
        
    }
}