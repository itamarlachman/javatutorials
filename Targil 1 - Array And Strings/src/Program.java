import java.math.BigInteger;
import java.util.*;

public class Program {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Exercises: 1-6
		Execrcise_1(); // Read an Integer and revert order
		Execrcise_2(); // Read an Integer and summarize the Digits
		Execrcise_3(); // Read a String and Revert String
		Execrcise_4(); // Read a a Number and Check if it is a Prime number
		Execrcise_5(); // Read a a String and Check if it is a Palindrome
		
		// Write To Console:
		System.out.print("Program Finished");
	}

	/**
	 * Execrcise_1: (Read an Integer and revert order)
	 */
	public static void Execrcise_1() {
		System.out.println("Enter a Number to Reverse:");
		Integer number = scanner.nextInt();
		String text = number.toString();
		String result = "";
		for (int i= text.length() - 1; i >= 0 ; i--) {
			result += text.charAt(i);
		}
		
		System.out.println("Reversed Number of " + text + " is:");
		System.out.println(result);
	}
	
	/**
	 * Execrcise_1: (Read an Integer and summarize the Digits)
	 */
	public static void Execrcise_2() {
		System.out.println("Enter a Number To Sum Digits:");
		Integer number = scanner.nextInt();
		String text = number.toString();
		Integer total = 0;
		for (int i= 0; i < text.length() ; i++) {
			total +=  Integer.parseInt(String.valueOf(text.charAt(i)));
		}
		
		System.out.println("Total Numbers of " + text + " is:");
		System.out.println(total);
	}
	
	/**
	 * Execrcise_3: (Read a String and Revert String)
	 */
	public static void Execrcise_3() {
		System.out.println("Enter a String to Revert:");
		String text = scanner.next();
		String revert = "";
		for (int i= text.length() - 1; i >= 0 ; i--) {
			revert += text.charAt(i);
		}
		
		System.out.println("Total Numbers of " + text + " is:");
		System.out.println(revert);
	}
	
	/**
	 * Execrcise_4: (Read a a Number and Check if it is a Prime number)
	 */
	public static void Execrcise_4() {
		System.out.println("Enter a Number to check if is a Prime:");
		scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		for(int i = 2; i <= 9 ; i ++) {
			if (number % i == 0 ) {
				System.out.println("This number: " + number + " is Not a Prime Number becuase it can be divided by: " + i );
				return;
			}
		}
		
		System.out.println("This number: " + number + " Is a Prime Number ");
	}
	
	/**
	 * Execrcise_5: (Read a a String and Check if it is a Palindrome)
	 */
	public static void Execrcise_5() {
		System.out.println("Enter a String to check if is a Palindrome:");
		scanner = new Scanner(System.in);
		String text = scanner.next();
		String reversed = "";
		for (int i= text.length() - 1; i >= 0 ; i--) {
			reversed += text.charAt(i);
		}
		
		if (text.equals(reversed))
			System.out.println("This text: " + text + " Is a Palindrome");
		else
			System.out.println("This text: " + text + " Is NOT a Palindrome");
	}

}
