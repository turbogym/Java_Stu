package UserInput;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // Scanner类 表示 简单文本扫描器
        Scanner myScanner = new Scanner(System.in);
        // myScanner就是Scanner类的对象
        System.out.println("请输入姓名：");
        String name = myScanner.next();
        // 当程序执行到next方法时，会等待用户输入
        System.out.println("请输入年龄：");
        int age = myScanner.nextInt();
        System.out.println("请输入薪水");
        double sal = myScanner.nextDouble();
        System.out.println("姓名：" + name + ", 年龄：" + age + ", 薪水：" + sal);
    }
}
