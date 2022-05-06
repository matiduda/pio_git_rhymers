package edu.kis.vh.nursery.list;

public class Node {
	// Changed visibility from public to protected

	protected int value;
	protected Node prev, next;

	public Node(int i) {
		value = i;
	}

}
