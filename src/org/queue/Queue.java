package org.queue;

public class Queue<T extends Comparable<T>> {

	 Node<T> firstNode;
	private Node<T> lastNode;
	private int size;

	public void enqueue(T newData) {
		++this.size;
		Node<T> oldLastNode = this.lastNode;
		this.lastNode = new Node<T>(newData);
		this.lastNode.setNextNode(null);

		if (isEmpty()) {
			this.firstNode = this.lastNode;
		} else {
			System.out.println(oldLastNode);
			oldLastNode.setNextNode(this.lastNode);
		}

	}

	public T dequeue() {
		--this.size;
		Node<T> valueToDequeue = this.firstNode;
		this.firstNode = this.firstNode.getNextNode();

		if (isEmpty()) {
			this.lastNode = null;
		}
		System.out.println(valueToDequeue.getData());
		return valueToDequeue.getData();
	}


	public boolean isEmpty() {
		return this.firstNode == null;
	}
	
	public int getSize(){
		return this.size;
	}
	

}
