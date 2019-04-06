import java.util.Scanner;

public class Program {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter Name of Hotel: ");
		String name = scanner.next();
		System.out.println("Enter City of Hotel: ");
		String city = scanner.next();
		System.out.println("Enter Number of Floors: ");
		Integer floors = scanner.nextInt();
		System.out.println("Enter Number of Rooms Per Floor: ");
		Integer roomsPerFloor = scanner.nextInt();		
		
		Hotel hotel = new Hotel(name,city,floors,roomsPerFloor);
		System.out.println("Total Rooms Free: " + hotel.getFreeRoomNumber());
		
		System.out.println("Enter Room Number to Occupy ");
		Integer number = scanner.nextInt();
		hotel.setRoomStatus(number, true);
		
		System.out.println("Enter Room Number to Occupy ");
		number = scanner.nextInt();
		hotel.setRoomStatus(number, true);
		
		System.out.println("Total Rooms Free: " + hotel.getFreeRoomNumber());
		
		
		

	}

}
