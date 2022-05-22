package gui;

import javax.swing.JFrame;

public class GridLayoutFrameTest {
	
	public static void main(String[] args) {
		
		GridLayoutFrame frame = new GridLayoutFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setSize(300,100);
	}
}
