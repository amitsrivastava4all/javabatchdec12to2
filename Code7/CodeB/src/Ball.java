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
	private GenerateRandom speedRandom;
	public Ball(GenerateRandom random,GenerateRandom colorRandom, GenerateRandom speedRandom){
		x = random.getRandom();
		y = random.getRandom();
		h = w = 25;
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
}
