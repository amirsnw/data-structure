package com.snw.sort;

import com.snw.arrays.MainArray;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		System.out.println("::::: SELECTION SORT :::::  \n");
		
		int intArray[] = MainArray.createIntArray();

		System.out.println("Unsorted array: ");
		System.out.println(Arrays.toString(intArray));

		sort(intArray);

		System.out.println("Selection sorted array: ");
		System.out.println(Arrays.toString(intArray));
		
		System.out.println("\nIt looks like a bubble sort algorithm, \n"
				+ " but there are fewer swaps than bubble sort, \n"
				+ " because it will compare the current value against the largest \n"
				+ " element and passing only the index with the biggest value \n"
				+ " to be replaced in the last unsorted index. \n"
				+ " It's an unstable algorithm, so it will swap \n elements with that same value. \n"
				+ " In a nutshell this algorithm will sort the array putting the biggest value \n"
				+ " in the last unsorted index.\n"
				+ " This is In-Place Algorithm\n"
				+ " Visualized video: https://www.youtube.com/watch?v=lKqq8SjABSI\n"
				+ " Big-O: O(N^2); in the worst case.");
	}

	private static void sort(int[] intArray) {
		System.out.println();
		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex >= 0; lastUnsortedIndex--) {
			int largestElementIndex = 0;
			for (int i = 0; i <= lastUnsortedIndex; i++) {
				if (intArray[i] > intArray[largestElementIndex]) {
					largestElementIndex = i;
				}
			}
			swap(intArray, largestElementIndex, lastUnsortedIndex);
			System.out.println(String.format("Step %d: ", intArray.length - lastUnsortedIndex) + Arrays.toString(intArray));
		}
		System.out.println();
	}

	public static void swap(int array[], int largestElementIndex, int lastUnsortedIndex) {
		if (largestElementIndex == lastUnsortedIndex) {
			return;
		}

		int temp = array[largestElementIndex];
		array[largestElementIndex] = array[lastUnsortedIndex];
		array[lastUnsortedIndex] = temp;
	}

}
