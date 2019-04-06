import java.util.Scanner;

public class Ex1 {

	//Execrcise_1: Read an Integer and reverse its order.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a 3 digits number.");
		int num = scanner.nextInt();
		int output=100*(num%10);
		num=num/10;
		output+=10*(num%10);
		num=num/10;
		output+=num;		
		
		System.out.println("Reversed Number of " + num + " is: "+output);
		
		scanner.close();
	}
	

}
