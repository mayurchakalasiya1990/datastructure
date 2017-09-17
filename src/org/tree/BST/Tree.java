package org.tree.BST;

public interface Tree<T> {

	public void insert(T data);

	
	
	public void delete(T data);

	public T getMax();

	public T getMin();

	public void traversal();

}
