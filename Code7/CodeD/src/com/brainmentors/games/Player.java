package com.brainmentors.games;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
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
	private int state ;
	private ArrayList<Bullet> bulletList = new ArrayList<>();
	private BufferedImage playerImage ;
	
	
	
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	private void loadPlayerSprite(){
		try {
			playerImage = ImageIO.read(Player.class.getResource(PLAYER_IMG));
			loadPunch();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Can't Load the Player... ");
			System.exit(0);
			//e.printStackTrace();
		}
	}
	BufferedImage punch[] = new BufferedImage[2];
	
	private void  drawPunch(Graphics g){
		
	}
	
	private void loadPunch(){
		
		punch[0] = playerImage.getSubimage(8,131,39,79);
		punch[1] = playerImage.getSubimage(57,133,51,79);
		/*punch[0] = playerImage.getSubimage(8,131,w,h);
		punch[0] = playerImage.getSubimage(8,131,w,h);
		punch[0] = playerImage.getSubimage(8,131,w,h);
		punch[0] = playerImage.getSubimage(8,131,w,h);
		
		*/
		
	}
	
	public void drawPlayer(Graphics g){
		if(this.getState()==PUNCH){
			drawPunch(g);
		}
		//Image playerSubImage = playerImage.getSubimage(8, 14, 41, 84);
		//g.drawImage(playerSubImage, 60, GROUND, w,h,null);
		//System.out.println("Player DRAW************************");
		//g.drawImage(image.getImage(), x, y, w, h, null);
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
		loadPlayerSprite();
		speed = 0;
		x = 50;
		y = GROUND;
		w = h = 40;
		//image = new ImageIcon(Player.class.getResource(PLAYER_IMG));
		
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
