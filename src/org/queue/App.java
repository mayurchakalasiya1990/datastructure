package org.queue;

public class App {

	public static void main(String[] args) {

		Queue<Integer> queue = new Queue<Integer>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);

		System.out.println("Dequeue:"+queue.dequeue());
		System.out.println("Dequeue:"+queue.dequeue());
		System.out.println("Dequeue:"+queue.dequeue());
		System.out.println("Dequeue:"+queue.dequeue());
		System.out.println("Dequeue:"+queue.dequeue());
		System.out.println("Size:"+queue.getSize());
		

	}

}
