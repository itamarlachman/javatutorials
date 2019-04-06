import java.util.Scanner;


public class Ex2 {

	//Execrcise_2: (Read an Integer and summarize the Digits)
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number To Sum Digits:");
		
		//Integer number = scanner.nextInt();
		//String input = number.toString();
		
		String input=scanner.nextLine();
		
		Integer sum = 0;
		for (int i= 0; i < input.length() ; i++) {
			sum +=  Character.getNumericValue(input.charAt(i));
		}
		
		System.out.println("Total Numbers of " + input + " is: "+ sum);
		
		scanner.close();
	}
	


}
