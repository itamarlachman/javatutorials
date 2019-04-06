import java.util.Scanner;;

public class Ex5 {

	 //Execrcise_5: Read a a String and Check if it is a Palindrome.
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter a String to check if is a Palindrome:");
		
		String text = scanner.nextLine();
		String reversed = "";
		for (int i= text.length() - 1; i >= 0 ; i--) {
			reversed += text.charAt(i);
		}
		
		if (text.equals(reversed))
			System.out.println("The text: " + text + " is a palindrome.");
		else
			System.out.println("The text: " + text + " is not a palindrome.");
		
		scanner.close();
	}

}

