package wycash;

public abstract class Money {
	
	protected int amount;
	protected String currency;
	
	public abstract Money times(int multiplier);
	
	@Override
	public boolean equals(Object obj) {
		Money money = (Money) obj;
		return amount == money.amount && getClass().equals(money.getClass());
	}

	public static Money dollar(int amount) {
		return new Dollar(amount);
	}

	public static Money franc(int amount) {
		return new Franc(amount);
	}

	protected String currency() {
		return currency;
	}

}