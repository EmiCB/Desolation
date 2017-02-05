package com.emicb.desolation.graphics;

//******************** Code Start ********************
public class Screen 
{
//******************** Sets Variables ********************
	private int width, height;
	public int [] pixels;
	
	public Screen(int width, int height)
	{
		this.width = width;
		this.height = height;
		// pixel array
		pixels = new int[width * height];
	}
	
	public void render()
	{
		//fills in all pixels - for every y value, the entire row of x values fills up
		for (int y = 0; y < height; y++)
		{
			for (int x = 0; x < width; x++)
			{
				pixels [x+y*width] = 0xff00ff; //tell pixel index which pixel to access
			}
		}
	}
}
