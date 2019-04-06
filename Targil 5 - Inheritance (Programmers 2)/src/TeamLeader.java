
public class TeamLeader extends Programmer {
	public TeamLeader(String id, String name, String email, String password, String tel) {
		super(id, name, email, password, tel);
	}
	
	public void moveToProduction(String module) {
		System.out.println("Moved to production: " + module );
	}
}
