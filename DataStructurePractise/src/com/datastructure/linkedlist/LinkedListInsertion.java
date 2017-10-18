package com.datastructure.linkedlist;

public class LinkedListInsertion {

	public static void main(String[] args) {

		LinkedList<Integer> intList = new LinkedList<Integer>();

		System.out.println(intList);

		intList.addFirst(1);
		intList.addFirst(2);

		System.out.println(intList);

		intList.addLast(3);

		System.out.println(intList);

		System.out.println(intList.getSize());

	}

}
