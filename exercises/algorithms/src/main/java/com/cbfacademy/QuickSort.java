package com.cbfacademy;

public class QuickSort {
    public int partition(int arr[], int beg, int end) {
        int pivot = arr[end];
        int pIndex = beg - 1;

        for (int i = beg; i < end; i++) {
            if (arr[i] < pivot) {
                pIndex++;
                // Swap arr[i] and arr[pIndex]
                int temp = arr[pIndex];
                arr[pIndex] = arr[i];
                arr[i] = temp;
            }
        }

        // Swap pivot and arr[pIndex+1]
        int temp = arr[pIndex + 1];
        arr[pIndex + 1] = arr[end];
        arr[end] = temp;

        return pIndex + 1;
    }

     public void quickSort(int arr[], int beg, int end) {
        if (beg < end) {
            int pivotIndex = partition(arr, beg, end);
            quickSort(arr, beg, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);
        }
    }

    public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
