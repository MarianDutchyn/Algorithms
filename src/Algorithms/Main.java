package Algorithms;

import Algorithms.Search_Algorithms;
import Algorithms.Sort_Algorithms;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {9, 6, 3, 8, 1, 7, 4, 5, 3, 7};

        System.out.println("===Bubble Sort Sort===");
        Sort_Algorithms.showArray(Sort_Algorithms.bubbleSort(intArray));

        System.out.println("\n===Selection Sort Sort===");
        Sort_Algorithms.showArray(Sort_Algorithms.selectionSort(intArray));

        System.out.println("\n===Insertion Sort===");
        Sort_Algorithms.showArray(Sort_Algorithms.insertionSort(intArray));

        System.out.println("\n===Shell Sort===");
        Sort_Algorithms.showArray(Sort_Algorithms.shellSort(intArray));

        System.out.println("\n===Merge Sort===");
        Sort_Algorithms.mergeSort(intArray, 0, intArray.length);
        Sort_Algorithms.showArray(intArray);

        System.out.println("\n===Quick Sort===");
        Sort_Algorithms.quickSort(intArray, 0, intArray.length);
        Sort_Algorithms.showArray(intArray);

        System.out.println("\n===Counting Sort===");
        Sort_Algorithms.countingSort(intArray, 1, 9);
        Sort_Algorithms.showArray(intArray);

        System.out.println("\n===Linear Search===");
        System.out.println(Search_Algorithms.linearSearch(intArray, 5));

        System.out.println("===Binary Search===");
        int[] sortedIntArray = {5, 8, 10, 11, 15 ,20, 25};
        System.out.println(Search_Algorithms.iterativeBinarySearch(sortedIntArray,20));
        System.out.println(Search_Algorithms.recursiveBinarySearch(sortedIntArray,5));

    }

}
