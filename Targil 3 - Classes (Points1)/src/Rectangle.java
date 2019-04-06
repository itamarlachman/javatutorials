
public class Rectangle {
	
	public Point[] points = new Point[4];
	
	private int width;
	private int height;
	
	
	public int getWidth( ) {
		return width;	
	}
	
	public int getHeight( ) {
		return height;	
	}
	
	
	public Rectangle(Point[] points) {
		this.points = points;

		width = this.points[0].getX() - this.points[1].getX();
		if (width < 0)
			width = width * -1;
		
		height = this.points[0].getY() - this.points[2].getY();
		if (height < 0)
			height = height * -1;
	}
	
	public int getArea() {
		return width * height;
		
	}

	public int getPerimeter() {
		return 2 * (width + height);
		
	}

}
