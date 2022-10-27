package com.byonecup.OOP_IntermediateSection.pkg;

import java.util.Arrays;

public class Import01 {
    /**
     * 1. package的作用是声明当前类所在的包，需要放在类的最上面，一个类中最多只有一句package
     * 2. import指令位置放在package的下面，在类定义前面，可以有多句且没有顺序要求。
     */
    public static void main(String[] args) {
        int[] arr = {-1, 20, 2, 13, 3};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
