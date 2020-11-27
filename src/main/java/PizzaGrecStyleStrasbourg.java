
public class PizzaGrecStyleStrasbourg extends Pizza {
	public PizzaGrecStyleStrasbourg() {
		this.nom = "Pizza sauce style Strasbourg et grecque";
		this.garnitures.add("Mozzarella en lamelles");

	}
	@Override
	protected void couper() {
		super.couper();
		System.out.println("Decoupage en parts carrees");
	}


}
