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
	public void drawPlayer(Graphics g){
		g.drawImage(image.getImage(), x, y, w, h, null);
	}
	public Player(){
		x = 100;
		y = GROUND;
		w = h = 170;
		image = new ImageIcon(Player.class.getResource(PLAYER_IMG));
		
	}

}
