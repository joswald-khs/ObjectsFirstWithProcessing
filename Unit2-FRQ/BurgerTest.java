import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class BurgerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BurgerTest
{
    /**
     * Default constructor for test class BurgerTest
     */
    public BurgerTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() {}
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown(){}

    @Test
    public void simpleCreate()
    {
        Burger burger1 = new Burger("double burger", 5.75, true);
        assertEquals(5.75, burger1.getPrice(), 0.1);
        assertEquals("double burger", burger1.getName());
        assertEquals(true, burger1.getCheeseStatus());
        assertEquals("Thank you for visiting our food truck. Enjoy your double burger.", burger1.toString() );
    }

    @Test
    public void holdTheCheese()
    {
        Burger burger1 = new Burger("double burger", 5.75, true);
        burger1.setCheeseStatus(false);
        assertEquals(false, burger1.getCheeseStatus());
    }
}



