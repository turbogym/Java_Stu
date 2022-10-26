package com.byonecup.Variable;

public class AutoConvert {
    public static void main(String[] args) {
        /**
         * 当Java程序在进行赋值或者运算时，精度小的数据类型自动转换成精度大的数据类型
         * 数据类型按精度（容量）大小排序为：
         * char -> int -> long -> float -> double
         * byte -> short -> int -> long -> float -> double
         */
        int a = 'c';
        double d = 80;
        System.out.println(a);
        System.out.println(d);

        /**
         * 1）有多种数据类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行运算
         * 2）把精度（容量）大的数据类型赋值给精度（容量）小的数据类型时，就会报错，反之就会进行自动类型转换
         * 3）(byte, short) 和 char 之间不会相互自动转换
         * 4）byte, short, char他们三者可以计算，在计算时首先转换为int类型
         * 5）boolean不参与转换
         * 6）自动提升原则：表达式结果的类型自动提升为 操作数中最大的类型
         */

        byte b1 = 1;
        byte b2 = 2;
        short s1 = 1;
        // short res= b1 + s1; // 错误，b2 + s1 => int
        int res = b1 + s1;
        // byte res = b1 + b2; // 错误，b1 + b2 => int
    }
}
