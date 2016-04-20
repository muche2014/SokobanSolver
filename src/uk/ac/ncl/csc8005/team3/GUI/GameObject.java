/**
 * 
 */
package sokoban;

/**
 * @author yqjapple
 *
 */

import java.awt.Graphics;


public abstract class GameObject {

	protected int x, y;
	
	
	public GameObject(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public abstract void update();
	
	public abstract void render(Graphics g);

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

	
}