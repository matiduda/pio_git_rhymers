package edu.kis.vh.nursery.list;

public class Node {
	// Changed visibility from public to protected

	private int value;
	private Node prev, next;

	public Node(int i) {
		value = i;
	}

	// Setters and getters for value

	public int getValue() {
		return value;
	}

	public void setValue(int newValue) {
		value = newValue;
	}

	// Setters and getters for prev

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node newNode) {
		prev = newNode;
	}

	// Setters and getters for next

	public Node getNext() {
		return next;
	}

	public void setNext(Node newNode) {
		next = newNode;
	}
}
