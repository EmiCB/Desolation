package com.emicb.desolation.entity.mob;

import com.emicb.desolation.entity.Entity;
import com.emicb.desolation.graphics.Sprite;

public abstract class Mob extends Entity {
	
	protected Sprite sprite;
	protected int dir = 0;
	protected boolean moving = false;
	
	public void move() {
		
	}
	
	public void update () {
		
	}
	
	private boolean collision () {
		return false; 
	}
	
}