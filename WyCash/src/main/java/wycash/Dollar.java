package wycash;

public class Dollar extends Money {
	
	private String currency;

	public Dollar(int amount) {
		this.amount = amount;
		currency = "USD";
	}

	public Money times(int multiplier) {
		return new Dollar(amount * multiplier);
	}

	@Override
	protected String currency() {
		return currency;
	}

}
