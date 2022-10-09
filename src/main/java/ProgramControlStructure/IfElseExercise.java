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
    }
}
