
public class Ex1 {

	public static void main(String[] args) {
		Point p = new Point(3, 1);
		System.out.println(p.getPoint());
		
		p.setX(0);
		p.setY(0);
		System.out.println(p.getPoint());
	}

}
