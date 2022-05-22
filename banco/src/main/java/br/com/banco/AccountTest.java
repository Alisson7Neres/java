package br.com.banco;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class AccountTest {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Account account1 = new Account("Jane Green", 1750.00);
		Account account2 = new Account("John Blue", 5000.00);
		
		
		System.out.printf("%s balance: $ %.2f %n",
				account1.getName(), account1.getBalance() );
		System.out.printf("%s balance: $ %.2f %n%n",
				account2.getName(), account2.getBalance() );
		
		String depositDialog = JOptionPane.showInputDialog("Enter deposit amount for account1:");
		
		String message = String.format("adding %.2f to account1 balance for %s", Double.parseDouble(depositDialog), account1.getName()) ;
		
		account1.deposit(Double.parseDouble(depositDialog));
		
		JOptionPane.showMessageDialog(null, message);
		
		String messageTotal = String.format("Total account %s", account1.getBalance());
		
		JOptionPane.showMessageDialog(null, messageTotal);
		
		/*
		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount); // adiciona o saldo de account1
		
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance%n%n",
				depositAmount);
		account2.deposit(depositAmount); // adiciona ao saldo de account2
		
		System.out.printf("%s balance: $ %.2f %n",
				account1.getName(), account1.getBalance() );
				System.out.printf("%s balance: $ %.2f %n%n",
				account2.getName(), account2.getBalance() );
				*/
		input.close();
		
	}

}
