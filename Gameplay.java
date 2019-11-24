package Brickgame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;
import javax.swing.Action;
import javax.swing.JPanel;

public class Gameplay extends JPanel implements KeyListener, ActionListener {
	// start Game
	private boolean play = false; // don't autoplay
	private int score = 0; // start off at 0

	// number of bricks to start with
	private int totalBricks = 21;

	// how fast the ball should move
	private Timer time;
	private int delay = 8; // speed

	// starting position for slider
	private int playerX = 310;

	// starting position for ball x andy y
	private int ballposX = 120;
	private int ballposY = 350;

	// direction of the ball x and y
	private int ballXdir = -1;
	private int ballYdir = -2;

	public Gameplay() {

		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		Timer timer = new Timer(delay, this);
		timer.start();
	}

	public void paint(Graphics g) {
		// background
		g.setColor(Color.black);
		g.fillRect(1, 1, 692, 592); // position,, size, height

		// borders
		g.setColor(Color.yellow);
		g.fillRect(0, 0, 3, 592);
		g.fillRect(0, 0, 692, 3);
		g.fillRect(691, 0, 3, 592);

		// the paddle
		g.setColor(Color.green);
		g.fillRect(playerX, 550, 100, 8);

		// the ball
		g.setColor(Color.yellow);
		g.fillOval(ballposX, ballposY, 20, 20);
		
		g.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Timer timer = new Timer(delay, this);
		timer.start();
		repaint(); //continues to color the object after an action
		if (play) {
			ballposX+= ballXdir;
			ballposY+= ballYdir;
			if(ballposX <0) { //Top
				ballXdir = -ballXdir;
			}
			if(ballposY <0) { //Left
				ballYdir = -ballYdir;
			}
			if(ballposX <670) { //Bottom
				ballXdir = -ballXdir;
			}
		}
		
		repaint(); //repeat
	}
	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	// If right keyboard button is pressed
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			if (playerX >= 600) {
				playerX = 600;
			} else {
				moveRight();
			}
		}

		// If right keyboard button is pressed
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			if (playerX >= 10) {
				playerX = 10;
			} else {
				moveLeft();
			}
		}
	}

	public void moveRight() {
		play = true;
		playerX += 20;

	}

	public void moveLeft() {
		play = true;
		playerX -= 20;

	}

	

}
