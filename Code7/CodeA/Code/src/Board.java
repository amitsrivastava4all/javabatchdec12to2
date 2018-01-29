import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

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
	//Ball balls[] = new Ball[MAX_BALL];
	ArrayList<Ball> balls = new ArrayList<>();
	private void loadBalls(){
		for(int i = 0; i<MAX_BALL; i++){
			//balls[i] = new Ball(random,colorRandom,speedRandom);
			balls.add(new Ball(random,colorRandom,speedRandom));
		}
	}
	
	private boolean collision(Ball firstBall , Ball secondBall){
		int xDistance = Math.abs(firstBall.getX() - secondBall.getX());
		int yDistance = Math.abs(firstBall.getY() - secondBall.getY());
		int maxW  = Math.max(firstBall.getW(), secondBall.getW());
		int maxH = Math.max(firstBall.getH(), secondBall.getH());
		return xDistance<=maxW && yDistance<=maxH;
	}
	
	private void checkForAllBalls(){
		if(balls.size()<1000){
		for(int i = 0; i<balls.size()-1; i++){
			for(int j = i + 1;j<balls.size(); j++){
				if(collision(balls.get(i), balls.get(j))){
					balls.get(i).setxSpeed(balls.get(i).getxSpeed() * -1);
					balls.get(i).setySpeed(balls.get(i).getySpeed() * -1);
					balls.get(j).setxSpeed(balls.get(j).getxSpeed() * -1);
					balls.get(j).setySpeed(balls.get(j).getySpeed() * -1);
					balls.add(new Ball(random,colorRandom,speedRandom));
					balls.add(new Ball(random,colorRandom,speedRandom));
				}
			}
		}
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
	speedRandom = new GenerateRandom(5);
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
	checkForAllBalls();
//	g.setColor(Color.YELLOW);
//	g.fillOval(x, y, 70, 70);
	
}
}
