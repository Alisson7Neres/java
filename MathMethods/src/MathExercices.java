public class MathExercices {

	public static void main(String[] args) {
		

		hypotenuse(9,12);
		smallest(30,221,3230);
		intToFloat(10);

	}
	/*
	 * a) O método hypotenuse , que aceita dois argumentos de ponto flutuante de
	 * precisão dupla side1 e side2 e retorna um resultado de ponto flutuante de
	 * dupla precisão
	 */
	public static void hypotenuse(double side1, double side2) {
		System.out.printf("Calcular hipotenusa de %.0f e %.0f", side1, side2);
		System.out.println("\nx² = 9² 12²");
		double result = Math.pow(side1, 2) + Math.pow(side2, 2);
		System.out.printf("x² = %.0f", result);
		result = Math.sqrt(result);
		System.out.printf("%n",result);
	}
	// b) O método smallest , que recebe três inteiros x , y e z e retorna um
	// inteiro.
	public static void smallest(int x, int y, int z) {
		if(x > y) {
			int result = Math.min(x, y);
			System.out.println(result);
		} if(z > y) {
			int result = Math.min(z, y);
			System.out.println(result);
		} else if(y > x) {
			int result = Math.min(y, x);
			System.out.println(result);

		}
	}
	/*
	 * c) O método instructions , que não aceita nenhum argumento e não retorna um
	 * valor. [Observação: esses métodos são comumente utilizados para exibição de
	 * instruções para o usuário.]
	 */
	public static void instructions() {
		
	}
	
	// d) O método intToFloat , que recebe um argumento number do tipo inteiro e
	// retorna um float
	
	public static float intToFloat(int number) {
		System.out.println(number);
		return number;
	}
}
