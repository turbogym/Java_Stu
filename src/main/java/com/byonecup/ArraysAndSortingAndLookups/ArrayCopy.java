package com.byonecup.ArraysAndSortingAndLookups;

public class ArrayCopy {
    public static void main(String[] args) {
        /**
         * 编写代码，实现数组拷贝（内容复制）
         * 将int[] arr1 = {10, 20, 30}; 拷贝到arr2数组
         * 要求数据空间是独立的（堆中的存放数据的位置就是数据空间）
         */
        int[] arr1 = {10, 20, 30};
        // 创建一个新的数组arr2，开辟新的数据空间
        // 大小 arr1.length
        int[] arr2 = new int[arr1.length]; // new表示堆中新开辟了空间，默认的值都是0
        // 遍历arr1，把每个元素拷贝到对应的位置
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        arr2[0] = 100; // 修改arr2的第一个元素的值，此时不影响arr1的第一个元素的值了
        // 输出arr1
        System.out.println("arr1 = ");
        for (int j = 0; j < arr1.length; j++) {
            System.out.println(arr1[j]);
        }
        // 输出arr2
        System.out.println("arr2 = ");
        for (int k = 0; k < arr2.length; k++) {
            System.out.println(arr2[k]);
        }
    }
}
