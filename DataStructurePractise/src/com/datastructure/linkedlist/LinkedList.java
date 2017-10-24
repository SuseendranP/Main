package com.datastructure.linkedlist;

public class LinkedList<E> {

	private Node headNode;

	private int size;

	private class Node {
		E data;
		Node nextNode;

		Node(E data) {
			this.data = data;
			nextNode = null;
		}
	}

	public void addFirst(E e) {
		Node node = new Node(e);
		if (headNode == null) {
			headNode = node;
			size++;
		} else {
			node.nextNode = headNode;
			headNode = node;
			size++;
		}
	}

	public void addLast(E e) {
		Node node = new Node(e);
		if (headNode == null) {
			headNode = node;
			size++;
		} else {
			Node tempNode = headNode;
			while (tempNode.nextNode != null) {
				tempNode = tempNode.nextNode;
			}
			tempNode.nextNode = node;
			size++;
		}
	}

	@Override
	public String toString() {
		Node tempNode = headNode;
		String str = "[ ";
		while (tempNode != null) {
			str = str + tempNode.data + " ,";
			tempNode = tempNode.nextNode;
		}
		return str.substring(0, str.length() - 1) + "]";
	}

	public int getSize() {
		return size;
	}

	public void deleteByValue(E e) {
		if (headNode != null) {
			Node tempNode = headNode;
			Node prevNode = null;
			while (tempNode != null) {
				if (tempNode.data.equals(e)) {
					if (prevNode == null) {
						headNode = tempNode.nextNode;
						tempNode.nextNode = null;
						size--;
						break;
					} else {
						prevNode.nextNode = tempNode.nextNode;
						tempNode.nextNode = null;
						size--;
						break;
					}
				}
				prevNode = tempNode;
				tempNode = tempNode.nextNode;
			}
		}
	}

	public void deleteByPosition(int position) {
		if (headNode != null && position <= size) {

			Node tempNode = headNode;
			Node prevNode = null;

			while (position < 1) {
				prevNode = tempNode;
				tempNode = tempNode.nextNode;
				position--;
			}

			if (prevNode == null) {
				headNode = tempNode.nextNode;
				tempNode.nextNode = null;
				size--;
			} else {
				prevNode.nextNode = tempNode.nextNode;
				tempNode.nextNode = null;
				size--;
			}

		}
	}

}
