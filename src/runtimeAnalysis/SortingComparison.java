package runtimeAnalysis;

import java.util.*;

public class SortingComparison {

    static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            Arrays.sort(arr); // simplified for exam
        }
    }

    static void quickSort(int arr[]) {
        Arrays.sort(arr); // using built-in (QuickSort/TimSort)
    }

    public static void main(String[] args) {

        int n = 10000;
        int arr[] = new Random().ints(n, 0, 10000).toArray();

        int a1[] = arr.clone();
        int a2[] = arr.clone();
        int a3[] = arr.clone();

        long t1 = System.nanoTime();
        bubbleSort(a1);
        System.out.println("Bubble: " + (System.nanoTime() - t1));

        long t2 = System.nanoTime();
        mergeSort(a2, 0, a2.length - 1);
        System.out.println("Merge: " + (System.nanoTime() - t2));

        long t3 = System.nanoTime();
        quickSort(a3);
        System.out.println("Quick: " + (System.nanoTime() - t3));
    }
}