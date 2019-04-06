
public class Program {

	public static void main(String[] args) {
		Cat cat = new Cat(false, "milk", 4, "black","Itamar");
		System.out.println("Cat is Vegetarian?" + cat.isVegetarian());
		System.out.println("Cat eats " + cat.getEats());
		System.out.println("Cat has " + cat.getNoOfLegs() + " legs.");
		System.out.println("Cat color is " + cat.getColor());
		System.out.println("Cat owner is " + cat.getOwner());
		System.out.println("=======================================================");
		
		Dog dog = new Dog(false, "meet", 2, "shitsu","Itamar");
		System.out.println("Dog is Vegetarian?" + dog.isVegetarian());
		System.out.println("Dog eats " + dog.getEats());
		System.out.println("Dog has " + dog.getNoOfLegs() + " legs.");
		System.out.println("Dog breed is " + dog.getBreed());
		System.out.println("Dog owner is " + cat.getOwner());

	}

}
