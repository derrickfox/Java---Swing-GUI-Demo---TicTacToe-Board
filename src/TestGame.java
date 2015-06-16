import javax.swing.JFrame;

/* Derrick Fox
 * CS 213
 * TicTackToe.java
 * Homework 12
 * Tic Tac Toe GUI
 * April 14, 2014
 */


public class TestGame {
	public static void main(String[] args) {
		// Creates new frame
		TicTackToe frame = new TicTackToe();
		
		// Titles the new frame
		frame.setTitle("TicTackToe!");
		
		// Sets frame size in pixels 
		frame.setSize(300, 300);
		
		// Sets initial screen location 
		frame.setLocationRelativeTo(null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Allows the frame to be visible 
		frame.setVisible(true);
	}
}
