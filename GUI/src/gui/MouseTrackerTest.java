package gui;

import javax.swing.JFrame;

public class MouseTrackerTest {
	
	public static void main(String[] args) {
		MouseTrackerFrame frame = new MouseTrackerFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(350, 150);
	}

}
