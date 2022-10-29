package com.byonecup.OOP_IntermediateSection.smallChange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类是完成零钱通的各个功能的类
 * 使用OOP（面相对象编程）
 * 将各个功能对应一个方法
 */
public class SmallChangeSysOOP {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";
    String details = "----------零钱通明细----------";
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); // 用于日期格式化
    String note = "";

    public void mainMenu() {
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
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("输入有误！");
            }
        } while (loop);
    }

    public void detail() {
        System.out.println(details);
    }

    public void income() {
        System.out.println("当前选择2 收益入账");
        System.out.print("收益入账金额：");
        money = scanner.nextDouble();
        // money 的值的范围校验
        if (money <= 0) {
            System.out.println("收益入账金额需要大于0！");
            return;
        }
        balance += money;
        // 拼接details
        date = new Date(); // 获取当前日期
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t余额：" + balance;
    }

    public void pay() {
        System.out.println("当前选择3 消费");
        System.out.println("消费金额：");
        money = scanner.nextDouble();
        // 消费金额校验
        if (money <= 0 || money > balance) {
            System.out.println("您的消费应该在 0~" + balance + "之间！");
            return;
        }
        System.out.println("消费说明：");
        note = scanner.next();
        balance -= money;
        // 拼接details
        date = new Date(); // 获取当前日期
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t余额：" + balance;
    }

    public void exit() {
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
    }
}
