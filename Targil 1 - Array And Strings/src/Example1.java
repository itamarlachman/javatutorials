
public class Example1 {
	// Example of a program that counts the total number that are divided by 7 from 1 to 50.
	public static void main(String[] args) {
		Integer counter = 0;
		System.out.println("----------------------------------------------------------------------");
		for(int i=1;i<=50;i++ ) {
			if (i % 7 == 0) {
				counter++;
				System.out.println(i);
			}
		}
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Total Numbers that are devided between 1 and 50 by 7 are: " + counter );
	}

}
