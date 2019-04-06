
public class Room {
	private Integer number;
	private Integer floor;
	private boolean occupied;
	
	public Integer getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Integer getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public boolean isOccupied() {
		return occupied;
	}
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	
	public Room() {
		super();
		this.number = 0;
		this.floor = 0;
		this.occupied = false;
	}
	
	public Room(Integer number) {
		super();
		this.number = number;
		this.occupied = false;
		
		if (this.number < 100)
			this.floor = 1;
		else {
			char s =this.number.toString().charAt(0);
			this.floor = (int) s;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Room " + number + ",Floor:" +floor + ",Occupied" + (occupied == true ? "Yes": "No");
	}
	
}
