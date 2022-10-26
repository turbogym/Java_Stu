package com.byonecup.ArraysAndSortingAndLookups;

import java.util.Scanner;

public class ArrayAdd {
    public static void main(String[] args) {
        /**
         * 要求：实现动态的给数组添加元素效果，实现对数组扩容。
         * 1) 原始数组使用静态分配int[] arr = {1, 2, 3};
         * 2) 增加的元素4，直接放在数组的最后 arr = {1, 2, 3, 4};
         *    arrNew = {1, 2, 3, 4}
         * 3) 用户可以通过如下方法来决定是否继续添加，添加成功，是否继续？y/n
         */
        int[] arr = {1, 2, 3};
        Scanner scanner = new Scanner(System.in);
        do {
            int[] newArr = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            System.out.println("请输入要添加的元素");
            newArr[newArr.length - 1] = scanner.nextInt();
            arr = newArr;
            System.out.println("添加元素后的数组：");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println("\n添加成功，是否继续？ y/n");
            char key = scanner.next().charAt(0);
            if (key == 'n') {
                break;
            }
        } while (true);
        System.out.println("退出了添加...");
    }
}
