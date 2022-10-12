package ProgramControlStructure;

import java.util.Scanner;

public class Multi_cycleControl {
    /**
     * 多重循环控制（重难点）
     * 介绍
     * 1) 将一个循环放在另一个循环体内，就形成了嵌套循环。其中，for, while, do...while
     * 均可以作为外层循环和内层循环。【建议一般使用两层，最多不要超过三层，否则代码的可读性很差】
     * 2) 实质上，嵌套循环就是把内层循环当成外层循环的循环体。当只有内层循环的循环条件为false时，
     * 才会完全跳出内层循环，才可结束外层的当次循环，开始下一次的循环。
     * 3) 设外层循环次数为m次，内层为n次，则内层循环体实际上需要执行(m * n)次。
     */
    public static void main(String[] args) {
        /**
         * 统计3个班成绩情况，每个班有5名同学，求出 各个班的平均分 和 所有班级的平均分。
         * 统计三个班及格人数，每个班有5名同学。
         * [学生成绩从键盘输入]
         */
        Scanner scanner = new Scanner(System.in);
        double totalScore = 0;
        int passNum = 0;
        int classNum = 3;
        int stuNum = 5;
        for (int i = 0; i < classNum; i++) {
            double sum = 0;
            for (int j = 0; j < stuNum; j++) {
                System.out.println("请输入第" + (i + 1) + "个班级的第" + (j + 1) + "个学生的成绩：");
                double score = scanner.nextDouble();
                if (score >= 60) {
                    passNum++;
                }
                sum += score;
                System.out.println("成绩为：" + score);
            }
            System.out.println("sum = " + sum + " 平均分 = " + (sum / stuNum));
            totalScore += sum;
        }
        System.out.println("三个班总分 = " + totalScore + " 平均分 = " + (totalScore / (classNum * stuNum)));
        System.out.println("及格人数 = " + passNum);

        /**
         * 打印出九九乘法表
         */
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + (i * j) + "\t");
            }
            System.out.println();
        }

        /**
         * 空心金字塔
         */
        int totalLine = 6;
        for (int i = 1; i <= totalLine; i++) {
            for (int k = 0; k < totalLine - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == 1 || i == totalLine) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
