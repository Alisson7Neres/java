package polimorfismo;

public class BasePlusCommissionEmployee extends CommissionEmployee{

	private double baseSalary; // salário de base por semana
	
	public BasePlusCommissionEmployee(String firstName, String lastName, 
			String socialSecurityNumber, double grossSales,double commissionRate,
			double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		
		if(baseSalary < 0.0) { // valida baseSalary
			throw new IllegalArgumentException(
					"Base salary must be >= 0.0");
		}
		
		this.baseSalary = baseSalary;
	}
	
	// configura o salário-base
	public void setBaseSalary(double baseSalary) {
		
		if(baseSalary < 0.0) { // valida baseSalary
			throw new IllegalArgumentException(
					"Base salary must be >= 0.0");
		}
		
		this.baseSalary = baseSalary;
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}
	
	@Override
	public double earnings() {
		return getBaseSalary() + super.earnings();
	}
	
	@Override
	public String toString() {
		return String.format("%s %s; %s: $%,.2f",
				"base-salaried", super.toString(),
				"base salary", getBaseSalary());
	}

}
