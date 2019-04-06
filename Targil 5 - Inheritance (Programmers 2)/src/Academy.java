import java.util.ArrayList;

public class Academy {
	private ArrayList<Programmer> programmers;
	private TeamLeader leader ;
	
	public TeamLeader getLeader() {
		return leader;
	}

	public void setLeader(TeamLeader leader) {
		this.leader = leader;
	}

	private String name;
	
	public ArrayList<Programmer> getProgrammers() {
		return programmers;
	}
	
	public void setProgrammers(ArrayList<Programmer> programmers) {
		this.programmers = programmers;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Academy(String name) {
		super();
		this.name = name;
		this.programmers = new ArrayList<>();
	}
	
	
}
