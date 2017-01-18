package com.emicb.desolation;

// imports things
import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Dimension;

public class Game extends Canvas implements Runnable
{
	// default Canvas serial
	private static final long serialVersionUID = 1L;
	
//******************** Sets Variables ********************
	// Sets game screen resolution
	public static int width = 300;
	public static int height = width / 16 * 9; // Sets resolution to a 16 * 9 ratio
	public static int scale = 3; // How much game will be scaled up to
	
	// Sets more variables
	private Thread thread; // Thread: process within a process
	private JFrame frame; // something to do with graphics (fix comment later)
	private boolean running = false; // indicates if program is running
	
	// constructor
	public Game()
	{
		// window display
		Dimension size = new Dimension(width * scale, height * scale);
		setPreferredSize(size); // applies window size
		
		frame = new JFrame();
	}
	
//******************** Game Start ********************
	public synchronized void start() // Synchronized: ensures there are no overlaps in instructions
	{
		running = true;
		thread = new Thread(this, "Display");
		thread.start();
	}

//******************** Game Stop ********************
	public synchronized void stop ()
	{
		running = false;
		try
		{
			thread.join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
//******************** Game Loop ********************
	// Run method (executed in game start)
	public void run()
	{
		while (running == true);
		{
			System.out.println("Running..."); // line to test run code
		}
	}
	
	// entry of program (game beginning)
	public static void main(String[] args)
	{
		Game game = new Game();
		game.frame.setResizable(false); // no resizing game window -> no graphical errors
		game.frame.setTitle("Desolation"); // sets window title
		game.frame.add(game); // fills window with something
		game.frame.pack(); // sets size
		game.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //terminate application when closed
		game.frame.setLocationRelativeTo(null); // sets window location to center
		game.frame.setVisible(true); // shows window
				
		game.start(); // starts game
	}
}