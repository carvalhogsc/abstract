package entities;

public class IndividualTax extends TaxPayer {

	private Double healthExpenditures;
	
	public IndividualTax() {
		super();
	}
	
	public IndividualTax(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double tax = 0.0;
		if(getAnualIncome() < 20000.00) {
			tax = (getAnualIncome() * 0.15) - (healthExpenditures * 0.5);
		} else {
			tax = (getAnualIncome() * 0.25) - (healthExpenditures * 0.5);
		}
		return tax;
	}
}
