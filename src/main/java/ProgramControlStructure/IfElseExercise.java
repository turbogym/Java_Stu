package ProgramControlStructure;

import java.util.Scanner;

public class IfElseExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d1 = scanner.nextDouble();
        double d2 = scanner.nextDouble();
        if (d1 > 10.0 && d2 < 20.0) {
            double res = d1 + d2;
            System.out.println(res);
        } else {
            System.out.println("输入的数字不满足条件。");
        }

        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        int iRes = i1 + i2;
        if (iRes % 3 == 0 && iRes % 5 == 0) {
            System.out.println("两数之和既能被3整除又能被5整除。");
        }

        /**
         * 判断一个年份是否是闰年，闰年的条件是否符合下面二者之一：
         * （1）年份能被4整除，但不能被100整除；（2）能被400整除
         */
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "年是闰年。");
        } else {
            System.out.println(year + "年不是闰年。");
        }
    }
}
