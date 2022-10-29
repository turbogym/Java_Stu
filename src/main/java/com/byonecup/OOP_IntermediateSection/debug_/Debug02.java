package com.byonecup.OOP_IntermediateSection.debug_;

public class Debug02 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i <= arr.length; i++) {
            System.out.println("arr[" + i + "]  = " + arr[i]);
        }
        System.out.println("退出了for循环...");
    }
}
