package com.emicb.desolation.level;

//TIP: Ctrl + Shift + O imports
//******************** Imports Things ********************
import com.emicb.desolation.graphics.Screen;


public class Level {

	protected int width, height;
	protected int[] tiles;
	
	public Level(int width, int height) {
		this.width = width;
		this.height = height;
		tiles = new int[width * height];
		generateLevel();
	}
	
	// directory of level
	public Level (String path){
		loadLevel(path);
	}

	protected void generateLevel() {
		
	}
	
	private void loadLevel(String path) {
		
	}
	
	public void update() {
		
	}
	
	// day/night cycles
	private void time() {
		
	}
	
	public void render(int xScroll, int yScroll, Screen screen) {
		
	}
}
