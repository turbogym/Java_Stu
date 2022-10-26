package com.byonecup.ObjectOrientedProgramming_PrimarySection;

import java.util.Random;
import java.util.Scanner;

public class Exercises {
    // 本章练习题
    public static void main(String[] args) {
        // 编写类A01，定义方法max，实现求某个double数组的最大值，并返回
        A01 a01 = new A01();
        double[] arr = {64.3, 98.2, 35.3};
        Double res = a01.max(arr);
        if (res != null) {
            System.out.println("最大值 = " + res);
        } else {
            System.out.println("数组不能为null或者{}！");
        }

        // 编写类A02，定义方法find，实现查找某字符串数组中的元素查找，并返回索引，如果找不到，返回-1
        String[] strs = {"hello", "wow", "turbo"};
        String findStr = "wow";
        A02 a02 = new A02();
        int strIndex = a02.find(strs, findStr);
        System.out.println("查找的index = " + strIndex);

        // 编写类Book，定义方法updatePrice，实现更改某本书的价格，具体：
        // 如果价格 > 150，则更改为150，如果价格 > 100，更改为100，否则不变。
        Book book = new Book("小王子", 20.5);
        book.info();
        book.updatePrice();
        book.info();

        // 编写类A03，实现数组的复制功能copyArr，输入旧数组，返回一个新数组，元素和旧数组一样
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int length = scanner.nextInt();
        int[] arr03 = new int[length];
        for (int i = 0; i < length; i++) {
            arr03[i] = scanner.nextInt();
        }
        A03 a03 = new A03();
        a03.copyArr(arr03);
        System.out.println();

        // 定义一个圆类Circle，定义属性：半径，提供显示圆周长功能的方法，提供显示圆面积的方法
        Circle circle = new Circle(5);
        System.out.println("圆周长 = " + circle.WeekLength());
        System.out.println("圆面积 = " + circle.Area());

        // 创建一个Cale计算类，在其中定义2个变量表示两个操作数，定义四个方法实现求和、差、乘、商（要求除数为0的话，要提示）并创建两个对象分别测试
        Cale cale = new Cale(6.9, 10);
        System.out.println("和 = " + cale.sum());
        System.out.println("差 = " + cale.minus());
        System.out.println("积 = " + cale.mul());
        if (cale.div() != null) {
            System.out.println("商 = " + cale.div());
        }

        // 举例：匿名对象的使用
        new Test().count1();
        Test t1 = new Test();
        t1.count2();
        t1.count2();

        //
        Demo d1 = new Demo();
        Demo d2 = d1;
        d2.m();
        System.out.println(d1.i);
        System.out.println(d2.i);

        // 在测试方法中，调用method方法，代码如下，编译正确，试写出method方法的定义形式，
        // 调用语句为：System.out.printIn(method(method(10.0,20.0),100);
        /**
         * public double method(double d1, double d2) {...}
         */

        // 创建一个Employee类，属性有（名字，性别，年龄，职位，薪水），提供3个构造方法，
        // 可以初始化(1)（名字，性别，年龄，职位，薪水），(2)（名字，性别，年龄）(3)（职位，薪水）
        // 要求充分 复用 构造器
        Employee employee = new Employee();

        // 将对象作为参数传递给方法。
        // 题目要求：
        // (1) 定义一个Circle01类，包含一个double型的radius属性代表圆的半径，findArea()方法返回圆的面积。
        // (2) 定义一个类PassObject,在类中定义一个方法printAreas(),该方法的定义如下：
        //      public void printAreas(Circle c,int times)  // 方法签名/声明
        // (3) 在printAreas()方法中打印输出1到times之间的每个整数半径值，以及对应的面积。
        //      例如，times为5，则输出半径1,2,3,4,5，以及对应的圆面积。
        // (4) 在main方法中调用printAreas0方法，调用完毕后输出当前半径值。
        Circle01 circle01 = new Circle01();
        PassObject passObject = new PassObject();
        passObject.printAreas(circle01, 6);

        // 有个人Tom，设计他的成员变量、成员方法，可以电脑猜拳
        // 电脑每次都会随机生成0,1,2
        // 0表示石头 1表示剪刀 2表示布
        // 并要可以显示Tom的输赢次数（清单）
        Tom t = new Tom();
        int isWinCount = 0;

        int[][] arr1 = new int[3][3]; // 二维数组用来接收局数，Tom出拳情况以及电脑出拳情况
        int j = 0;

        String[] arr2 = new String[3]; // 一维数组用来接收输赢情况

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入你要出的拳（0-拳头，1-剪刀，2-布）：");
            int num = scanner.nextInt();
            t.setTomGuessNum(num);
            int tomGuess = t.getTomGuessNum();
            arr1[i][j + 1] = tomGuess;

            int comGuess = t.computerNum();
            arr1[i][j + 2] = comGuess;

            String isWin = t.vsComputer();
            arr2[i] = isWin;
            arr1[i][j] = t.count;

            System.out.println("=============================");
            System.out.println("局数\t玩家出拳\t电脑出拳\t输赢情况");
            System.out.println(t.count + "\t" + tomGuess + "\t\t" + comGuess + "\t\t" + isWin);
            System.out.println("=============================");
            System.out.println("\n\n");
            isWinCount = t.winCount(isWin);
        }
        System.out.println("局数\t玩家出拳\t电脑出拳\t输赢情况");
        for (int a = 0; a < arr1.length; a++) {
            for (int b = 0;b<arr1[a].length;b++) {
                System.out.print(arr1[a][b] + "\t\t\t");
            }
            System.out.print(arr2[a]);
            System.out.println();
        }
        System.out.println("你赢了" + isWinCount + "次！");
    }
}

