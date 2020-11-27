
public class PizzaGrecStyleBrest extends Pizza {
	
	public PizzaGrecStyleBrest() {
		this.nom = "Pizza sauce style brest et grecque";
		this.garnitures.add("Parmigiano reggiano rap�");
	}
	
	@Override
	protected void couper() {
		super.couper();
		System.out.println("Decoupage en parts triangulaires");
	}

}
