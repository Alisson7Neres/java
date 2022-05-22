package gui;

import javax.swing.JFrame;

public class RadioButtonTest {

	public static void main(String[] args) {
		
		RadioButtonFrame radioButtonFrame = new RadioButtonFrame();
		radioButtonFrame.setLocationRelativeTo(null);
		radioButtonFrame.setResizable(false);
		radioButtonFrame.setVisible(true);
		radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		radioButtonFrame.setSize(350, 100);
	}
}
