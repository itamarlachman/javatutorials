import java.util.ArrayList;

public class Hotel {
	
	ArrayList<Room> rooms;
	String name;
	
	public Hotel( String name) {
		super();
		this.name = name;
		this.rooms = new ArrayList<Room>();
		
		for(int i=1;i< 20;i++) {
			if ( i % 4 == 0)
				rooms.add(new Suite(i));
			else
				rooms.add(new Room(i));
		}
	}

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		String result = "";
		result += "Hotel Name: " + this.name + "\n";
		for(Room room: rooms) {
			result += room.toString() + "\n";
		}
		
		return result;
	}
	
	
	
	
	
	

}
