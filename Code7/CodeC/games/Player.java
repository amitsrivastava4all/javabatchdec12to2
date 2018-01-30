package com.brainmentors.games;

import java.awt.Graphics;

import javax.swing.ImageIcon;

import com.brainmentors.games.utils.GameConstants;

public class Player implements GameConstants {
	private int x;
	private int y;
	private int w;
	private int h;
	private ImageIcon image;
	private int speed ;
	private int force;
	private final int GRAVITY = 1;
	public void drawPlayer(Graphics g){
		g.drawImage(image.getImage(), x, y, w, h, null);
	}
	public void move(){
		x+=speed;
	}
	public Player(){
		speed = 0;
		x = 100;
		y = GROUND;
		w = h = 170;
		image = new ImageIcon(Player.class.getResource(PLAYER_IMG));
		
	}
	private boolean isJumpStart ;
	public void jump(){
		if(!isJumpStart){
		force = -20;
		y+=force;
		isJumpStart = true;
		}
	}
	
	public void fall(){
		if(y<GROUND){
		force = force + GRAVITY;
		y+=force;
		}
		if(y>=GROUND){
			isJumpStart =false;
		}
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
}
