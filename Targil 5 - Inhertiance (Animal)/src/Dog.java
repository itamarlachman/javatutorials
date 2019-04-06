
public class Dog extends Pet {
	private String breed;

	public Dog(boolean veg, String food, int legs,String owner) {
		super(veg, food, legs,owner);
		this.breed = "White";
	}

	public Dog(boolean veg, String food, int legs,String breed, String owner) {
		super(veg, food, legs,owner);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	} 
}
