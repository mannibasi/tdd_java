package WyCash;

public class Dollar {

	public int amount;

	public Dollar(int amount) {
		this.amount = amount;
	}

	public Dollar times(int multiplier) {
		amount *= multiplier;
		return null;
	}

}
