
public class Pet  extends Animal {

	private String owner;


	public Pet(boolean veg, String food, int legs, String owner) {
		super(veg, food, legs);
		this.owner = owner;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
}
