package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class PaintPanelTest {
	
	public static void main(String[] args) {
		
	
	// cria o JFrame
	JFrame application = new JFrame("A simple paint program");
	
	PaintPanel panel = new PaintPanel();
	application.add(panel, BorderLayout.CENTER);
	
	// cria um rótulo e o coloca em SOUTH do BorderLayout
	application.add(new JLabel("Drag the mouse to draw"),
			BorderLayout.SOUTH);
	application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	application.setLocationRelativeTo(null);
	application.setResizable(false);
	application.setVisible(true);
	application.setSize(400, 200);

	}
}
