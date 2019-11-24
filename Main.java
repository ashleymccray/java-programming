/* This is a practice project. I have created a game that 
 * uses a ball to hit bricks.
 * Awais Mirza: Java Game Programming-Develop a Brick Breaker Game */


import javax.swing.JFrame;

import Brickgame.Gameplay;

public class Main {
//creates a simple frame for the game
	public static void main(String[] args) {
		JFrame obj = new JFrame ();
		Gameplay gamePlay = new Gameplay();
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Brick Ball");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);

	}

}

