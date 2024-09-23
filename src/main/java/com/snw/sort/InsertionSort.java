package com.snw.sort;

import com.snw.arrays.MainArray;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String... args) {
		System.out.println("::::: INSERTION SORT :::::  \n");

		int intArray[] = MainArray.createIntArray();

		System.out.println("Unsorted array: ");
		System.out.println(Arrays.toString(intArray));

		insertionIterationSort(intArray);

		System.out.println("Insertion sorted array: ");
		System.out.println(Arrays.toString(intArray));

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

	private static void insertionIterationSort(int intArray[]) {
		System.out.println();
		for (int unsortedPartitionIndex = 1; unsortedPartitionIndex < intArray.length; unsortedPartitionIndex++) {

			int newElement = intArray[unsortedPartitionIndex];
			int i;

			for (i = unsortedPartitionIndex; i > 0 && intArray[i - 1] > newElement; i--) {
				intArray[i] = intArray[i - 1];
			}

			intArray[i] = newElement;
			System.out.println(Arrays.toString(intArray));
		}
		System.out.println();
	}

	private static void video40InsertionSortedRecursiveArray() {
		System.out.println("::::: VIDEO 40 CHALLENGE ::::: ");
		System.out.println("::::: INSERTION SORT WITH RECURSION :::::  \n");

		int intArray[] = MainArray.createIntArray();

		System.out.println("Unsorted array: ");
		System.out.println(Arrays.toString(intArray));

		System.out.println();
		insertionSortRecursive(intArray, intArray.length);
		System.out.println();

		System.out.println("Insertion sorted recursive array: ");
		System.out.println(Arrays.toString(intArray));

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
		System.out.println(Arrays.toString(intArray));
	}
}
