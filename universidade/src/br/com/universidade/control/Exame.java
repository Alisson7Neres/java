package br.com.universidade.control;

import java.util.Scanner;

public class Exame {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int exame = 1;
		int cont = 1;
		int aprovado = 0;
		int reprovado = 0;
		int media = 0;
		
		while(cont <= 10) {
			System.out.printf("Aluno %d: ", cont);
			exame = input.nextInt();
			
			if(exame == 1) {
				aprovado += exame;
				media += 1;
			} if(exame == 2) {
				reprovado += 1;
			} else if(media >= 8) {
				System.out.println("Bonus to instructor");
			}
			
			cont++;
			
			if(cont >= 11) {
				System.out.printf("Foram aprovados %d", aprovado);
				System.out.printf("%nForam reprovados %d", reprovado);
			}
			
		}
		
		input.close();
	}

}
