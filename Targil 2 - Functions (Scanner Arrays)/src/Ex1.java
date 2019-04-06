import java.util.Scanner;

public class Ex1 {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Number:");
		int number = scanner.nextInt();
		int n = N(number);
		System.out.println("Total N(" + number + ") = " + n);
	}
	
	public static int N(int number) {
		if (number <= 0 )
			return 0;		
		int sum = 1;
		for(int i =1;i<= number;i++) {
			sum *= i;
		}	
		return sum;	
	}
}
