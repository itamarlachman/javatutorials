public class Cat extends Pet {

	public Cat(String color, String ownerName,String petName) {
		super("Cat", color, ownerName, petName);
	}

	public void makeSound() {
		System.out.println("Meow Meow");
	}

}