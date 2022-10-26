package com.byonecup.ArraysAndSortingAndLookups;

import java.util.Scanner;

public class TwoDimensionalArraysExercise {
    public static void main(String[] args) {
        int arr[][] = {{4, 6}, {1, 4, 5, 7}, {-2}};
        // 遍历该二维数组，并得到它们的和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("sum = " + sum);

        /**
         * String strs[] = new String[]{"a", "b", "c"}; // 正确
         * String[] strs = new String[3]{"a", "b", "c"}; // 错误，new String[3]中的3不能写，编译错误
         */

        /**
         * 已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序。
         * 比如，[10, 12, 45, 90]，添加23后，数组为[10, 12, 23, 45, 90]
         * 数组扩容 + 定位
         */
        int[] arr2 = {10, 12, 45, 90};
        int[] newArr2 = new int[arr2.length + 1];
        int index = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要插入的数：");
        int inputNum = scanner.nextInt();
        for (int i = 0; i < arr2.length; i++) {
            if (inputNum <= arr2[i]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            index = arr2.length;
        }
        System.out.println("index = " + index);
        for (int i = 0, j = 0; i < newArr2.length; i++) { // i控制新数组的下标，j控制原来数组的下标
            if (i == index) {
                newArr2[i] = inputNum;
            } else {
                newArr2[i] = arr2[j];
                j++;
            }
        }

        // 让arr2指向newArr2，原来的数组就成为垃圾，被销毁
        arr2 = newArr2;
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }

        /**
         * 随机生成10个整数（1~100范围内）保存到数组，并倒序打印以及求平均值、求最大值和最大值的下标、并查找里面是否有8
         */
        int[] arr3 = new int[10];
        int sum2 = 0;
        double avg = 0;
        int max = 0;
        int maxIndex = -1;
        for (int i = 0; i < 10; i++) {
            arr3[i] = (int) (Math.random() * 100 + 1);
            sum2 += arr3[i];
            if (arr3[i] > max) {
                max = arr3[i];
                maxIndex = i;
            }
        }
        System.out.print("\n未排序的数组为：");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "\t");
        }
        System.out.print("\n未排序的数组最大值为：" + max + "，下标为：" + maxIndex);

        for (int i = 0; i < arr3.length; i++) {
            if (8 == arr3[i]) {
                System.out.print("\n当前下标" + i + "元素为8");
            }
        }
        System.out.print("\n倒序打印的数组：");
        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.print(arr3[i] + "\t");
        }
        for (int i = 0; i < arr3.length - 1; i++) {
            for (int j = 0; j < arr3.length - i - 1; j++) {
                if (arr3[j] < arr3[j + 1]) {
                    int temp = arr3[j];
                    arr3[j] = arr3[j + 1];
                    arr3[j + 1] = temp;
                }
            }
        }
        System.out.print("\n降序打印数组：");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "\t");
        }
        avg = sum2 / (double) arr3.length;
        System.out.println("\nsum = " + sum2 + " ,avg = " + avg);
    }
}
