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
         *
         * switch注意事项和细节
         * 1）表达式数据类型，应和case后的常量类型一致，或者是可以自动转换成可以相互比较的类型。比如输入的是字符，而常量是int
         * 2）switch（表达式）中表达式的返回值必须是：（byte, short, int, char, enum, String）
         * 3）case子句中的值必须是常量，而不能是变量
         * 4）default子句是可选的，当没有匹配的case时，执行default
         * 5）break语句用来在执行完一个case分支后使程序跳出switch语句块；如果没有写break，程序会顺序执行到switch结尾
         */
        char alphabet = 0; // char的默认值是'\u0000'
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入 a-g 中的任一字符：");
        alphabet = scanner.next().charAt(0);
        // 在Java中,只要是有值返回,就是一个表达式
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
        System.out.println("退出了switch，程序继续...");
    }
}
