package com.byonecup.ProgramControlStructure;

import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {
        /**
         * 1. 使用switch把小写类型的char型转为大写（键盘输入）。只转换a, b, c, d, e 其它的输出"other"
         */
        Scanner scanner = new Scanner(System.in);
        char c;
        System.out.println("请输入一个小写字母a-e：");
        c = scanner.next().charAt(0);
        switch (c) {
            case 'a':
                System.out.println((char) (c - 32));
                break;
            case 'b':
                System.out.println((char) (c - 32));
                break;
            case 'c':
                System.out.println((char) (c - 32));
                break;
            case 'd':
                System.out.println((char) (c - 32));
                break;
            case 'e':
                System.out.println((char) (c - 32));
                break;
            default:
                System.out.println("other");
        }

        /**
         * 2. 对学生成绩大于60分的，输出"合格"。低于60分的，输出"不合格"。（注：输入的成绩不能大于100）
         * [score / 60]
         */
        double score; // 分数本身可以是带小数点的
        System.out.println("请输入成绩：");
        score = scanner.nextInt();
        // 使用if-else保证输入的成绩是有效的
        if (score >= 0 && score <= 100) {
            int scoreBool = (int) (score / 60);
            switch (scoreBool) {
                case 1:
                    System.out.println("合格");
                    break;
                case 0:
                    System.out.println("不合格");
                    break;
//                default:
//                    System.out.println("成绩输入不正确");
            }
        } else {
            System.out.println("请输入0~100之间的分数。");
        }


        /**
         * 3. 根据用于指定月份，打印该月份所属的季节。3, 4, 5 春季，6, 7, 8 夏季，9, 10, 11 秋季，12, 1 ,2 冬季。
         * [使用穿透]
         */
        int month;
        System.out.println("请输入月份：");
        month = scanner.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("月份输入不正确。");
        }
    }
}
