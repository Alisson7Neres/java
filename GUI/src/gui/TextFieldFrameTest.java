package gui;

import javax.swing.JFrame;

public class TextFieldFrameTest {
	
	public static void main(String[] args) {
		
		TextFieldFrame textFieldFrame = new TextFieldFrame();
		textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textFieldFrame.setSize(350, 100);
		textFieldFrame.setVisible(true);
		textFieldFrame.setLocationRelativeTo(null);
	}

}
