import java.util.Scanner;

public class Ex3 {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		getGrades();

	}
	
	public static void getGrades() {
		int[] grades = new int[10];
		for(int i = 0 ; i< grades.length;i ++) {
			System.out.println("Enter Grade for Grade No." + i);
			grades[i] = scanner.nextInt();
		}

		System.out.println("List of Grades above 90:");
		for(int i = 0 ; i< grades.length;i ++) {
			if (grades[i] > 90) {
				System.out.println(grades[i]);
			}
		}
	}
}
