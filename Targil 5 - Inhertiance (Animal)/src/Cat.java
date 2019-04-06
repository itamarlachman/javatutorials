public class Cat extends Pet {

	private String color;

	public Cat(boolean veg, String food, int legs, String owner) {
		super(veg, food, legs,owner);
		this.color = "White";
	}

	public Cat(boolean veg, String food, int legs, String color, String owner) {
		super(veg, food, legs,owner);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}