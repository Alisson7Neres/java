package gui;

import javax.swing.JFrame;

public class ListFrameTest {
	
	public static void main(String[] args) {
		
		ListFrame listFrame = new ListFrame();
		
		listFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		listFrame.setLocationRelativeTo(null);
		listFrame.setVisible(true);
		listFrame.setResizable(false);
		listFrame.setSize(300,150);
	}

}
