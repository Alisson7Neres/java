package gui;

import javax.swing.JFrame;

public class KeyDemoFrameTest {
	
	public static void main(String[] args) {
		
		KeyDemoFrame frame = new KeyDemoFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setSize(350, 100);
	}

}
