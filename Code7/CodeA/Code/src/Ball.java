import java.awt.Color;
import java.awt.Graphics;

public class Ball implements GameConstants{
	
	private int x;
	private int y;
	private int h;
	private int w;
	private Color color;
	private int xSpeed ;
	private int ySpeed;
	private int size;
	private GenerateRandom speedRandom;
	public Ball(GenerateRandom random,GenerateRandom colorRandom, GenerateRandom speedRandom){
		x = random.getRandom();
		y = random.getRandom();
		
		this.size = speedRandom.getRandom() * 5;
		//h = w = this.size;
		h = w = 10;
		this.speedRandom = speedRandom;
		color = new Color(colorRandom.getRandom(), colorRandom.getRandom(), colorRandom.getRandom());
		xSpeed = speedRandom.getRandom();
		ySpeed = speedRandom.getRandom();
	}
	
	private void changeDirection(){
		if(x>=(GWIDTH-w)){
			xSpeed = -speedRandom.getRandom();
		}
		
		if(x<=0){	
			xSpeed = speedRandom.getRandom();
		}
		if(y>=(GHEIGHT-h)){
			ySpeed = -speedRandom.getRandom();
		}
		
		 if(y<=0)
		{
			ySpeed = speedRandom.getRandom();
		}
	}
	
	public void move(){
		
		x+=xSpeed;
		y+=ySpeed;
		changeDirection();
	}
	
	public void drawBall(Graphics g){
		g.setColor(color);
		g.fillOval(x, y, w, h);
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

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}

	public GenerateRandom getSpeedRandom() {
		return speedRandom;
	}

	public void setSpeedRandom(GenerateRandom speedRandom) {
		this.speedRandom = speedRandom;
	}
	
	
}
