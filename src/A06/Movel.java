package A06;

public class Movel {
	private int x;
	private int y;
	private double maxSpeed;
	
	public Movel(int x, int y, double maxSpeed) {
		super();
		this.x = x;
		this.y = y;
		this.maxSpeed = maxSpeed;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void move(int newX, int newY) {
		dist(this.x, this.y, newX, newY);
		this.x = newX;
		this.y = newY;
	}
	
	private double dist(int iX, int iY, int nX, int nY) {
		return Math.sqrt(Math.pow((nX-iX), 2)+Math.pow((nY-iY), 2));
	}

	@Override
	public String toString() {
		return "Movel [x=" + x + ", y=" + y + ", maxSpeed=" + maxSpeed + "]";
	}
	
}
