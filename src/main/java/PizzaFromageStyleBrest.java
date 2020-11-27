
public class PizzaFromageStyleBrest extends Pizza{
	
	public PizzaFromageStyleBrest() {
		this.nom = "Pizza sauce style brest et fromage";
		this.garnitures.add("Parmigiano reggiano rap�");
		
	}
	@Override
	protected void couper() {
		super.couper();
		System.out.println("Decoupage en parts triangulaires");
	}

}
