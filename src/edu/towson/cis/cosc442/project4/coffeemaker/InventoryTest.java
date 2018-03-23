package edu.towson.cis.cosc442.project4.coffeemaker;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>InventoryTest</code> contains tests for the class <code>{@link Inventory}</code>.
 *
 * @generatedBy CodePro at 3/22/18 8:49 PM
 * @author tyler
 * @version $Revision: 1.0 $
 */
public class InventoryTest {
	/**
	 * Run the Inventory() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 8:49 PM
	 */
	@Test
	public void testInventory_1()
		throws Exception {

		Inventory result = new Inventory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Coffee: 15\r\nMilk: 15\r\nSugar: 15\r\nChocolate: 15\r\n", result.toString());
		assertEquals(15, result.getCoffee());
		assertEquals(15, result.getChocolate());
		assertEquals(15, result.getMilk());
		assertEquals(15, result.getSugar());
	}

	/**
	 * Run the boolean enoughIngredients(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 8:49 PM
	 */
	@Test
	public void testEnoughIngredients_1()
		throws Exception {
		Inventory fixture = new Inventory();
		Recipe r = new Recipe();

		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean enoughIngredients(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 8:49 PM
	 */
	@Test
	public void testEnoughIngredients_2()
		throws Exception {
		Inventory fixture = new Inventory();
		Recipe r = new Recipe();

		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the int getChocolate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 8:49 PM
	 */
	@Test
	public void testGetChocolate_1()
		throws Exception {
		Inventory fixture = new Inventory();

		int result = fixture.getChocolate();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getCoffee() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 8:49 PM
	 */
	@Test
	public void testGetCoffee_1()
		throws Exception {
		Inventory fixture = new Inventory();

		int result = fixture.getCoffee();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getMilk() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 8:49 PM
	 */
	@Test
	public void testGetMilk_1()
		throws Exception {
		Inventory fixture = new Inventory();

		int result = fixture.getMilk();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getSugar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 8:49 PM
	 */
	@Test
	public void testGetSugar_1()
		throws Exception {
		Inventory fixture = new Inventory();

		int result = fixture.getSugar();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the void setChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 8:49 PM
	 */
	@Test
	public void testSetChocolate_1()
		throws Exception {
		Inventory fixture = new Inventory();
		int chocolate = -1;

		fixture.setChocolate(chocolate);

		// add additional test code here
	}

	/**
	 * Run the void setChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 8:49 PM
	 */
	@Test
	public void testSetChocolate_2()
		throws Exception {
		Inventory fixture = new Inventory();
		int chocolate = 1;

		fixture.setChocolate(chocolate);

		// add additional test code here
	}

	/**
	 * Run the void setCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 8:49 PM
	 */
	@Test
	public void testSetCoffee_1()
		throws Exception {
		Inventory fixture = new Inventory();
		int coffee = -1;

		fixture.setCoffee(coffee);

		// add additional test code here
	}

	/**
	 * Run the void setCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 8:49 PM
	 */
	@Test
	public void testSetCoffee_2()
		throws Exception {
		Inventory fixture = new Inventory();
		int coffee = 1;

		fixture.setCoffee(coffee);

		// add additional test code here
	}

	/**
	 * Run the void setMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 8:49 PM
	 */
	@Test
	public void testSetMilk_1()
		throws Exception {
		Inventory fixture = new Inventory();
		int milk = -1;

		fixture.setMilk(milk);

		// add additional test code here
	}

	/**
	 * Run the void setMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 8:49 PM
	 */
	@Test
	public void testSetMilk_2()
		throws Exception {
		Inventory fixture = new Inventory();
		int milk = 1;

		fixture.setMilk(milk);

		// add additional test code here
	}

	/**
	 * Run the void setSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 8:49 PM
	 */
	@Test
	public void testSetSugar_1()
		throws Exception {
		Inventory fixture = new Inventory();
		int sugar = -1;

		fixture.setSugar(sugar);

		// add additional test code here
	}

	/**
	 * Run the void setSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 8:49 PM
	 */
	@Test
	public void testSetSugar_2()
		throws Exception {
		Inventory fixture = new Inventory();
		int sugar = 1;

		fixture.setSugar(sugar);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 8:49 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Inventory fixture = new Inventory();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Coffee: 15\r\nMilk: 15\r\nSugar: 15\r\nChocolate: 15\r\n", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/22/18 8:49 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/22/18 8:49 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/22/18 8:49 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(InventoryTest.class);
	}
}