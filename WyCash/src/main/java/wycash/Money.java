package wycash;

public abstract class Money {
	
	protected int amount;
	
	public abstract Money times(int multiplier);
	
	@Override
	public boolean equals(Object obj) {
		Money money = (Money) obj;
		return amount == money.amount && getClass().equals(money.getClass());
	}

	public static Dollar dollar(int amount) {
		return new Dollar(amount);
	}

}