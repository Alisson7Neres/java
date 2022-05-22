package br.com.guis;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest {
	
	public static void main(String[] args) {
		
		// Obtém a escolha do usuário
		String input = JOptionPane.showInputDialog(
				"Enter 1 to draw rectangles\n" + 
				"Enter 2 to draw ovals"
				);
		
		int choice = Integer.parseInt(input); // Converte a entrada em int
		
		// Cria o painel com a entrada do usuário
		Shapes panel = new Shapes(choice);
		
		JFrame application = new JFrame(); // Cria um novo JFrame
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300, 300);
		application.setVisible(true);
	}

}
