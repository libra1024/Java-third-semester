
public class SpaceShip extends Sphere {
	
	public SpaceShip() {
		this.y = 150;
		this.x = 150;
	}
	
	public void moveUp(int up) {
		this.y = this.y - up; 
	}
	
	public void moveDown(int down) {
		this.y = this.y + down; 
	}

}
