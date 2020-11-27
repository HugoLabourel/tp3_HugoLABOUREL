
public class PizzaFactoryBrest extends PizzaFactory {
	static PizzaFactoryBrest instance = new PizzaFactoryBrest();
	public static PizzaFactoryBrest getInstance() {
		
		return instance;
		
	}
	
	public Pizza creerPizza(String type) {
		Pizza Pizza = null;
		if (type.equals("fromage")) {
			Pizza = new PizzaFromageStyleBrest();
		} else if (type.equals("poivron")) {
			Pizza = new PizzaPoivronStyleBrest();
		} else if (type.equals("grec")) {
			Pizza = new PizzaGrecStyleBrest();
		} 
		return Pizza;
	}



}
