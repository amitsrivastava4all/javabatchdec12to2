package com.brainmentors.games;

import java.awt.Color;
import java.awt.Graphics;

public class Bullet {
	private int x;
	private int y;
	private int w;
	private int h;
	private int speed;
	public Bullet(int x, int y){
		this.x = x;
		this.y = y;
		this.w= this.h = 30;
		this.speed = 5;
	}
	public void drawBullet(Graphics g){
		g.setColor(Color.BLACK);
		g.fillOval(x, y, w, h);
		move();
	}
	
	public void move(){
		x+=speed;
	}
	

}
