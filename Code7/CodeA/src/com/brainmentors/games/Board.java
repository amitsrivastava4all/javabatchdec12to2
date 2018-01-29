package com.brainmentors.games;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.brainmentors.games.utils.GameConstants;

public class Board extends JPanel implements GameConstants {
	ImageIcon bg ;
	Timer timer;
	Player player;
	private void gameLoop(){
		timer = new Timer(DELAY,(event)->{
			repaint();
		});
		timer.start();
	}
	
	public Board(){
		player =new Player();
		setSize(GWIDTH,GHEIGHT);
		bg = new ImageIcon(Board.class.getResource(BACK_GROUND));
		gameLoop();
	}
	private void drawBg(Graphics g){
		g.drawImage(bg.getImage(), 0, 0, null);
	}
	@Override
	public void paintComponent(Graphics g){
		drawBg(g);
		player.drawPlayer(g);
	}

}
