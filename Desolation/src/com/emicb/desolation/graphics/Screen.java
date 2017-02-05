package com.emicb.desolation.graphics;

//TIP: Ctrl + Shift + O imports
//******************** Imports Things ********************
import java.util.Random;


public class Screen {
//******************** Sets Variables ********************
	private int width, height;
	public int[] pixels;
	
	// tile map size
	public final int MAP_SIZE = 64;
	public final int MAP_SIZE_MASK = MAP_SIZE - 1;
	public int[] tiles = new int[MAP_SIZE * MAP_SIZE];
	
	private Random random = new Random();
	
	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		// pixel array
		pixels = new int[width * height];
		
		for (int i = 0; i < MAP_SIZE * MAP_SIZE; i++) {
			tiles[i] = random.nextInt(0xffffff);
		}
	}
	
	// clears screen
	public void clear() {
		for (int i = 0; i  <pixels.length; i++) {
			pixels[i] = 0;
		}
	}
	
	public void render(int xOffset, int yOffset) {
		//fills in all pixels - for every y value, the entire row of x values fills up
		for (int y = 0; y < height; y++) {
			int yy = y + yOffset; // don't want to change y variable itself
			
			//if (yy < 0 || yy >= height) break;
			for (int x = 0; x < width; x++) {
				int xx = x + xOffset; // don't want to change x variable itself
				
				//if (xx < 0 || xx >= width) break;
				
				int tileIndex = ((xx >> 5) & MAP_SIZE_MASK) + ((yy >> 5) & MAP_SIZE_MASK) * MAP_SIZE; // finds tile that needs to be rendered in a certain position | tile size = 32 * 32 | x >> 5 = /32 because 2^5 = 32 | & signs = bitwise op (map loop)
				
				pixels [x + y * width] = tiles[tileIndex]; //tell pixel index which pixel to access
			}
		}
	}
}