package br.com.universidade.control;

import java.util.Scanner;
public class ClassAverage {
	
	public static void main(String[] args) {
		
		// Cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		// Fase de inicialização
		int total = 0; // Inicializa a soma das notas inseridas pelo usuário
		int gradeCounter = 1; // Inicializa n da nota a ser inserido em seguida
		
		System.out.print("Enter grade or -1 to quit: ");
		int grade = input.nextInt();
		
		while(grade != -1) {
			
			total += grade;
			gradeCounter ++;
			
			System.out.printf("Enter grade or -1 to quit: %d ", gradeCounter);
			grade = input.nextInt();
		}
		if ( gradeCounter != 0 )
		{
		// usa número com ponto decimal para calcular média das notas
		double average = (double) total / gradeCounter;
		// exibe o total e a média (com dois dígitos de precisão)
		System.out.printf("%nTotal of the %d grades entered is %d%n",
		gradeCounter, total);
		System.out.printf("Class average is %.2f%n", average);
		}
		else // nenhuma nota foi inserida, assim gera a saída da mensagem apropriada
		System.out.println("No grades were entered");
		input.close();
	}
	

}
