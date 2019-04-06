
public class MyCircle {
	private MyPoint center;
	private int radius;
	
	public MyCircle() {
		super();
		center = new MyPoint();
		this.radius = 0;
	}

	public MyCircle(MyPoint center, int radius) {
		super();
		this.center = new MyPoint(center);
		this.radius = radius;
	}
	
	public MyCircle(int x,int y, int radius) {
		super();
		this.center = new MyPoint(x,y);
		this.radius = radius;
	}
	
	public double getArea() {
		return this.radius * Math.PI * Math.PI ; 
	}
}
