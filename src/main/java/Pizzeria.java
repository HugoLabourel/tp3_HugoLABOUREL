
public abstract class Pizzeria {
	PizzaFactory PizzaFactory ;
	protected Pizza commanderPizza(String string) {
		
		
		Pizza instance = PizzaFactory.creerPizza(string);

		instance.preparer();
		instance.cuire();
		instance.couper();
		instance.emballer();

		return instance;
	}
	
}
