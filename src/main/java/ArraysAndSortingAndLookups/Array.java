package ArraysAndSortingAndLookups;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        /**
         * 数组
         * 数组可以存放多个同一类型的数据。数组也是一种数据类型，是引用类型。
         */

        // 定义一组数组
        // double[] 表示 是double类型的数组，数组名 hens
        // {3, 5, 1, 3.4, 5, 50} 表示数组的元素
        double[] hens = {3, 5, 1, 3.4, 2, 50};

        // 遍历数组得到数组的所有元素的和
        double totalWeight = 0;
        for (int i = 0; i < hens.length; i++) {
            System.out.println("第" + (i + 1) + "个元素的值 = " + hens[i]);
            totalWeight += hens[i];
        }
        System.out.println("总体重 = " + totalWeight + " 平均体重 = " + totalWeight / hens.length);

        /**
         * 数组的使用
         * 使用方式1-动态初始化
         * 数组的定义：
         * 数据类型 数组名[] = new 数组类型[大小]
         * int a[] = new int[5]; // 创建了数组，名字a，存放5个int
         */

        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[5];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextDouble();
        }
        for (int j = 0; j < scores.length; j++) {
            System.out.println("第" + j + "个成绩为：" + scores[j]);
        }

        /**
         * 使用方式2-动态初始化
         * =>先声明数组
         * 语法：数据类型 数组名[]; 也可以 数据类型[] 数组名;
         * int a[]; 或者 int[] a;
         *
         * =>创建数组
         * 语法：数组名 = new 数据类型[大小];
         * a = new int[10];
         */
        double[] newScores; // 这时newScores是null
        newScores = new double[10]; // 分配内存空间，可以存放数据
        for (int i = 0; i < newScores.length; i++) {
            newScores[i] = scanner.nextDouble();
        }
        for (int j = 0; j < newScores.length; j++) {
            System.out.println("第" + j + "个成绩为：" + newScores[j]);
        }

        /**
         * 使用方式3-静态初始化
         * 初始化数组
         * 语法：数据类型 数组名[] = {元素值, 元素值 ...};
         * double hens[] = {3, 5, 1, 3.4, 2, 50};
         * 等价于
         * double hens[] = new double[6];
         * hens[0] = 3; hens[1] = 5; hens[2] = 1; hens[3] = 3.4; hens[4] = 2; hens[5] = 50;
         */

        /**
         * 数组使用注意事项和细节
         * 1) 数组是多个相同类型数据的组合，实现对这些数据的统一管理。
         * 2) 数组中的元素可以是任何数据类型，包括基本类型和引用类型，但是不能混用。
         * 3) 数组创建后，如果没有赋值，有默认值：
         *    int -> 0, short -> 0, byte -> 0, long -> 0, float -> 0.0, double -> 0.0, char -> \u0000
         *    boolean -> false, String -> null
         * 4) 使用数组的步骤 1.声明数组并开辟空间 2.给数组各个元素赋值 3.使用数组
         * 5) 数组的下标是从0开始的。
         * 6) 数组下标必须在指定范围内使用，否则报：下标越界异常。
         * 7) 数组属引用类型，数组型数据是对象(object)
         */
    }
}
