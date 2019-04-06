
public class Point {
	private int x;
	private int y;
	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int value) {
		x = value;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int value) {
		y = value;
	}
	
	public String getPoint() {
		return "Point(" +x + "," + y + ")";
	}
	
	
}
