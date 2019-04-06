import java.util.ArrayList;

public class Hotel {

	private ArrayList<Room> rooms;
	private String name;
	private String city;
	private int floors;
	private int floorRooms;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public int getFloorRooms() {
		return floorRooms;
	}

	public void setFloorRooms(int floorRooms) {
		this.floorRooms = floorRooms;
	}

	public Hotel(String name, String city, int floors, int floorRooms) {
		super();

		this.name = name;
		this.city = city;
		this.floors = floors;
		this.floorRooms = floorRooms;
		this.rooms = new ArrayList<Room>();
		for (Integer i = 0; i < this.floors * this.floorRooms; i++) {
			Room room = new Room(i);
			this.rooms.add(room);
		}

	}

	public int getFreeRoomNumber() {
		int total = 0;
		for (int i = 0; i < rooms.size(); i++) 
			if (rooms.get(i).isOccupied() == false)
				total++;

		return total;
	}
	
	public void print() {
		for (int i = 0; i < rooms.size(); i++) 
			System.out.println(rooms.get(i));
	}
	
	public void setRoomStatus(int number,boolean occupied) {
		rooms.get(number).setOccupied(occupied);
	}
	
	/*
	private void setRoomStatus_1(int number,boolean occupied) {
		for(Room room: rooms) {
			if (room.getNumber().equals(number)) {
				room.setOccupied(occupied);
				return;
			}
		}
	}
	*/
}
