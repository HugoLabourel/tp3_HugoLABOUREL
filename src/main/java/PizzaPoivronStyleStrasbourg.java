
public class PizzaPoivronStyleStrasbourg extends Pizza {
	public PizzaPoivronStyleStrasbourg() {
		this.nom = "Pizza sauce style Strasbourg et poivrons";
		this.garnitures.add("Mozzarella en lamelles");

	}
	@Override
	protected void couper() {
		super.couper();
		System.out.println("Decoupage en parts carrees");
	}

}
