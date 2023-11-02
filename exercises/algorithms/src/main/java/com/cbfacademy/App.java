package com.cbfacademy;

public class App {
    public static void main(String[] args) {
        // int[] arr = {38,27,43,10};
        // int left = arr[0];
        // int right = arr[3];

        int arr[] = { 12, 11, 13, 5, 6, 7 };

        // Create an object of the MergeSort class

        MergeSort.mergeSort(arr, 0, arr.length - 1);

        System.out.println("Given Array");
        MergeSort.printArray(arr);

        System.out.println("\nSorted array");
        MergeSort.printArray(arr);

        QuickSort sorter = new QuickSort();
        int arr1[] = { 12, 4, 5, 7, 3, 1, 15, 2, 9 };

        System.out.println("Given Array");
        sorter.printArray(arr1);

        int n = arr.length;
        sorter.quickSort(arr1, 0, n - 1);

        System.out.println("\nSorted array");
        sorter.printArray(arr1);

    }
}
