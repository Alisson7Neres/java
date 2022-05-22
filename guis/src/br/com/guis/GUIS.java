package br.com.guis;

import javax.swing.JOptionPane;

public class GUIS {
	
	public static void main (String[] args) {
		
		String name = JOptionPane.showInputDialog("What is your name?");
		
		String message = 
				String.format("Welcome, %s, to Java Programming!", name);
		
		JOptionPane.showMessageDialog(null, message);
	}
}
