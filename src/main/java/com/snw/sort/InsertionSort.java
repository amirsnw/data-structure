package com.snw.sort;

import com.snw.arrays.MainArray;

public class InsertionSort {

	public static void main(String... args) {
		System.out.println("::::: INSERTION SORT :::::  \n");

		int intArray[] = MainArray.createIntArray();

		System.out.println("Unsorted array: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		insertionRecursionSort(intArray);

		System.out.println("\nInsertion sorted array: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		System.out.println("\nThis algorithm will sort by partitions, ");
		System.out.println("comparing the first non-partitioned ");
		System.out.println("index value with the other partitioned index ");
		System.out.println("and shifting it if it's smaller than before. ");
		System.out.println("It's a stable algorithm, so it won't swap ");
		System.out.println("elements with the same value. ");
		System.out.println("In-Place Algorithm");
		System.out.println("Visualized video: https://www.youtube.com/shorts/ulIKFHoTms0");
		System.out.println("Big-O: O(n^2); in the worst case.");

		System.out.println();
		System.out.println();
		System.out.println();

		video40InsertionSortedRecursiveArray();
	}

	private static void insertionRecursionSort(int intArray[]) {
		for (int unsortedPartitionIndex = 1; unsortedPartitionIndex < intArray.length; unsortedPartitionIndex++) {

			int newElement = intArray[unsortedPartitionIndex];
			int i;

			for (i = unsortedPartitionIndex; i > 0 && intArray[i - 1] > newElement; i--) {
				intArray[i] = intArray[i - 1];
			}

			intArray[i] = newElement;
		}
	}

	private static void video40InsertionSortedRecursiveArray() {
		System.out.println("::::: VIDEO 40 CHALLENGE ::::: ");
		System.out.println("::::: INSERTION SORT WIRH RECURSION :::::  \n");

		int intArray[] = MainArray.createIntArray();

		System.out.println("Unsorted array: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		insertionSortRecursive(intArray, intArray.length);

		System.out.println("\nInsertion sorted recursive array: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

	private static void insertionSortRecursive(int[] intArray, int numItems) {
		if (numItems < 2) {
			return;
		}

		insertionSortRecursive(intArray, numItems - 1);

		int newElement = intArray[numItems - 1];
		int i;

		for (i = numItems - 1; i > 0 && intArray[i - 1] > newElement; i--) {
			intArray[i] = intArray[i - 1];
		}

		intArray[i] = newElement;
	}
}
