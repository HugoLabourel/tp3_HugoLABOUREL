
public class PizzaFactoryStrasbourg extends PizzaFactory{
	static PizzaFactoryStrasbourg instance = new PizzaFactoryStrasbourg();
	
	public static PizzaFactoryStrasbourg getInstance() {
		
		return instance;
	}
	
	public Pizza creerPizza(String type) {
		Pizza Pizza = null;
		if (type.equals("fromage")) {
			Pizza = new PizzaFromageStyleStrasbourg();
		} else if (type.equals("poivron")) {
			Pizza = new PizzaPoivronStyleStrasbourg();
		} else if (type.equals("grec")) {
			Pizza = new PizzaGrecStyleStrasbourg();
		} 
		return Pizza;
	}
}
