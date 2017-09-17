package org.tree.BST;

public class App {

	public static void main(String[] args) {
		Tree<Integer> bst = new BinarySearchTree<Integer>();
		bst.insert(1);
		bst.insert(20);
		bst.insert(112);
		bst.insert(-1);
		bst.insert(-2);
		bst.insert(0);
		
		 
		/*System.out.println("Max:"+bst.getMax());
		System.out.println("Min:"+bst.getMin());*/
		
		bst.delete(11);
		bst.traversal();

	}

}
