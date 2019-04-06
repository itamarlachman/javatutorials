
public class Program {

	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(1,2);
		MyPoint p2 = new MyPoint();
		MyPoint p3 = new MyPoint(p1);
		if (p1.equals(p3)) System.out.println("P1 equal to P3");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		if (p1.equals(p2)) System.out.println("P1 equal to P2");
		
		System.out.println("--------------------------");
		p2.setX(1);
		p2.setY(2);
		System.out.println(p1);
		System.out.println(p2);
		if (p1.equals(p2)) System.out.println("P1 equal to P2");
		
		MyCircle circle = new MyCircle(p1,4);
		System.out.println("Area: " + circle.getArea());
	}

}
