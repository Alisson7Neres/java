package classeString;

import java.io.IOException;

import javax.swing.JFrame;

public class JFileChooserTest {

	public static void main(String[] args) throws IOException{

		JFileChooserDemo application = new JFileChooserDemo();
		application.setSize(400, 400);
		application.setResizable(false);
		application.setVisible(true);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
