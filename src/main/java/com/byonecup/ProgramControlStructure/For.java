package com.byonecup.ProgramControlStructure;

public class For {
    public static void main(String[] args) {
        /**
         * 基本语法：
         * for (循环变量初始化; 循环条件; 循环变量迭代) { 循环操作（可以多条语句）; }
         *
         * 1) for关键字，表示循环控制
         * 2) for有四要素：（1）循环变量初始化 （2）循环条件 （3）循环操作 （4）循环变量迭代
         * 3) 循环操作，这里可以有多条语句，也就是我们要循环执行的代码
         * 4) 如果 循环操作（语句）只有一条语句，可以省略{}，建议不要省略
         */
        // 打印10句"基础不牢，地动山摇"
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1 + "基础不牢，地动山摇。");
        }
        /**
         * for注意事项
         * 1) 循环条件是返回一个布尔值的表达式
         * 2) for(;循环判断条件;)中的初始化和变量迭代可以写到其它地方，但是两边的分号不能省略
         * 3) 循环初始值可以有多条初始化语句，但要求类型一样，并且中间用逗号隔开，
         *    循环变量迭代也可以有多条变量迭代语句，中间用逗号隔开
         */
        int count = 3;
        for (int i = 0, j = 0; i < count; i++, j += 2) {
            System.out.println("i = " + i + " j = " + j);
        }

        int i = 1;
        for (; i <= 10; ) {
            System.out.println("i = " + i);
            i++;
        }
        System.out.println(i); // 11

//        int j = 0;
//        for (;;) { // 表示无限循环，一般配合break使用
//            System.out.println("ok~" + j++);
//        }
    }
}
