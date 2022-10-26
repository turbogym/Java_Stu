package com.byonecup.SystemOfNumeration;

public class BitOperator {
    public static void main(String[] args) {
        // 1向右移2位↓（算数右移）
        int a = 1 >> 2;
        int b = -1 >> 2;
        int c = 1 << 2;
        int d = -1 << 2;
        // 逻辑右移↓（无符号右移），低位溢出，高位补0
        int e = 3 >>> 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        // 算数右移↓，低位溢出，符号位不变，并用符号位补溢出的高位，本质： 1 / 2 / 2 = 0
        int f = 1 >> 2;
        // 算数左移↓，符号位不变，低位补0，本质：1 * 2 * 2 = 4
        int g = 1 << 2;
        System.out.println(f);
        System.out.println(g);
        /**
         * ！！！特别说明：没有<<<符号！
         */
    }
}
