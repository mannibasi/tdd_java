package wycash;

public class Money {
	
	protected int amount;
	
	@Override
	public boolean equals(Object obj) {
		Money money = (Money) obj;
		return amount == money.amount && getClass().equals(money.getClass());
	}

	public static Dollar dollar(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}