class A01 {
    public Double max(double[] nums) { // Double是一个包装类，允许返回null
        if (nums != null && nums.length > 0) {
            double maxNum = -1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > maxNum) {
                    maxNum = nums[i];
                }
            }
            return maxNum;
        } else {
            return null;
        }
    }
}

class A02 {
    public int find(String[] strs, String findStr) {
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals(findStr)) {
                return i;
            }
        }
        return -1;
    }
}

class Book {
    String name;
    double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void updatePrice() {
        if (this.price > 150) {
            this.price = 150;
        } else if (this.price > 100) {
            this.price = 100;
        }
    }

    // 显示书籍情况
    public void info() {
        System.out.println("书名 = " + this.name + " 价格 = " + this.price);
    }
}

class A03 {
    public int[] copyArr(int[] arr) {
        System.out.println("---复制的数组为---");
        int[] copyArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }
        return copyArr;
    }
}

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double WeekLength() {
        double weekLength = 2 * radius * Math.PI;
        return weekLength;
    }

    public double Area() {
        double area = radius * radius * Math.PI;
        return area;
    }
}

class Cale {
    double num1;
    double num2;

    public Cale(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double sum() {
        return num1 + num2;
    }

    public double minus() {
        return num1 - num2;
    }

    public double mul() {
        return num1 * num2;
    }

    public Double div() {
        if (num2 == 0) {
            System.out.println("除数不能为0");
            return null;
        } else {
            return num1 / num2;
        }
    }
}

class Test {
    int count = 9;

    public void count1() {
        count = 10;
        System.out.println("count1 = " + count);
    }

    public void count2() {
        System.out.println("count1 = " + count++);
    }
}

class Demo {
    int i = 100;

    public void m() {
        int j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}

class Employee {
    String name;
    char gender;
    int age;
    String job;
    double sal;

    public Employee() {
    }

    public Employee(String job, double sal) {
        this.job = job;
        this.sal = sal;
    }

    public Employee(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Employee(String name, char gender, int age, String job, double sal) {
        this(name, gender, age);
        this.job = job;
        this.sal = sal;
    }
}

class Circle01 {
    double radius;

    public double findArea() {
        return Math.PI * radius * radius;
    }

    // 添加方法setRadius，修改对象的半径值
    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class PassObject {
    public void printAreas(Circle01 c, int times) {
        System.out.println("Radius\tArea");
        for (int i = 1; i <= times; i++) {
            c.setRadius(i);
            System.out.println((double) i + "\t\t" + c.findArea());
        }
    }
}

class Tom {
    // 玩家出拳的类型
    int tomGuessNum;
    // 电脑出拳的类型
    int comGuessNum;
    // 玩家赢的次数
    int winCountNum;
    // 比赛的次数
    int count = 1;

    public void showInfo() {

    }

    public int computerNum() {
        Random r = new Random();
        comGuessNum = r.nextInt(3); // 方法 返回0~2的随机数
        return comGuessNum;
    }

    public void setTomGuessNum(int tomGuessNum) {
        if (tomGuessNum > 2 || tomGuessNum < 0) {
            throw new IllegalArgumentException("数字输入有误");
        }
        this.tomGuessNum = tomGuessNum;
    }

    public int getTomGuessNum() {
        return tomGuessNum;
    }

    public String vsComputer() {
        if (tomGuessNum == 0 && comGuessNum == 1) {
            return "你赢了！";
        } else if (tomGuessNum == 1 && comGuessNum == 2) {
            return "你赢了！";
        } else if (tomGuessNum == 2 && comGuessNum == 0) {
            return "你赢了！";
        } else if (tomGuessNum == comGuessNum) {
            return "平手";
        } else {
            return "你输了...";
        }
    }

    public int winCount(String isWin) {
        if("你赢了！".equals(isWin)) {
            winCountNum++;
        }
        return winCountNum;
    }
}