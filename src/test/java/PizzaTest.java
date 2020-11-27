import static org.junit.Assert.*;

import org.junit.Test;


public class PizzaTest {
	
	/**
	 * Teste la ctéation des pizzerias
	 */
	@Test
	public void testCreationPizzeria() {
		Pizzeria pizzeriaUn = new PizzeriaBrest();
		Pizzeria pizzeriaDeux = new PizzeriaStrasbourg();
		Pizzeria pizzeriaTrois = new PizzeriaBrest();
		
		assertFalse(pizzeriaUn==null);
		assertFalse(pizzeriaDeux==null);
		assertFalse(pizzeriaUn==pizzeriaDeux);
		assertFalse(pizzeriaUn==pizzeriaTrois);
	}
	
	/**
	 * teste la commande de pizzas à Brest
	 */
	@Test
	public void testCommandePizzaBrest() {
		Pizzeria pizzeriaBrest = new PizzeriaBrest();
		Pizza pizzaF = pizzeriaBrest.commanderPizza("fromage");
		Pizza pizzaP = pizzeriaBrest.commanderPizza("poivron");
		Pizza pizzaG = pizzeriaBrest.commanderPizza("grec");
		
		
		assertEquals(pizzaF.getNom(),"Pizza sauce style brest et fromage");
		assertEquals(pizzaP.getNom(),"Pizza sauce style brest et poivrons");
		assertEquals(pizzaG.getNom(),"Pizza sauce style brest et grecque");
		
	}
	
	/**
	 * Teste la commande de pizzas à Strasbourg
	 */
	@Test
	public void testCommandePizzaStras() {
		Pizzeria pizzeriaStras = new PizzeriaStrasbourg();
		Pizza pizzaF = pizzeriaStras.commanderPizza("fromage");
		Pizza pizzaP = pizzeriaStras.commanderPizza("poivron");
		Pizza pizzaG = pizzeriaStras.commanderPizza("grec");
		
		
		assertEquals(pizzaF.getNom(),"Pizza sauce style Strasbourg et fromage");
		assertEquals(pizzaP.getNom(),"Pizza sauce style Strasbourg et poivrons");
		assertEquals(pizzaG.getNom(),"Pizza sauce style Strasbourg et grecque");
		
	}
	
	/**
	 * Teste la différence entre les pizzas de Brest et de Strasbourg
	 */
	@Test
	public void testPizzasBrestEtStras() {
		Pizzeria pizzeriaStras = new PizzeriaStrasbourg();
		Pizzeria pizzeriaBrest = new PizzeriaBrest();
		
		Pizza pizzaFB = pizzeriaBrest.commanderPizza("fromage");
		Pizza pizzaPB = pizzeriaBrest.commanderPizza("poivron");
		Pizza pizzaGB = pizzeriaBrest.commanderPizza("grec");
		Pizza pizzaFS = pizzeriaStras.commanderPizza("fromage");
		Pizza pizzaPS = pizzeriaStras.commanderPizza("poivron");
		Pizza pizzaGS = pizzeriaStras.commanderPizza("grec");
		
		assertNotEquals(pizzaFB,pizzaFS);
		assertNotEquals(pizzaPB,pizzaPS);
		assertNotEquals(pizzaGB,pizzaGS);

	}
	
	/**
	 * Teste la fabrique de pizzeria
	 * j'ai pas encore d'idée de comment la tester
	 */
	@Test 
	public void testPizzeriaFactory () {
		
	}
	
}
