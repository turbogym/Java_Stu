package com.byonecup.Operators;

public class ArithmeticOperator {
    public static void main(String[] args) {
        // /使用
        System.out.println(10 / 4);
        System.out.println(10.0 / 4);
        double d = 10 / 4;
        double d2 = 10.0f / 4;
        System.out.println(d);
        System.out.println(d2);

        // %使用
        // 在Java中 % 的本质：a % b = a - a / b * b
        // a % b 当 a 是小数时，公式 = a - (int) a / b * b;
        // 注意：有小数运算，得到的结果是近似值
        System.out.println(10 % 3);
        System.out.println(-10 % 3);
        System.out.println(10 % -3);
        System.out.println(-10 % -3);

        // ++使用
        int i = 10;
        i++;
        System.out.println(i);
        ++i;
        System.out.println(i);

        /**
         * 作为表达式使用
         * 前++：++i先自增后赋值
         * 后++：i++先赋值后自增
         */
        int j = 8;
        int k = ++j;
        int m = j++;
        System.out.println("k = " + k + " ,m = " + m + " ,j = " + j);
    }
}
