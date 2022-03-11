package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
	
	// SCREEN SETTINGS
	final int originalTileSize = 16; // 16 pixels x 16 pixels
	final int scale = 3;
	
	final int titeSize = originalTileSize * scale; // 48x48 tile
	
	final int maxScreenColumn = 16;
	final int maxScreenRow = 12;
	final int screenWidth = titeSize * maxScreenColumn; // 768 pixels
	final int screenHeight = titeSize * maxScreenRow; // 576 pixels
	
	
	Thread gameThread;
	
	
	public GamePanel() {
		
		// Set the size of this class (JPanel)
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
	}
	
	
	public void startGameTread() {
		
		gameThread = new Thread(this);
		gameThread.start();
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
