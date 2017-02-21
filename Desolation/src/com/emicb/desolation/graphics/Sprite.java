package com.emicb.desolation.graphics;

public class Sprite {
	
	public final int SIZE;
	private int x, y;
	public int[] pixels;
	private SpriteSheet sheet;
	
	// Set sprites
	public static Sprite grass = new Sprite (32, 0, 0, SpriteSheet.tiles);
	
	// sets location of target sprite in sprite sheet
	public Sprite(int size, int x, int y, SpriteSheet sheet) {
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		this.x = x * size;
		this.y = y * size;
		this.sheet = sheet;
		load();
	}
	
	// loads spites | goes through all pixels in sprite
	private void load() {
		for (int y = 0; y < SIZE; y++)
			for (int x = 0; x < SIZE; x++) {
				pixels[x + y * SIZE] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.SIZE]; // targets where sprite will be
			}
	}
	
}