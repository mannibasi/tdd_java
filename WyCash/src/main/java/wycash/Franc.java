package wycash;

public class Franc extends Money {
	
	private String currency;

	public Franc(int amount) {
		this.amount = amount;
		currency = "CHF";
	}

	public Money times(int multiplier) {
		return new Franc(amount * multiplier);
	}

	@Override
	protected String currency() {
		return currency;
	}

}
