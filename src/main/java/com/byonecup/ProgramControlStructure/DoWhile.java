package com.byonecup.ProgramControlStructure;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        /**
         * 基本语法：
         * 循环变量初始化;
         * do {
         *     循环体(语句);
         *     循环变量迭代;
         * } while (循环条件);
         *
         * 说明：
         * 1) do while 是关键字
         * 2) 也有循环四要素，只是位置不一样
         * 3) 先执行，再判断，也就是说，一定会至少执行一次
         * 4) 最后有一个分号;
         * 5) while和do...while区别举例：要账。应用场景：比如显示菜单，至少先显示一次。
         */
        int i = 0;
        do {
            System.out.println("基础不牢，地动山摇。 i = " + (i + 1));
            i++;
        } while (i < 10);
        System.out.println("退出do...while，程序继续... i = " + i);

        /**
         * 打印1~100
         */
        int num = 1;
        do {
            System.out.println(num);
            num++;
        } while (num <= 100);

        /**
         * 计算1~100的和
         */
        int num2 = 1;
        int sum = 0;
        do {
            sum += num2;
            num2++;
        } while (num2 <= 100);
        System.out.println("1~100的和为：" + sum);

        /**
         * 统计1~200之间能被5整除但不能被3整除的个数
         */
        int num3 = 1;
        int count = 0;
        do {
            if (num3 % 5 == 0 && num3 % 3 != 0) {
                count++;
            }
            num3++;
        } while (num3 <= 200);
        System.out.println("1~200之间能被5整除但不能被3整除的个数为：" + count);

        /**
         * 如果李三不还钱，则王五一直降龙十八掌，直到李三说还钱为止。
         */
        char c = 'n';
        do {
            System.out.println("降龙十八掌~");
            System.out.println("王五问：还钱吗？ y/n");
            Scanner scanner = new Scanner(System.in);
            c = scanner.next().charAt(0);
        } while (c != 'y');
        System.out.println("李三还钱了！");
    }
}
