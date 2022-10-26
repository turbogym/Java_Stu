package com.byonecup.Operators;

public class InverseOperator {
    public static void main(String[] args) {
        // !（逻辑非）和^（逻辑异或）使用
        System.out.println(60 > 20);
        System.out.println(!(60 > 20));

        boolean b1 = (10 > 1) ^ (3 < 5);
        System.out.println(b1);
        boolean b2 = (10 > 1) ^ (3 > 5);
        System.out.println(b2);
    }
}
