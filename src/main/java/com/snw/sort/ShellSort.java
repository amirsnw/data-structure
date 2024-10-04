package com.snw.sort;

import com.snw.arrays.MainArray;

import java.util.Arrays;

public class ShellSort {
    public static void main(String args[]) {
        System.out.println("::::: SHELL SORT :::::  \n");

        int intArray[] = MainArray.createIntArray();

        System.out.println("Unsorted array: ");
        System.out.println(Arrays.toString(intArray));

        sort(intArray);

        System.out.println("Shell sorted array: ");
        System.out.println(Arrays.toString(intArray));

        System.out.println(" ");
        System.out.println("- It's an improved variation of 'Insertion Sort'.");
        System.out.println("- 'Insertion Sort' uses a gap of 1 item by item.");
        System.out.println("- Shell sort starts out using a larger gap value.");
        System.out.println("- As the algorithm runs, the gap is reduced.");
        System.out.println("- Goals are to reduce the amount of shifting required.");
        System.out.println("- The gap can be calculated by a lot of ways, \nand it will influence in the performance of the algorithm.");
        System.out.println("- Gap formula: (3� - 1)/2 or (intArray.lenght)/2. ");
        System.out.println("- The gap takes the half of the array, and after all \n"
                + "the comparisons, the gap will be divided by 2, and "
                + "this process \nwill work this way until it turns an 'Insertion Sort', \nwhich has the gap of 1 field. "
                + "- Can be applied in Bubble Sort and Insertion Sort algorithms. ");

        System.out.println("- Difficult to nail down the time complexity because \nit will depend on the gap. \n"
                + "- Doesn't require as much shifting as insertion sort, \nusually performs better. \n"
                + "- Unstable algorithm. ");
        System.out.println("- Big-O: O(N^2); in the worst case.");


    }

    private static void sort(int[] intArray) {
        System.out.println();
        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < intArray.length; i++) {

                int newElement = intArray[i];
                int j = i;

                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }

                intArray[j] = newElement;
                System.out.println(Arrays.toString(intArray));
            }
        }
        System.out.println();
    }
}
