package com.byonecup.ArraysAndSortingAndLookups;

public class BubbleSort {
    public static void main(String[] args) {
        /**
         * 将五个无序：24, 69, 80, 57, 13
         * 使用冒泡排序法将其排成一个从小到大的有序数列。
         */
        int[] arr = {24, 69, 80, 57, 13};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("排序后的数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
