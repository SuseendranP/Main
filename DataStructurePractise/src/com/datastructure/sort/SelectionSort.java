package com.datastructure.sort;

public class SelectionSort {

	public static void main(String[] args) {

		int[] array = { 12, 45, 6, 89, 65, 23, 90, 34, 65, 82, 17 };

		printArray(array);
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			int small = i;

			for (int j = i; j < array.length; j++) {
				if (array[small] > array[j]) {
					small = j;
				}
			}

			if (i != small) {
				int temp = array[i];
				array[i] = array[small];
				array[small] = temp;
			}

		}

		printArray(array);

	}

	private static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
	}

}
