import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		
		Academy academy = new Academy("Academic Tel Aviv Yafo");
		academy.getProgrammers().add(new Programmer("0289776521", "guy avivi", "guy.avivi@gmail.com", "1234", "098873434"));
		academy.getProgrammers().add(new Programmer("0289776521", "tel amir", "tal.amir@gmail.com", "1234", "036491667"));
		academy.getProgrammers().add(new Programmer("4421209323", "liron dolphin", "liron.d@gmail.com", "1234", "036491667"));
		academy.setLeader(new TeamLeader("011923434", "ayal carmi", "ayal.carmi@gmail.com", "1234", "9838434"));
		
		academy.getProgrammers().get(0).writeCode("Main", "System.out.println('hello world');");
		academy.getProgrammers().get(1).writeCode("Main", "var c = 2;");
		academy.getProgrammers().get(2).writeCode("Main", "for(int i=0;i<10;i++) {} ");

		academy.getLeader().moveToProduction("Main");

		Academy emek = new Academy("Emek Israel");
		emek.getProgrammers().add(new Programmer("07364545", "liat serin", "liat.serin@gmail.com", "1234", "098873434"));
		emek.getProgrammers().add(new Programmer("0289776521", "tel amir", "tal.amir@gmail.com", "1234", "036491667"));
		emek.setLeader(new TeamLeader("1243545", "tal ofek", "tal.ofek@gmail.com", "1234", "9838434"));
		
		emek.getProgrammers().get(0).writeCode("Main", "System.out.println('hello world');");
		emek.getProgrammers().get(1).writeCode("Main", "var c = 2;");
		emek.getProgrammers().get(1).writeCode("Main", "for(int i=0;i<10;i++) {} ");

		emek.getLeader().moveToProduction("Main");

		
	}
}
