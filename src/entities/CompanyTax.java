package entities;

public class CompanyTax extends TaxPayer {
	
	private Integer numberEmployees;
	
	public CompanyTax() {
		super();
	}

	public CompanyTax(String name, Double anualIncome, Integer numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public double tax() {
		double tax;
		
		if(numberEmployees > 10) {
			tax = getAnualIncome() * 0.14;
		} else {
			tax = getAnualIncome() * 0.16;
		}		
		return tax;
	}
	
	

}
