package wycash;

public class Franc extends Money {

	private int amount;

	public Franc(int amount) {
		this.amount = amount;
	}

	public Franc times(int multiplier) {
		return new Franc(amount * multiplier);
	}

	@Override
	public boolean equals(Object obj) {
		Franc dollar = (Franc) obj;
		return amount == dollar.amount;
	}

}
