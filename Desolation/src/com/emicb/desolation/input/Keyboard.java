package com.emicb.desolation.input;

//TIP: Ctrl + Shift + O imports
//******************** Imports Things ********************
import java.awt.event.KeyEvent;

import java.awt.event.KeyListener;


public class Keyboard implements KeyListener {
//******************** Sets Variables ********************
	private boolean[] keys = new boolean[120];
	public boolean up, down, left, right;
	
	
	public void update() {
		// movement
		up = keys[KeyEvent.VK_UP] || keys[KeyEvent.VK_W];
		down = keys[KeyEvent.VK_DOWN] || keys[KeyEvent.VK_S];
		left = keys[KeyEvent.VK_LEFT] || keys[KeyEvent.VK_A];
		right = keys[KeyEvent.VK_RIGHT] || keys[KeyEvent.VK_D];
		
		// prints out key IDs in console
		for (int i = 0; i < keys.length; i++) {
			if (keys[i]) {
				System.out.println("KEY: " + i);
			}
		}
	}
	
	
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true; // sets key pressed = true
	}

	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false; // sets key pressed equal to false
	}

	public void keyTyped(KeyEvent e) {
		
	}

}