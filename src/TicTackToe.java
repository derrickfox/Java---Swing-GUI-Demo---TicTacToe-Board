/* Derrick Fox
 * CS 213
 * TicTackToe.java
 * Homework 12
 * Tic Tac Toe GUI
 * April 14, 2014
 */

import javax.swing.*;
import java.awt.*;

public class TicTackToe extends JFrame{
	
	// Images for the game that represent "X" and "O"
	private ImageIcon x = new ImageIcon("x.gif");
	
	// ********************************
	// *****IMPORTANT******************
	// The Word document for our homework indicated that the file name
	// for "O" image was o.gif; however, I could not find a good "O" image
	// in GIF format and just using "o.gif" in the code did not work. 
	// This JPG still works so I hope it is acceptable. 
	private ImageIcon o = new ImageIcon("o.jpg");
	
	// Constructor that accepts no parameters 
	public TicTackToe() {
		
		// Set the dimensions of the grid for the GridLayout manager 
		setLayout(new GridLayout(3,3));
		
		// For loop that first generates a random number from 0 to 1
		// It is then truncated to the whole number of either 0 or 1
		// It then applies the appropriate icon to the give cell until the grid is filled.
		for (int i = 0; i < 9; i++) {
	        int play = (int) (Math.random() * 2.0);
	        
	        if (play == 0) {
	            add(new JLabel(x));
	        }
	        else if (play == 1) {
	            add(new JLabel(o));
	        }
	    }
	}
}


