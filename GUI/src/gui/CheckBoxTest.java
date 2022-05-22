package gui;

import javax.swing.JFrame;

public class CheckBoxTest {

	public static void main(String[] args) {
		
		CheckBoxFrame checkBoxFrame = new CheckBoxFrame();
		checkBoxFrame.setLocationRelativeTo(null);
		checkBoxFrame.setResizable(false);
		checkBoxFrame.setVisible(true);
		checkBoxFrame.setSize(275, 100);
		checkBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
