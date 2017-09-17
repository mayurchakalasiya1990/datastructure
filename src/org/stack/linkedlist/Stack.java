package org.stack.linkedlist;

public class Stack<T extends Comparable<T>> {

	private Node<T> root;
	private int size;

	//o(1)
	public void push(T nodeData) {
		++this.size;
		if (this.root == null) {
			this.root = new Node<T>(nodeData);
		} else {
			Node<T> oldNode = this.root;
			this.root = new Node<T>(nodeData);
			this.root.setNextNode(oldNode);
		}
	}

	//o(2)
	public T pop() {
		--this.size;
		T iteamToPop = this.root.getData();
		this.root = this.root.getNextNode();
		return iteamToPop;
	}

	//o(1)
	public T peek() {
		return this.root.getData();
	}

	//o(1)
	public int getSize() {
		return this.size;
	}
	
	//o(1)
	public boolean isEmpty(){
		return this.root==null;
	}

}
