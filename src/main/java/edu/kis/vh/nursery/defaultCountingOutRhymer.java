package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

	private static final int INT = -1;
	private static final int CALL_CHECK_INT = -1;
	private static final int SIZE = 12;
	private final int[] numbers = new int[SIZE];
	private int total = INT;


	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
		numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == INT;
	}

	public boolean isFull() {
		return total == (SIZE - 1);
	}

	protected int peekaboo() {
		if (callCheck())
			return CALL_CHECK_INT;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return CALL_CHECK_INT;
		return numbers[total--];
	}

}
