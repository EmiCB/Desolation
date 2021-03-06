package com.emicb.desolation.level;

//TIP: Ctrl + Shift + O imports
//******************** Imports Things ********************
import com.emicb.desolation.graphics.Screen;
import com.emicb.desolation.level.tile.Tile;


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
	
	// xScroll & yScroll = player position (pixel specific)
	public void render(int xScroll, int yScroll, Screen screen) {
		screen.setOffset(xScroll, yScroll);
		// corner pins - define which area of the map to render
		int x0 = xScroll >> 5; // leftmost x
		int x1 = (xScroll + screen.width + 32) >> 5; // rightmost x
		int y0 = yScroll >> 5; // leftmost y
		int y1 = (yScroll + screen.height + 32) >> 5; // rightmost y
		
		// render from corner pins
		for (int y = y0; y < y1; y++) {
			for (int x = x0; x < x1; x++) {
				getTile(x, y).render(x, y, screen);
			}
		}
	}
	
	public Tile getTile(int x, int y) {
		// System.out.println(x + " " + y);
		if (x < 0 || y < 0 || x >= width || y >= height) return Tile.voidTile;
		if (tiles[x + y * width] == 0) return Tile.grass;
		return Tile.voidTile;	
	}
}
