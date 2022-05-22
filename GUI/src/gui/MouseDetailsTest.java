package gui;

import javax.swing.JFrame;

public class MouseDetailsTest {
	
	public static void main(String[] args) {
		MouseDetailsFrame detailsFrame = new MouseDetailsFrame();
		detailsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		detailsFrame.setLocationRelativeTo(null);
		detailsFrame.setVisible(true);
		detailsFrame.setResizable(false);
		detailsFrame.setSize(300, 100);
	}

}
