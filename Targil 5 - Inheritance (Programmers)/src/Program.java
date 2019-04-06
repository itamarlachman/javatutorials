import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		
		ArrayList<Programmer> programmers = new ArrayList<Programmer>();
		
		programmers.add(new Programmer("0289776521", "guy avivi", "guy.avivi@gmail.com", "1234", "098873434"));
		programmers.add(new Programmer("8267233434", "aviv tal", "avi.tal@gmail.com", "1234", "098873434"));
		programmers.add(new Programmer("0289776521", "tel amir", "tal.amir@gmail.com", "1234", "036491667"));
		
		TeamLeader leader = new TeamLeader("011923434", "ayal carmi", "ayal.carmi@gmail.com", "1234", "9838434");
		
		programmers.get(0).writeCode("Main", "System.out.println('hello world');");
		programmers.get(1).writeCode("Main", "var c = 2;");
		programmers.get(2).writeCode("Main", "for(int i=0;i<10;i++) {} ");
		
		leader.moveToProduction("Main");
		
		
	}
}
