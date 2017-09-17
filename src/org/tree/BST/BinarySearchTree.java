package org.tree.BST;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

	private Node<T> root;

	@Override
	public void insert(T data) {
		if (root == null) {
			root = new Node<T>(data);
		} else {
			insertNode(data, root);
		}

	}

	private void insertNode(T newData, Node<T> node) {
		if (newData.compareTo(node.getData()) < 0) {
			if (node.getLeftChild() != null) {
				insertNode(newData, node.getLeftChild());
			} else {
				Node<T> newNode = new Node<T>(newData);
				node.setLeftChild(newNode);
			}
		} else {
			if (node.getRightChild() != null) {
				insertNode(newData, node.getRightChild());
			} else {
				Node<T> newNode = new Node<T>(newData);
				node.setRightChild(newNode);
			}
		}
	}

	@Override
	public T getMax() {
		if (root == null)
			return null;
		return getMaxValue(root);
	}

	@Override
	public T getMin() {
		if (root == null)
			return null;
		return getMinValue(root);
	}

	private T getMaxValue(Node<T> node) {

		if (node.getRightChild() != null) {
			return getMaxValue(node.getRightChild());
		}
		return node.getData();

	}

	private T getMinValue(Node<T> node) {
		System.out.println("Minfun:" + node.getData());
		if (node.getLeftChild() != null) {
			return getMinValue(node.getLeftChild());
		}
		return node.getData();
	}

	@Override
	public void traversal() {
		if (root != null) {
			inOrderTraversal(root);
		}
	}

	private void inOrderTraversal(Node<T> node) {

		if (node.getLeftChild() != null) {
			inOrderTraversal(node.getLeftChild());
		}

		System.out.print(node.getData() + "-->");

		if (node.getRightChild() != null) {
			inOrderTraversal(node.getRightChild());
		}

	}

	@Override
	public void delete(T data) {
		if (root != null) {
			root = delete(root, data);
		}
	}

	public Node<T> delete(Node<T> node, T data) {

		if (node == null)
			return node;

		if (data.compareTo(node.getData()) < 0) {
			node.setLeftChild(delete(node.getLeftChild(), data));
		} else if (data.compareTo(node.getData()) > 0) {
			node.setRightChild(delete(node.getRightChild(), data));
		} else {

			if (node.getLeftChild() == null && node.getRightChild() == null) {
				System.out.println("Removing Leaf node...");
				return null;
			}

			if (node.getLeftChild() == null) {
				System.out.println("Removing Right Child node...");
				Node<T> temp = node.getRightChild();
				node = null;
				return temp;
			} else if (node.getRightChild() == null) {
				System.out.println("Removing Left Child node...");
				Node<T> temp = node.getLeftChild();
				node = null;
				return temp;
			}

			// removing node with two child
			System.out.println("removing node with two child..");
			Node<T> predecessorNode = predecessor(node.getLeftChild());
			node.setData(predecessorNode.getData());
			node.setLeftChild(delete(node.getLeftChild(),
					predecessorNode.getData()));

		}

		return node;

	}

	private Node<T> predecessor(Node<T> node) {

		if (node.getRightChild() != null) {
			return predecessor(node.getRightChild());
		}

		System.out.println("predecessor:" + node);
		return node;
	}

}
