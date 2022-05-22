package main;

import java.security.SecureRandom;

public class RandomIntegers {
	
	public static void main(String[] args) {
		
		// O objeto randomNumbers produzirá números aleatórios seguros
		SecureRandom randomNumbers = new SecureRandom();
		
		for(int counter = 1; counter <=20; counter++) {
			
			int face = 1 + randomNumbers.nextInt(6);
			
			System.out.printf("%d ", face);
			
			// Se o contador for divisível por 5, inicia uma nova linha de saída
			if(counter % 5 == 0)
				System.err.println();
		}
	}
}
