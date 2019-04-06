import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Enter Number of hotels: ");
		int number = scanner.nextInt();
		ArrayList<Hotel> hotels = new ArrayList<>();
		
		for (int i = 0; i < number; i++) {
			
			System.out.print("Enter Name of Hotel: ");
			String name = scanner.next();
			System.out.print("Enter City of Hotel: ");
			String city = scanner.next();
			System.out.print("Enter Number of Rooms: ");
			Integer rooms = scanner.nextInt();
			System.out.print("Enter Number of Free-Rooms: ");
			Integer free = scanner.nextInt();
			
			Hotel hotel = new Hotel(name,city,rooms,free);
			hotels.add(hotel);
		}
		
		for (int i = 0; i < hotels.size(); i++) {
			hotels.get(i).print();
		}
	}
}
