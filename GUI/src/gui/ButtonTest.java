package gui;

import javax.swing.JFrame;

public class ButtonTest {
	
	public static void main(String[] args) {
		
		ButtonFrame buttonFrame = new ButtonFrame();
		buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttonFrame.setLocationRelativeTo(null);
		buttonFrame.setResizable(false);
		buttonFrame.setVisible(true);
		buttonFrame.setSize(275, 150);
	}

}
