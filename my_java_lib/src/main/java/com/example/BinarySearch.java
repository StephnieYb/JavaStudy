package com.example;

/**
 * Created by yxc on 2017/7/11.
 */

public class BinarySearch {
    public static void main(String args[]) {
        int arr1[] = {2, 12, 1, 64, 100, 28, 298, 300};
        BinarySearch search = new BinarySearch();
        QuickSort sort = new QuickSort();
        sort.quick(arr1);
        System.out.println("所查找的数字在数组中按从小到大排第 "+search.binary(arr1, 0, arr1.length - 1, 1));
    }


    /**
     * 二分查找前提数组是有序数组
     *
     * @param arr
     * @param low
     * @param high
     * @param key
     * @return
     */

    public int binary(int arr[], int low, int high, int key) {

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                return binary(arr, mid + 1, high, key);
            } else if (arr[mid] > key) {
                return binary(arr, low, mid - 1, key);
            }
        }
        return -1;

    }
}

