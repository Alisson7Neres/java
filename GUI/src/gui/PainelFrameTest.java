package gui;

import javax.swing.JFrame;

public class PainelFrameTest {
	
	public static void main(String[] args) {
		
		PanelFrame frame = new PanelFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(650,150);
	}

}
