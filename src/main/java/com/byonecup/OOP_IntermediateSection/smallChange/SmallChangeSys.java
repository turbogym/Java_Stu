package com.byonecup.OOP_IntermediateSection.smallChange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        /**
         * 1. 菜单显示
         *      使用do...while，因为菜单至少必须显示一次
         *
         * 2. 零钱通明细
         *      (1) 可以把收益入账和消费，保存到数组
         *      (2) 也可以使用对象
         *      (3) 简单的，可以使用String拼接
         *
         * 3. 收益入账
         * 4. 消费
         * 5. 退出系统
         * 6. 当用户输入4退出时，给出提示，用户必须输入正确的y/n，否则循环输入指令。
         *      (1) 定义一个变量接收用户的输入
         *      (2) 使用while + break组合控制循环，处理接收到的y/n
         *      (3) 退出while后，再判断输入的是y/n
         * 7. 在收益入账和消费时，判断金额是否合理，并给出相应的提示。
         */

        // 定义相关的变量
        // 1. 菜单
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        // 2. 零钱通明细
        String details = "----------零钱通明细----------";
        // 3. 收益入账
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); // 用于日期格式化
        // 4. 消费
        String note = "";
        // 5. 退出

        do {
            System.out.println("\n----------零钱通菜单----------");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入账");
            System.out.println("\t\t3 消费");
            System.out.println("\t\t4 退\t出");
            System.out.println("请选择（1~4）：");
            key = scanner.next();

            // 使用switch分支结构
            switch (key) {
                case "1":
                    System.out.println("当前选择1 零钱通明细");
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("当前选择2 收益入账");
                    System.out.print("收益入账金额：");
                    money = scanner.nextDouble();
                    // money 的值的范围校验
                    if (money <= 0) {
                        System.out.println("收益入账金额需要大于0！");
                        break;
                    }
                    balance += money;
                    // 拼接details
                    date = new Date(); // 获取当前日期
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t余额：" + balance;
                    break;
                case "3":
                    System.out.println("当前选择3 消费");
                    System.out.println("消费金额：");
                    money = scanner.nextDouble();
                    // 消费金额校验
                    if (money <= 0 || money > balance) {
                        System.out.println("您的消费应该在 0~" + balance + "之间！");
                        break;
                    }
                    System.out.println("消费说明：");
                    note = scanner.next();
                    balance -= money;
                    // 拼接details
                    date = new Date(); // 获取当前日期
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t余额：" + balance;
                    break;
                case "4":
                    System.out.println("当前选择4 退出");
                    String choose = "";
                    while (true) {
                        System.out.println("你确定要退出吗？y/n");
                        choose = scanner.next();
                        if ("y".equals(choose) || "n".equals(choose)) {
                            break;
                        }
                    }
                    if (choose.equals("y")) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("输入有误！");
            }
        } while (loop);
        System.out.println("----------退出零钱通----------");

    }
}
