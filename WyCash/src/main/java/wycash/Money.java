package wycash;

public class Money {

	protected int amount;
	protected String currency;

	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		if (this.getClass() != obj.getClass())
			return false;

		Money money = (Money) obj;
		return amount == money.amount && currency().equals(money.currency());
	}

	public String toString() {
		return amount + " " + currency;
	}

	public static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	public static Money franc(int amount) {
		return new Money(amount, "CHF");
	}

	protected String currency() {
		return currency;
	}

	public Money plus(Money addend) {
		return new Money(amount + addend.amount, currency);
	}

}