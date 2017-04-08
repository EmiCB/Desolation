package com.emicb.desolation.entity;

//TIP: Ctrl + Shift + O imports
//******************** Imports Things ********************
import java.util.Random;

import com.emicb.desolation.graphics.Screen;
import com.emicb.desolation.level.Level;

public abstract class Entity {
	
	public int x, y;
	private boolean removed = false; // is it removed from the level? no
	protected Level level;
	protected final Random random = new Random();
	
	public void update() {
		
	}
	
	public void render(Screen screen) {
		
	}
	
	public void remove() {
		// remove from level
		removed = true;
	}
	
	// checks if it's removed
	public boolean isRemoved() {
		return removed;
	}
	
}
