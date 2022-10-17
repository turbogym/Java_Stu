package ArraysAndSortingAndLookups;

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
    }
}
