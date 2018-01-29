package com.brainmentors.games;

import javax.swing.JFrame;

import com.brainmentors.games.utils.GameConstants;

public class GameFrame extends JFrame implements GameConstants {

	public GameFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(GWIDTH,GHEIGHT);
		setTitle(TITLE);
		setLocationRelativeTo(null);
		setResizable(false);
		Board board = new Board();
		add(board);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameFrame obj = new GameFrame();

	}

}
