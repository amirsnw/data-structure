package com.snw.sort;

import com.snw.arrays.MainArray;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("::::: BUBBLLE SORT ::::: \n");
		
		int[] intArray = MainArray.createIntArray();

		System.out.println("Unsorted array: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		sort(intArray);

		System.out.println("\nBubble sorted array: ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		System.out.println("\nOne of the most inefficient algorithms for sorting.\n"
				+ "Bubble sort is a stable algorithm, because it will preserve the order of \n"
				+ "the same elements in this 'If': if (intArray[j] > intArray[j + 1]). \n"
				+ "to be an unstable algorithm we will need to change this algorithm and put \n"
				+ "'>=' instead of '>' in the 'If'. Change this comparison will do \n"
				+ "the algorithm swap elements with the same value.\n"
				+ "BubbleSort is seen by the numbers of 'fors' in the code, \n"
				+ "if the collection grows, the number of steps will grow too.\n" 
				+ "in-place algorithm so doesn't need a second array.\n"
				+ "in-place algorithm so doesn't need a second array.\n"
				+ "Two variables are used in the algorithm, so the required memory is not dependent\n"
				+ "on the number of elements. \n"
				+ "The mentioned implementation looks at the sorted partition as an optimization \n"
				+ "factor of the algorithm, otherwise it would be non-optimal to iterate the whole \n"
				+ "array every time.\n"
				+ "Visualized Video: https://www.youtube.com/watch?v=Cq7SMsQBEUw\n"
				+ "Big-O: O(N²);");
	}

	private static void sort(int[] intArray) {
		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int j = 0; j < lastUnsortedIndex; j++) {
				if (intArray[j] > intArray[j + 1]) {
					swap(intArray, j, j + 1);
				}
			}
		}
	}

	public static void swap(int array[], int j, int jPlusOne) {
		if (j == jPlusOne) {
			return;
		}

		int temp = array[j];
		array[j] = array[jPlusOne];
		array[jPlusOne] = temp;
	}
}
