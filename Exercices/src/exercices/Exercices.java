package exercices;

import java.lang.Math;
public class Exercices {

	public static void main(String[] args) {
  // a) Some os inteiros ímpares entre 1 e 99 utilizando uma instrução for . Assuma que as variáveis de inteiro sum e count foram declaradas.
	    
	    int impar = 1;
	    while(impar <= 100) {
	        System.out.printf("impar %d ", impar);
	        System.out.println();
	        impar += 2;
	    }
	    
  // b) Calcule o valor de 2.5 elevado à potência de 3 , utilizando o método pow .
	    
	    
	    double valor = Math.pow(2.5, 3);
	    System.out.println(valor);
	    
  /* c) Imprima os inteiros de 1 a 20, utilizando um loop while e a variável contadora i . Assuma que a variável i foi declarada, mas não foi
inicializada. Imprima apenas cinco inteiros por linha. [Dica: utilize o cálculo i % 5 . Quando o valor dessa expressão for 0, imprima
um caractere de nova linha; caso contrário, imprima um caractere de tabulação. Assuma que esse código é um aplicativo. Utilize o
método System.out.println () para imprimir o caractere de nova linha, e utilize o método System.out.print ('\t') para
imprimir o caractere de tabulação.] */
	    
	    int inteiros = 1;
	    while(inteiros <= 19) {
	    	
	    	System.out.print(inteiros);
	    	
	    	if(inteiros % 5 == 0) {
	    		System.out.println();
	    	} else {
	    		System.out.print('\t');
	    	}
	    	++inteiros;
	    		
	    }
	}
}
