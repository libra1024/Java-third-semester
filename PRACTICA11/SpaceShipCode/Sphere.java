import java.awt.*;

public class Sphere {
	
	protected int x, y;
	
	public void setX(int newX) {
		this.x = newX;
	}
	
	public void setY(int newY) {
		this.y = newY;
	}
	
	public void display(Graphics paper) {
		paper.setColor(Color.black);
		paper.drawOval(x, y, 20, 20);
	}
	
	public int getX() {
		
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}