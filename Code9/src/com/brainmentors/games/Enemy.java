package com.brainmentors.games;

import java.awt.Graphics;
import java.awt.Image;

public class Enemy {
	private int x;
	private int y;
	private int w;
	private int h;
	private Image image;
	private int speed;
	private int originalX;
	public Enemy(int x, int y, Image image, int speed){
		this.originalX = this.x = x;
		this.y = y;
		this.w = this.h = 50;
		this.image  = image;
		this.speed = speed;
	}
	public void move(){
		this.x +=speed;
		if(this.x<=0){
			this.x = this.originalX;
		}
	}
	public void drawEnemy(Graphics g){
		g.drawImage(image, x, y, w,h,null);
		move();
		//System.out.println("Draw Enenmy "+x + " "+y+" "+w+" "+h);
	}

}
