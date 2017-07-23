package com.example;

/**
 * Created by yxc on 2017/6/12.
 */

public class QuickSort {
    public static void main(String args[]) {
        int a[] = {23, 51, 23, 49, 63, 52, 68, 10, 36, 76, 13, 7, 10, 22};
        quick(a);
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

    }

    public static int getMid(int arr[], int low, int high) {
        int pip = arr[low];
        while (low < high) {

            while (low < high && pip <= arr[high]) {
                high--;
            }
            if (low < high) {
                arr[low] = arr[high];
                arr[high] = pip;
                low++;
            }
            while (low < high && pip >= arr[low]) {
                low++;
            }
            if (low < high) {
                arr[high] = arr[low];
                arr[low] = pip;
                high--;
            }
        }
        return low;
    }

    public static void sort(int arr[], int low, int high) {
        if (low < high) {

            int mid = getMid(arr, low, high);
            sort(arr, low, mid - 1);
            sort(arr, mid + 1, high);


        }
    }

    public static void quick(int[] a2) {
        if (a2.length > 0)
            sort(a2, 0, a2.length - 1);


    }

}
