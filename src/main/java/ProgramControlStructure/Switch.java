package ProgramControlStructure;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        /**
         * switch基本语法
         * switch(表达式) {  // 表达式对应一个值
         *     case 常量1:
         *          语句块1;
         *          break;
         *     case 常量2:
         *          语句块2;
         *          break;
         *     ...
         *     default:
         *          default语句块;
         *          break;
         * }
         */
        char alphabet = 0; // char的默认值是'\u0000'
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入 a-g 中的任一字符：");
        alphabet = scanner.next().charAt(0);
        switch (alphabet) {
            case 'a':
                System.out.println("星期一");
                break;
            case 'b':
                System.out.println("星期二");
                break;
            case 'c':
                System.out.println("星期三");
                break;
            case 'd':
                System.out.println("星期四");
                break;
            case 'e':
                System.out.println("星期五");
                break;
            case 'f':
                System.out.println("星期六");
                break;
            case 'g':
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }
}
