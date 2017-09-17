package org.stack.linkedlist;

public class App {

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println("Pop: "+stack.pop());
		System.out.println("Pop: "+stack.pop());
		System.out.println("Pop: "+stack.pop());
		
		System.out.println("Peek: "+stack.peek());
		System.out.println("Size: "+stack.getSize());
	}
	
}
