package abstrata;

public abstract class FuncionarioSalario {
	
	public String nome;
	public double salario;

	public abstract void Reajustar();
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
