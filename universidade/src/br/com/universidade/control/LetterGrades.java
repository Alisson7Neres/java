package br.com.universidade.control;

import java.util.Scanner;

public class LetterGrades {

	public static void main(String[] args) {

		int total = 0; // soma das notas
		int gradeCounter = 0; // número de notas inseridas
		int aCount = 0; // contagem de notas A
		int bCount = 0; // contagem de notas B
		int cCount = 0; // contagem de notas C
		int dCount = 0; // contagem de notas D
		int fCount = 0; // contagem de notas F

		Scanner input = new Scanner(System.in);

		System.out.printf("%s%n%s%n %s%n %s%n", "Enter the integer grades in the range 0-100.",
				"Type the end-of-file indicator to terminate input:",
				"On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter", "On Windows type <Ctrl> z then press Enter");

		// Faz loop até o usuário inserir o indicador de fim de arquivo
		while (input.hasNext()) {
			int grade = input.nextInt(); // Lê a nota
			total += grade; // Adiciona nota a total
			++gradeCounter; // Incrementa o número de notas

			// Incrementa o contador de letras de nota adequado
			switch (grade / 10) {

			case 9: // A nota estava entre 90
			case 10: // E 100, inclusivo
				++aCount;
				break; // Sai do switch

			case 8: // Nota estava entre 80 e 89
				++bCount;
				break; // Sai do switch

			case 7: // Nota estava entre 70 e 79
				++cCount;
				break; // Sai do switch

			case 6: // Nota estava entre 60 e 69
				++dCount;
				break; // Sai do switch

			default: // A nota era menor que 60
				++fCount;
				break; // Opcional; fecha switch de qualquer maneira
			}
		}

		input.close();
		// exibe o relatório da nota
		System.out.printf("%nGrade Report:%n");

		// se usuário inseriu pelo menos uma nota...
		if (gradeCounter != 0) {
			// calcula a média de todas as notas inseridas
			double average = (double) total / gradeCounter;
			// gera a saída de resumo de resultados
			System.out.printf("Total of the %d grades entered is %d%n", gradeCounter, total);
			System.out.printf("Class average is %.2f%n", average);
			System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", "Number of students who received each grade:",
					"A: ", aCount,
					// exibe número de notas A
					"B: ", bCount,
					// exibe número de notas B
					"C: ", cCount,
					// exibe número de notas C
					"D: ", dCount,
					// exibe número de notas D
					"F: ", fCount); // exibe número de notas F
		} // fim do if
		else // nenhuma nota foi inserida, assim gera a saída da mensagem apropriada
			System.out.println("No grades were entered");
	}
	
}
