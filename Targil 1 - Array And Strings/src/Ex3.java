import java.util.Scanner;

public class Ex3 {

	//Execrcise_3: Read an string and reverse its order.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number to Reverse:");
		String input = scanner.nextLine();
		String output = "";
		for (int i= input.length() - 1; i >= 0 ; i--) {
			output += input.charAt(i);
		}
		
		System.out.println("Reversed Number of " + input + " is: "+output);
		
		scanner.close();
	}
	

}