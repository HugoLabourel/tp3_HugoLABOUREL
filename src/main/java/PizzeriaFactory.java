
public class PizzeriaFactory {

	static PizzeriaFactory instance = new PizzeriaFactory();
	
	public static PizzeriaFactory getInstance() {
		// TODO Auto-generated method stub
		return instance;
	}
	
	public Pizzeria creer(String type) {
		Pizzeria Pizzeria = null;
		if (type.equals("Brest")) {
			Pizzeria = new PizzeriaBrest();
		} else if (type.equals("Strasbourg")) {
			Pizzeria = new PizzeriaStrasbourg();
		
		}
		return Pizzeria;
	}


}


