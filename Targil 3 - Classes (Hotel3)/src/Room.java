
public class Room {
	protected int number;
	protected int price;
	protected String type;
	protected String accomodation;
	protected String refreshments;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAccomodation() {
		return accomodation;
	}
	public void setAccomodation(String accomodation) {
		this.accomodation = accomodation;
	}
	public String getRefreshments() {
		return refreshments;
	}
	public void setRefreshments(String refreshments) {
		this.refreshments = refreshments;
	}
		
	public Room(int number) {
		super();
		this.price = 450;
		this.number = number;
		this.type = "Room";
		this.refreshments = "2 Chocolates and bottle of wine ";
		this.accomodation = "1 Sleeping room 1 bathroom";
		
	}
	
	
	@Override
	public String toString() {
		return "Room [number=" + number + ", price=" + price + ", type=" + type + ", accomodation=" + accomodation
				+ ", refreshments=" + refreshments + "]";
	}
	
	
	

}
