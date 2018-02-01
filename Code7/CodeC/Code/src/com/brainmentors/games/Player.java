package com.brainmentors.games;

import java.awt.Graphics;
import java.util.ArrayList;

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
	private ArrayList<Bullet> bulletList = new ArrayList<>();
	public void drawPlayer(Graphics g){
		g.drawImage(image.getImage(), x, y, w, h, null);
	}
	
	public void addBullet(Bullet bullet){
		bulletList.add(bullet);
	}
	
	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
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

	public ArrayList<Bullet> getBulletList() {
		return bulletList;
	}

	public void setBulletList(ArrayList<Bullet> bulletList) {
		this.bulletList = bulletList;
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
