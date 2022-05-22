package pacote;

public class Time1Test {

	public static void main(String[] args) {
		
		Time1 time1 = new Time1(); // Invoca o construtor Time1
		
		// Gera saída de representações de string da data/hora
		displayTime("After time object is created", time1);
		System.out.println();
		
		// Altera a data/hora e gera saída da data/hora atualizada
		time1.setTime(13, 27, 6);
		displayTime("After calling setTime", time1);
		System.out.println();
		
		// Tenta definir data/hora com valores inválidos
		try {
			time1.setTime(99, 99, 99); // Todos os valores fora do intervalo
		}catch(IllegalArgumentException e) {
			System.out.printf("Exception: %s%n%n", e.getMessage());
		}
		
		// Exibe a data/hora após uma tentativa de definir valores inválidos
		displayTime("After calling setTime with invalid values", time1);
	}

	// Exibe um objeto Time1 nos formatos de 24 horas e 12 horas
	private static void displayTime(String header, Time1 t) {
		System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", 
				header, t.toUniversalString(), t.toString());
	}
}
