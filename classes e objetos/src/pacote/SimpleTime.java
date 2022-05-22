package pacote;

public class SimpleTime {

	private int hour;
	private int minute;
	private int second;

	// se o construtor utilizar nomes de parâmetro idênticos a
	// nomes de variáveis de instância a referência "this" será
	// exigida para distinguir entre os nomes
	public SimpleTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	// Fim da classe ThisTest

	// Classe SimpleTime demonstra a referência "this"


	// Utilizam "this" explícito e implícito para chamar toUniversailString
	public String buildString() {
		return String.format("%24s: %s%n%24s: %s",
				"this.toUniversalString()", this.toUniversalString() ,
				"toUniversalString()", toUniversalString());
	}

	// Converte em String no formato de data/hora universal (HH:MM:SS)
	public String toUniversalString() {
		// "this" não é requerido aqui para acessar variáveis de instância.
		// porque o método não tem variáveis locais com os mesmos
		// nomes das variáveis de instância
		return String.format("%02d:%02d:%02d",
				this.hour, this.minute, this.second);
	}
}
