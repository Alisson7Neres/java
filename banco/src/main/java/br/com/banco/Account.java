package br.com.banco;

public class Account {

	// Atributos
	private String name;
	private double balance;
	
	// Construtor
	public Account(String name, double balance) {
		this.name = name;
		
		// valida que o balance é maior que 0.0; se não for,
		// a variável de instância balance mantém seu valor inicial padrão de 0.0
		if (balance > 0.0) {
			this.balance = balance;
		}
	}

	// método que deposita (adiciona) apenas uma quantia válida no saldo
	public void deposit(double depositAmount) {
		if (depositAmount > 0.0) // se depositAmount for válido
			balance = balance + depositAmount;
	}
	
	public void setName(String name, double balance) {
		this.name = name;
	}
	

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
}
