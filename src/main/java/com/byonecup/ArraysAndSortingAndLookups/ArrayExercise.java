package com.byonecup.ArraysAndSortingAndLookups;

public class ArrayExercise {
    public static void main(String[] args) {
        /**
         * 创建一个char类型的26个元素的数组，分别 放置'A'~'Z'。
         * 使用for循环访问所有元素并打印出来。
         * 提示：char类型数据运算 'A' + 1 => 'B'
         */
        char[] alphabet = new char[26];
        for (int i = 0; i < alphabet.length; i++) {
            // alphabet[] 是 char[]
            // alphabet[i] 是 char
            alphabet[i] = (char) ('A' + i);
            System.out.println(alphabet[i]);
        }

        /**
         * 请求出一个数组int[]的最大值{4, -1, 9, 10, 23}，并得到对应的下标。
         */
        int[] arr1 = {4, -1, 9, 10, 23};
        int max = 0;
        int index = 0;
        for (int j = 0; j < arr1.length; j++) {
            if (arr1[j] > max) {
                max = arr1[j];
                index = j;
            }
        }
        System.out.println("最大值 = " + max + " 下标 = " + index);

        /**
         * 请求出一个数组的和和平均值。
         */
        int[] arr2 = {4, -1, 9, 10, 23};
        int sum = 0;
        int avg = 0;
        for (int k = 0; k < arr2.length; k++) {
            sum += arr2[k];
        }
        avg = sum / arr2.length;
        System.out.println("和 = " + sum + " 平均值 = " + avg);
    }
}
