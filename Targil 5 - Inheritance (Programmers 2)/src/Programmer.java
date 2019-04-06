
public class Programmer extends Worker {

	public Programmer(String id, String name, String email, String password, String tel) {
		super(id, name, email, password, tel);
	}
	
	public void writeCode(String module,String code) {
		System.out.println("Code written: " + code + " for module: " + module );
	}

}
