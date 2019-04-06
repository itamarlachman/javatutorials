
public class MyPoint {
	private int x;
	private int y;

	public MyPoint() {
		x = 0;
		y = 0;

	}

	public MyPoint(int x1, int y1) {
		x = x1;
		y = y1;
	}
	
	public MyPoint(MyPoint other) {
		x = other.getX();
		y = other.getY();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyPoint) {
			MyPoint other = (MyPoint) obj;
			if (x == other.getX() && y == other.getY())
				return true;
			else
				return false;
		}
		return false;
	}

}
