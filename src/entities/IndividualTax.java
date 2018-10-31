package entities;

public class IndividualTax extends TaxPayer {

	private Double healthExpenditures;

	@Override
	public double tax() {
		double tax = 0.0;
		if(getAnualIncome() < 20000.00) {
			tax = (getAnualIncome() * 1.15) - (healthExpenditures * 0.5);
		} else {
			tax = (getAnualIncome() * 1.25) - (healthExpenditures * 0.5);
		}
		return tax;
	}
}
