package main;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame window = new JFrame();
		window.setTitle("2D Adventure");
		window.setResizable(false);
		
		// This lets the window properly close when user clicks the close ("X") button
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);
		
		window.pack();
		
		// Not specify the location of the window = the window will be displayed at the center of the screen
		window.setLocationRelativeTo(null);
		
		window.setVisible(true);
		
		gamePanel.startGameTread();

	}

}
