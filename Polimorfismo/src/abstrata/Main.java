package abstrata;

public class Main {
	
	public static void main(String[] args) {
		Programador programador = new Programador();
		Designer designer = new Designer();
		
		programador.salario = 1300; 
		System.out.println("Calculando reajuste programador");
		programador.Reajustar();
		System.out.println("Novo salário: " + programador.salario);
		
		designer.salario = 1100;
		System.out.println("Calculando reajuste designer");
		designer.Reajustar();
		System.out.println("Novo salário: " + designer.salario);
		
	}

}
