package gui;

import javax.swing.JOptionPane;

public class Addition {
	
	public static void main(String[] agrs) {
		
		String firstNumber = JOptionPane.showInputDialog("Enter first integer");
		String secondNumber = JOptionPane.showInputDialog("Enter second integer");
		
		// Converter firstNumber e secondNumber para inteiros
		
		int number1 = Integer.parseInt(firstNumber);
		int number2 = Integer.parseInt(secondNumber);
		
		int sum = number1 + number2;
		
		JOptionPane.showMessageDialog(null, "The sum is: " + sum + ""+ JOptionPane.INFORMATION_MESSAGE);
	}

}
