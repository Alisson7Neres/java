package gui;

import javax.swing.JFrame;

public class FlowLayoutFrameTest {
	
	public static void main(String[] args) {
		
		FlowLayoutFrame frame = new FlowLayoutFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setSize(300, 100);
	}

}
