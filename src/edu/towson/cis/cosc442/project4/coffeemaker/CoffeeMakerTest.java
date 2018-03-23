package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;

import junit.framework.TestCase;

/**
 *
 */
public class CoffeeMakerTest extends TestCase {
	private CoffeeMaker cm;
	private Inventory i;
	private Recipe r1;
	private Recipe r2;

	public void setUp() {
		cm = new CoffeeMaker();
		i = cm.checkInventory(); 

		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(6);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(0);
		
		cm.addRecipe(r1); 
	}
	
	public void checkOptions() {
		/**
		 * This would technically be a test case for Main.java which we aren't implementing, but 
		 * I added it here just because it was in the User Stories
		 */
		assertTrue(true);
	}

	public void testAddRecipe1() {
		assertTrue(cm.addRecipe(r1));
	}

	public void testDeleteRecipe1() {
		cm.addRecipe(r1);
		assertTrue(cm.deleteRecipe(r1));
	}

	public void testEditRecipe1() {
		cm.addRecipe(r1);
		Recipe newRecipe = new Recipe();
		newRecipe = r1;
		newRecipe.setAmtSugar(2);
		assertTrue(cm.editRecipe(r1, newRecipe));
	}
	
	public void testAddInventory1() {
		assertTrue(cm.addInventory(1, 1, 0, 1));
	}
	
	public void testCheckInventory() {
		assertEquals(cm.checkInventory(), i);
	}
	
	public void testPurchaseBeverage1() {
		assertEquals(cm.makeCoffee(r1, 50), 0); // assume purchase is made and no change is return 
	}
	
	public void testGetRecipe() { 
		//assertEquals(r1, cm.getRecipes());
		Recipe[] testRecipeArray;
		testRecipeArray = new Recipe[1];
		testRecipeArray[0] = r1;
		
		assertEquals(testRecipeArray, cm.getRecipes()); 
	} 
	
	public void testGetRecipeForName() {
		assertSame(r1, cm.getRecipeForName(r1.getName()));   
		
	}
	
	public void testGetRecipeForName2() {
		r2 = new Recipe();
		cm.addRecipe(r2);
		assertNotNull(r2); 
	}
}