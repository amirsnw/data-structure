package com.snw.sort;

import com.snw.arrays.MainArray;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeSort {
    public static void main(String args[]) {
        System.out.println("::::: MERGE SORT ::::: \n");

        int[] intArray = MainArray.createIntArray();

        System.out.println("Unsorted array: ");
        System.out.println(Arrays.toString(intArray));

        System.out.println();
        mergeSort(intArray, 0, intArray.length);
        System.out.println();

        System.out.println("Merge sorted array: ");
        System.out.println(Arrays.toString(intArray));

        System.out.println();
        System.out.println("- Divided and conquer algorithm.");
        System.out.println("- Recursive algorithm. ");
        System.out.println("- Two phases: Splitting and Merging. ");
        System.out.println("- Splitting phase leads to faster sorting in merging phase. ");
        System.out.println("- Splitting is logical, we don't create new arrays. ");
        System.out.println();
        System.out.println("How it works?");
        System.out.println("Divide the unsorted array into two arrays, and then, keep dividing ");
        System.out.println("the arrays until the arrays have only one element.");
        System.out.println();
        System.out.println("Not In-Place algorithm, it'll use temporary arrays.");
        System.out.println("We`re repeatedly dividing the array in half during splitting phase.");
        System.out.println("Stable algorithm, we`ll preserve the order for elements ");
        System.out.println("with the same value.");
        System.out.println("Big-O? O(NlogN);");

        System.out.println();

        video38MergeSortedDescendingArray();

    }

    private static void mergeSort(int[] inputArray, int start, int end) {
        if (end - start < 2) {
            finePrint(inputArray, start, end);
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(inputArray, start, mid);
        mergeSort(inputArray, mid, end);
        finePrint(inputArray, start, end);
        merge(inputArray, start, mid, end);
    }

    private static void merge(int[] inputArray, int start, int mid, int end) {
        // It means, if we have values fewer in the left array
        // than the right array, we don't have to do anything.
        // Because it's saying to us that the left array is
        // already sorted in ascending order.
        if (inputArray[mid - 1] <= inputArray[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int temp[] = new int[end - start];

        while (i < mid && j < end) {
            temp[tempIndex++] = inputArray[i] <= inputArray[j] ? inputArray[i++] : inputArray[j++];
        }

        System.arraycopy(inputArray, i, inputArray, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, inputArray, start, tempIndex);
    }

    private static void video38MergeSortedDescendingArray() {
        System.out.println("::::: VIDEO 38 CHALLENGE ::::: \n");
        System.out.println("::::: MERGE SORT DESCENDING ::::: ");

        int intArray[] = MainArray.createIntArray();

        System.out.println("Unsorted array: ");
        System.out.println(Arrays.toString(intArray));

        System.out.println();
        mergeSortDescending(intArray, 0, intArray.length);
        System.out.println();

        System.out.println("Merge sorted descending array: ");
        System.out.println(Arrays.toString(intArray));
    }

    private static void mergeSortDescending(int[] intArray, int start, int end) {
        if (end - start < 2) {
            finePrint(intArray, start, end);
            return;
        }

        int mid = (start + end) / 2;
        mergeSortDescending(intArray, start, mid);
        mergeSortDescending(intArray, mid, end);
        finePrint(intArray, start, end);
        mergeDescending(intArray, start, mid, end);
    }

    private static void mergeDescending(int[] intArray, int start, int mid, int end) {
        // It means, if we have values bigger in the right array
        // than the left array, we don't have to do anything.
        // Because it's saying to us that the right array is
        // already sorted in descending order.
        if (intArray[mid - 1] >= intArray[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int temp[] = new int[end - start];

        while (i < mid && j < end) {
            temp[tempIndex++] = intArray[i] >= intArray[j] ? intArray[i++] : intArray[j++];
        }

        System.arraycopy(intArray, i, intArray, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, intArray, start, tempIndex);
    }

    private static void finePrint(int[] inputArray, int start, int end) {
        String output = Arrays.toString(inputArray);
        System.out.println(output);
        String[] elements = output.replaceAll("[\\],\\[]", "").split(" ");
        StringBuilder indicator = new StringBuilder();
        for (int j = 0; j < elements.length; j++) {
            if (j == 0) indicator.append(" ");
            if (j < start) {
                indicator.append(IntStream.range(0, elements[j].length() + 2)
                        .mapToObj(i -> " ").collect(Collectors.joining()));
            } else if (j > start && j < end) {
                indicator.append(IntStream.range(0, (j - 1 == start ? elements[j - 1].length() - 1 : 1) + elements[j].length() + 1)
                        .mapToObj(i -> "_").collect(Collectors.joining()));
            }
            if (j == start) {
                indicator.append("|");
                continue;
            }
            if (j == end - 1) {
                indicator.append("|");
                break;
            }
        }
        System.out.println(indicator);
    }
}
