package com.byonecup.Variable;

public class ForceConvert {
    public static void main(String[] args) {
        /**
         * 自动类型转换的逆过程，将容量大的数据类型转换为容量小的数据类型。
         * 使用时加上强制转换符()
         * 可能造成精度降低或溢出，格外要注意！
         */
        int i = (int) 1.9;
        // 精度损失
        System.out.println(i);

        int j = 100;
        byte b1 = (byte) j;
        System.out.println(b1);

        int m = 2000;
        byte b2 = (byte) m;
        // 数据溢出
        System.out.println(b2);

        /**
         * 1）当进行数据的大小 从 大--->小 ，就需要使用到强制转换
         * 2）强制符号只针对于最近的操作数有效，往往会使用小括号提升优先级
         * 3）char类型可以保存int的常量值，但不能保存int的变量值，需要强转
         * 4）byte和short类型在进行运算时，当做int类型处理
         */
        // int x = (int) 10 * 3.5 + 6 * 1.5; // 编译错误
        int y = (int) (10 * 3.5 + 6 * 1.5);
        System.out.println(y);

        char c1 = 100;
        int n = 100;
        // char c2 = n; // 错误
        char c3 = (char) n;
        System.out.println(c3);
    }
}
