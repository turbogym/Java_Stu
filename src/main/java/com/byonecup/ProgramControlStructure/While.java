package com.byonecup.ProgramControlStructure;

public class While {
    public static void main(String[] args) {
        /**
         * 基本语法：
         * while (循环条件) {
         *     循环体(语句);
         *     循环变量迭代;
         * }
         * 说明：
         * while循环也有四要素，只是四要素的位置不一样。
         * 细节：
         * 1) 循环条件是返回一个布尔值的表达式
         * 2) while循环是先判断再执行的语句
         */
        int i = 0;
        while (i < 10) {
            System.out.println("基础不牢，地动山摇。" + (i + 1));
            i++;
        }
        System.out.println("退出while循环，程序继续... i = " + i);

        /**
         * 打印1~100之间所有能被3整除的数
         */
        int num = 1;
        while (num <= 100) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
            num++;
        }

        /**
         * 打印40~200之间所有的偶数
         */
        int start = 40;
        int end = 200;
        while (start < end) {
            if (start % 2 == 0) {
                System.out.println(start);
            }
            start++;
        }
    }
}
