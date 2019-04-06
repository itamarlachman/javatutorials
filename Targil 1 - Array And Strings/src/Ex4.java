import java.util.Scanner;;

public class Ex4 {


	//Execrcise_4: Read a number and check if it is a prime number.
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number.");
		
		int number = scanner.nextInt();
		
		for(int i = 2; i <= 9 ; i ++) {
			if (number % i == 0 ) {
				System.out.println("The number: " + number + " is not a prime number becuase it is divided by: " + i );
				scanner.close();
				return;
			}
		}
		
		System.out.println("The number: " + number + " is a prime number.");
		scanner.close();
	}
	


}
