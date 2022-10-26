package com.byonecup.ArraysAndSortingAndLookups;

public class ArrayReverse {
    public static void main(String[] args) {
        /**
         * 把数组的元素内容反转。
         * arr {11, 22, 33, 44, 55, 66} -> {66, 55, 44, 33, 22, 11}
         */

        /**
         * 方式1：
         * 把arr[0]和arr[5]进行交换 {66, 22, 33, 44, 55, 11}
         * 把arr[1]和arr[4]进行交换 {66, 55, 33, 44, 22, 11}
         * 把arr[2]和arr[3]进行交换 {66, 55, 44, 33, 22, 11}
         * 一共要交换3次 = arr.length / 2
         * 每次交换时，对应的下标 是 arr[i] 和 arr[arr.length - 1 - i]
         */
        int[] arr1 = {11, 22, 33, 44, 55, 66};
        for (int i = 0; i < arr1.length / 2; i++) {
            int temp = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = arr1[i];
            arr1[i] = temp;
        }
        System.out.println("方式1翻转后的数组：");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }

        /**
         * 方式2：
         * 使用逆序赋值方式
         * 先创建一个新的数组 newArr2，大小 arr2.length
         * 逆序遍历arr2，将每个元素拷贝到newArr2的元素中（顺序拷贝）
         * 建议增加一个循环变量 j -> 0~5
         */
        int[] arr2 = {11, 22, 33, 44, 55, 66};
        int[] newArr2 = new int[arr2.length];
        for (int i = arr2.length - 1, j = 0; i >= 0; i--, j++) {
            newArr2[j] = arr2[i];
        }
        // 让arr2指向newArr2数据空间，此时arr2原来的数据空间就没有变量引用，会被当做垃圾销毁
        arr2 = newArr2;
        // 输出arr2
        System.out.println("\n方式2翻转后的数组：");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }
    }
}
