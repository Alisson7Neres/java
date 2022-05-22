package exercices;

import java.util.ArrayList;

public class Array {

	// a) Declare uma constante ARRAY_SIZE que é inicializada como 10.
	 final static int ARRAY_SIZE = 10;

	 // b) Declare um array com ARRAY_SIZE elementos do tipo double e os
	 // inicializecomo 0 .
	 double[] fractions = new double[ARRAY_SIZE];
	 
	public static void main(String[] args) {


		// c) Referencie o elemento 4 do array.
		int[] array = { 1, 2, 3, 4, 5, 6 };
		System.out.printf("%d", array[4]);

		// d) Atribua o valor 1.667 ao elemento 9 do array.
		double[] array2 = { 83, 23, 13, 75, 98, 32, 45, 78, 12, 56, 78 };
		System.out.println(array2[9]);
		array2[9] = 1.667;
		System.out.println(array2[9]);

		// e) Atribua o valor 3.333 ao elemento 6 do array.
		double[] array3 = { 83, 23, 13, 75, 98, 32, 45, 78, 12, 56, 78 };
		System.out.println(array3[6]);
		array3[6] = 3.333;
		System.out.println(array3[6]);

		// f) Some todos os elementos do array, utilizando uma instrução for . Declare a
		// variável inteira x como uma variável de controle para o loop.
		int[] array4 = { 83, 23, 13, 75, 98, 32, 45, 78, 12, 56, 78 };
		int soma = 0;
		for (int x = 0; x < array4.length; x++) {
			soma += array4[x];
		}
		System.out.println(soma);

		// a) Declare e crie o array como um array de inteiros que tem três linhas e
		// três colunas. Suponha que a constante ARRAY_SIZE foi decla-rada como 3 .
		int[][] arrayBidimensional = new int[ARRAY_SIZE][ARRAY_SIZE];

		// b) Quantos elementos o array contém?
		System.out.println(arrayBidimensional.length -1);
	}
}
