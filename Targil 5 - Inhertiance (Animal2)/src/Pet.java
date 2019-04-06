
public class Pet  extends Animal {

	protected String ownerName;
	protected String petName;

	public Pet(String type ,String color, String ownerName,String petName) {
		super(type, color);
		this.ownerName = ownerName;
		this.petName=petName;
	}

	public String getOwner() {
		return ownerName;
	}

	public void setOwner(String owner) {
		this.ownerName = owner;
	}
	
	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	public String toString() {
		return super.toString()+", owner: "+this.ownerName+ ", pet name: "+ this.petName;
	}
	
}
