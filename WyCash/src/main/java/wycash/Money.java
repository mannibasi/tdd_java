package wycash;

public class Money implements Expression {

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

	public Expression plus(Money addend) {
		return new Sum(this, addend);
	}

	public Money reduce(Bank bank, String to) {
		int rate = bank.rate(currency, to);
		return new Money(amount / rate, to);
	}

}