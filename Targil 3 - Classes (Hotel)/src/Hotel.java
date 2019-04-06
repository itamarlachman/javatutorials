
public class Hotel {
	private String name;
	private String city;
	private Integer rooms;
	private Integer free;
		
	public Hotel() {
		super();
		this.name = "n/A";
		this.city = "n/A";
		this.rooms = 0;
		this.free = 0;
	}

	public Hotel(String name, String city, Integer rooms, Integer free) {
		super();
		this.name = name;
		this.city = city;
		this.rooms = rooms;
		this.free = free;
	}
	
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
	public Integer getRooms() {
		return rooms;
	}
	public void setRooms(Integer rooms) {
		this.rooms = rooms;
	}
	public Integer getFree() {
		return free;
	}
	public void setFree(Integer free) {
		this.free = free;
	}
	
	public void print() {
		String s = String.format("Hotel %s, In City %s, with Total Number of Rooms: %s of Them Free: %s", name,city,rooms,free);
		System.out.println(s);
	}
}
