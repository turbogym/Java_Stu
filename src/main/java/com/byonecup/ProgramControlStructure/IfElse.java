package com.byonecup.ProgramControlStructure;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        /**
         * 基本语法：
         * if (条件表达式) { 执行代码块;(可以有多条语句) }
         * 如果{}中只有一条语句，则{}可以省略
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = scanner.nextInt();
        if (age > 18) {
            System.out.println("年龄大于18岁。");
        }
        System.out.println("程序继续...");

        System.out.println("请输入新的年龄：");
        int age2 = scanner.nextInt();
        if (age2 > 18) {
            System.out.println("年龄大于18岁。");
        } else {
            System.out.println("年龄小于18岁。");
        }
        System.out.println("程序继续...");
    }
}
