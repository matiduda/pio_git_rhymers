package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

	public static final int INT = -1;
	public static final int SIZE = 12;
	private final int[] NUMBERS = new int[SIZE];
	public int total = INT;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == INT;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return INT;
		return NUMBERS[total];
	}

	public int countOut() {
		if (callCheck())
			return INT;
		return NUMBERS[total--];
	}

}
