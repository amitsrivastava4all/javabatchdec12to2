import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstants {
	private Timer timer;
	int x = 100;
	int y = 100;
	int xSpeed = 3;
	int ySpeed = 2;
	GenerateRandom random;
	GenerateRandom colorRandom;
	GenerateRandom speedRandom;
	Ball balls[] = new Ball[MAX_BALL];
	
	private void loadBalls(){
		for(int i = 0; i<balls.length; i++){
			balls[i] = new Ball(random,colorRandom,speedRandom);
		}
	}
	
	private void paintBalls(Graphics g){
		for(Ball ball : balls){
			ball.drawBall(g);
			ball.move();
		}
	}
	
	private void gameLoop(){
		timer = new Timer(DELAY,(e)->repaint());
		timer.start();
	}
//	private void changeDirection(){
//		if(x>=(GWIDTH-70)){
//			xSpeed = -2;
//		}
//		
//		if(x<=0){	
//			xSpeed = 2;
//		}
//		if(y>=(GHEIGHT-70)){
//			ySpeed = -3;
//		}
//		
//		 if(y<=0)
//		{
//			ySpeed = 3;
//		}
//	}
//	private void  moveBall(){
//		x+=xSpeed;
//		y+=ySpeed;
//		changeDirection();
//		repaint();
//	}
public Board(){
	speedRandom = new GenerateRandom(20);
	random = new GenerateRandom(GWIDTH);
	colorRandom = new GenerateRandom(255);
	setSize(GWIDTH, GHEIGHT);
	setBackground(Color.BLACK);
	loadBalls();
	gameLoop();
}
@Override
public void paintComponent(Graphics g){
	super.paintComponent(g);
	paintBalls(g);
//	g.setColor(Color.YELLOW);
//	g.fillOval(x, y, 70, 70);
	
}
}
