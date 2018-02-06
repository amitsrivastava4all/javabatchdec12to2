package com.brainmentors.games;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.brainmentors.games.utils.GameConstants;

public class Board extends JPanel implements GameConstants {
	ArrayList<Enemy> enemyList = new ArrayList<>();
	ImageIcon bg ;
	Timer timer;
	Player player;
	Camera camera;
	
	private void drawBullets(Graphics g){
		ArrayList<Bullet> bulletList = player.getBulletList();
		for(Bullet bullet : bulletList){
			bullet.drawBullet(g);
		}
	}
	private void loadEnemies(){
		Image e1 = new ImageIcon(Board.class.getResource(ENEMY1)).getImage();
		Image e2 = new ImageIcon(Board.class.getResource(ENEMY2)).getImage();
		Image e3 = new ImageIcon(Board.class.getResource(ENEMY3)).getImage();
		enemyList.add(new Enemy(GWIDTH, GROUND-100, e1, -3));
		enemyList.add(new Enemy(GWIDTH + 500, GROUND-100, e2, -4));
		enemyList.add(new Enemy(GWIDTH + 900, GROUND-100, e3, -3));
		
	}
	
	private void gameLoop(){
		timer = new Timer(DELAY,(event)->{
			player.move();
			player.fall();
			repaint();
		});
		timer.start();
	}
	private void bindEvents(){
		this.addKeyListener(new KeyAdapter(){
			@Override
			public void keyReleased(KeyEvent e){
				player.setSpeed(0);
			}
			
			@Override
			public void keyPressed(KeyEvent e){
				
				int keyCode = e.getKeyCode();
				if(keyCode == KeyEvent.VK_F){
					int bulletX = player.getX()+(player.getW()/2);
					int bulletY = player.getY() + (player.getH()/2);
					Bullet b = new Bullet(bulletX, bulletY);
					player.addBullet(b);
					
				}
				if(keyCode == KeyEvent.VK_P){
					player.setState(GameConstants.PUNCH);
				}
				if(keyCode==KeyEvent.VK_SPACE){
					player.jump();
				}
				
				if(keyCode == KeyEvent.VK_RIGHT){
					camera.move(1);
					//player.setSpeed(5);
				}
				else
				if(keyCode==KeyEvent.VK_LEFT){	
					camera.move(-1);
					//player.setSpeed(-5);
				}
				//System.out.println("KeyCode is "+keyCode);
			}
		});
	}
	
	public void drawEnemies(Graphics g){
		for(Enemy e : enemyList){
			
			e.drawEnemy(g);
		}
	}
	
	public Board(){
		player =new Player();
		camera = new Camera();
		setSize(GWIDTH,GHEIGHT);
		bg = new ImageIcon(Board.class.getResource(BACK_GROUND));
		setFocusable(true);
		bindEvents();
		loadEnemies();
		gameLoop();
	}
	private void drawBg(Graphics g){
		g.drawImage(bg.getImage(), 0, 0, null);
	}
	@Override
	public void paintComponent(Graphics g){
		camera.drawBackGround(g);
		//drawBg(g);
		player.drawPlayer(g);
		drawEnemies(g);
		drawBullets(g);
	}

}
