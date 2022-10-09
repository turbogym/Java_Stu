package ProgramControlStructure;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        /**
         * 基本语法：
         * if (条件表达式1) { 执行代码块1; } else if (条件表达式2) { 执行代码块2; } ... else { 执行代码块n; }
         */
        System.out.println("请输入信用分数：");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if (score >= 1 && score <= 100) {
            if (score == 100) {
                System.out.println("信用极好");
            } else if (score > 80) {
                System.out.println("信用优秀");
            } else if (score >= 60) {
                System.out.println("信用一般");
            } else {
                System.out.println("信用不及格");
            }
        } else {
            System.out.println("输入的分数范围不正确。");
        }

        /**
         * 案例
         */
        boolean b = true;
        if (b == false)  // 这里改成b = false，能编译通过，输出为c
            System.out.println("a");
        else if (b)
            System.out.println("b");
        else if (!b)
            System.out.println("c");
        else
            System.out.println("d");

    }
}
