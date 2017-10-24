package com.datastructure.linkedlist;

public class LinkedListInsertion {

	public static void main(String[] args) {

		// test();

		LinkedListInsertion linkedListInsertion = new LinkedListInsertion();
		linkedListInsertion.deleteTest();

	}

	private static void test() {
		LinkedList<Integer> intList = new LinkedList<Integer>();

		System.out.println(intList);

		intList.addFirst(1);
		intList.addFirst(2);

		System.out.println(intList);

		intList.addLast(3);

		System.out.println(intList);

		System.out.println(intList.getSize());
	}

	private void deleteTest() {

		LinkedList<Integer> intList = new LinkedList<>();

		intList.addFirst(1);
		intList.addFirst(2);
		intList.addLast(3);
		intList.addFirst(4);
		intList.addLast(5);

		System.out.println(intList);
		System.out.println(intList.getSize());

		intList.deleteByValue(2);

		System.out.println(intList);
		System.out.println(intList.getSize());

		intList.deleteByPosition(3);

		System.out.println(intList);
		System.out.println(intList.getSize());

	}

}
