package com.datastructure.sort;

public class BubbleSort {

	public static void main(String[] args) {

		int[] array = { 12, 45, 6, 89, 65, 23, 90, 34, 65, 82, 17 };

		System.out.println(array.length);

		for (int i = 0; i < array.length - 1; i++) {

			for (int j = 0; j < array.length - i - 1; j++) {

				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

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
