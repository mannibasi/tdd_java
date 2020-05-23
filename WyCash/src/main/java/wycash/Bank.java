package wycash;

import java.util.HashMap;

public class Bank {

	private HashMap<Pair, Integer> rates = new HashMap<>();

	public Money reduce(Expression source, String to) {
		return source.reduce(this, to);
	}

	public void addRate(String from, String to, int rate) {
		rates.put(new Pair(from, to), rate);
	}

	public int rate(String from, String to) {
		if (from.equals(to))
			return 1;
		Integer rate = rates.get(new Pair(from, to));
		return rate.intValue();
	}

}
