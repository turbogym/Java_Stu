package ProgramControlStructure;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
//        exercise1();
//        exercise2();
//        exercise3();
//        exercise4();
//        exercise5();
//        exercise6();
        exercise7();
        exercise8();
    }

    static void exercise1() {
        /**
         * 某人有100,000元，没经过一次路口，需要缴费，规则如下：
         * 1) 当现金>50000时，每次交5%
         * 2) 当现金<=50000时，每次交1000
         * 编程计算该人可以经过多少次路口，要求：使用while + break方式完成
         */
        double money = 100000;
        int count = 0;
        while (true) {
            if (money > 50000) {
//                money -= money * 0.05;
                money *= 0.95; // 过完一次路口，剩余的钱
                count++;
            } else if (money >= 1000) {
                money -= 1000;
                count++;
            } else { // money < 1000
                break;
            }
        }
        System.out.println("可以过" + count + "次路口，剩余" + money + "元。");
    }

    static void exercise2() {
        /**
         * 实现判断一个整数，属于哪个范围：大于0；小于0；等于0
         */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("大于0");
        } else if (num < 0) {
            System.out.println("小于0");
        } else {
            System.out.println("等于0");
        }
    }

    static void exercise3() {
        /**
         * 判断一个年份是否为闰年
         */
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "是闰年。");
        } else {
            System.out.println(year + "不是闰年。");
        }
    }

    static void exercise4() {
        /**
         * 判断一个整数是否是水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
         * 例如：153 = 1 * 1 * 1 + 5 * 5 * 5 + 3 * 3 * 3
         */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int digit = num % 10;
        int decimal = (num % 100) / 10;
        int hundred = num / 100;
        System.out.println(digit + " " + decimal + " " + hundred);
        if (num == (Math.pow(digit, 3) + Math.pow(decimal, 3) + Math.pow(hundred, 3))) {
            System.out.println(num + "是水仙花数。");
        } else {
            System.out.println(num + "不是水仙花数。");
        }
    }

    static void exercise5() {
        /**
         * 输出1~100之间的不能被5整除的数，每5个一行
         */
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 != 0) {
                System.out.print(i + "\t");
                count++;
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }

    static void exercise6() {
        /**
         * 输出小写的a~z以及大写的Z~A
         */
        char a = 'a'; // 97
        char Z = 'Z'; // 90
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = 0; j < 26; j++) {
            System.out.print((char) (Z - j) + " ");
        }
    }

    static void exercise7() {
        /**
         * 求出1-1/2+1/3-1/4...1/100的和
         */
        double res = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                /**
                 * 遇到小数要注意精度问题！！！
                 */
                res -= 1.0 / i; // 这里分子的1要写成1.0，才能保留精度（得到精确的值）
            } else {
                res += 1.0 / i;
            }
        }
        System.out.println("结果是：" + res);
    }

    static void exercise8() {
        /**
         * 求 1 + (1 + 2) + (1 + 2 + 3) + ... + (1 + 2 + 3 + ... + 100)的结果
         */
        int result = 0;
        for (int i = 1; i <= 100; i++) { // i表示第几项，同时也是当前项的最后一个数
            for (int j = 1; j <= i; j++) { // 内层对1~i进行循环
                result += j;
            }
        }
        System.out.println("结果是：" + result);
    }
}
