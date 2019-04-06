import java.util.Scanner;

public class ClassMain {

	public static void main(String[] args) {
		System.out.println("Enter Number Of Atzert");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int result = Atzeret(number);
		System.out.println("Atzeret of " + number + " = " + result);
		
		int[] array = {1,2,3,4};
		print(array);

	}
	
	public static int Atzeret(int number) {
		if (number < 0) return 0;
		else if (number ==0) return 1;

		int result = 1;
		for (int i = 1; i <= number; i++) {
			result = result * i;
		}
			
		return result;
	}
	
	public static void print(int[] array) {
		System.out.println("arr");
	
	}

}
