package gui;

import javax.swing.JFrame;

public class MultipleSelectionTest {
	
	public static void main(String[] args) {
		
		MultipleSelectionFrame frame = new MultipleSelectionFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(350, 150);
	}

}
