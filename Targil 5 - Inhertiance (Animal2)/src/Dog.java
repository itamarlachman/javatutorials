
public class Dog extends Pet {

	public Dog(String color, String ownerName,String petName) {
		super("Dog", color, ownerName, petName);
	}

	public void makeSound() {
		System.out.println("Woof Woof");
	}
}
