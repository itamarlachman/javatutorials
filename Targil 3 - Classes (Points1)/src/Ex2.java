
public class Ex2 {

	public static void main(String[] args) {
		Point[] points = new Point[4];
		points[0] = new Point(10,10); //-- TOP LEFT (X-10,Y=10)
		points[1] = new Point(20,10); //-- TOP RIGHT (X=20,Y=10)
		points[2] = new Point(10,20); //-- BOTTOM LEFT (X=10,Y=20)
		points[3] = new Point(20,20); //-- BOTTOM RIGHT (X=20,Y=20)
		
		Rectangle r = new Rectangle(points);
		System.out.println("Rectangle Area: " + r.getArea());
		System.out.println("Rectangle Periemter: " + r.getPerimeter());
	}

}
