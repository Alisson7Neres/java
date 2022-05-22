package br.com.banco;

public class Interest {

	public static void main(String[] args) {
		
		double amount;	// Quantia em depósito ao fim de cada ano;
		double princial = 1000.0; // Quantidade incial antes dos juros
		double rate = 0.05;	// Taxa de juros
		
		// Exibe cabeçalhos
		System.out.printf("%s%20s %n", "Year", "Amount on deposit");
		for(int year = 1; year <= 10; ++year) {
			amount = princial * Math.pow(1.0 + rate, year);
			
			System.out.printf("%4d%,20.2f%n", year, amount );
		}
	}
}
