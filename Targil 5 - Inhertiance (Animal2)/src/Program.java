
public class Program {

	public static void main(String[] args) {
		Frog frog= new Frog("Green");
		System.out.println(frog);
		frog.makeSound();
		
		Cat cat = new Cat("White", "Tal" ,"Tuli");
		System.out.println(cat);
		cat.makeSound();
		
		Dog dog = new Dog("Black", "Avi", "Rexi");
		System.out.println(dog);
		dog.makeSound();

	}

}
