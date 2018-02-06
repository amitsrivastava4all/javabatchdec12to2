package com.brainmentors.games;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.brainmentors.games.utils.GameConstants;

public class Camera implements GameConstants {
	private int x;
	private int y;
	private int w;
	private int h;
	BufferedImage image;
	int speed;
	public Camera(){
		x = 0;
		y = 0;
		w = GWIDTH;
		h = GHEIGHT;
		speed = 3;
		loadImage();
	}
	public void move(int i){
		x += speed * i;
	}
	private void loadImage(){
		try {
			image = ImageIO.read(Camera.class.getResource(BACK_GROUND));
		} catch (IOException e) {
			System.out.println("Unable to Load the BackGround...");
			System.exit(0);
		}
	}
	
	public void drawBackGround(Graphics g){
		Image subImage = image.getSubimage(x, y, w, h);
		
		g.drawImage(subImage, 0, 0, GWIDTH,GHEIGHT,null);
	}
	
	

}
