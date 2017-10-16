package com.datastructure.sort;

public class InsertionSort {

	public static void main(String[] args) {

		int[] input = { 12, 7, 128, 47, 89, 53, 3, 64, 89 };

		for (int i = 1; i < input.length; i++) {

			int key = input[i];
			int j = i - 1;

			while (j >= 0 && input[j] > key) {
				input[j + 1] = input[j];
				j--;
			}

			input[j + 1] = key;

		}

		for (int i : input) {
			System.out.print(i + " ");
		}

	}

}
