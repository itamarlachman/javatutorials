
public class Suite extends Room {

	public Suite(int number) {
		super(number);
		
		price = 900;
		type = "Suite";
		accomodation += " and 1 Reception and 1 Meeting";
		refreshments += " and 1 Champagne";
		
	}

	public Suite(int number, String accomodation, String refreshments) {
		super(number);
		this.price = 900;
		this.type = "Suite";
		this.accomodation += accomodation;
		this.refreshments += refreshments;
		
	}

}
