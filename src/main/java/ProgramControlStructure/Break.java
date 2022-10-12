package ProgramControlStructure;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        /**
         * 跳转控制语句-break
         * break语句用于终止某个语句块的执行，一般使用在switch或者循环中
         *
         * 基本语法：
         * {
         *     ...
         *     break;
         *     ...
         * }
         *
         */
        int count = 0;
        for (; ; ) {
            int num = (int) (Math.random() * 100 + 1);
            if (num == 97) {
                System.out.println("共执行" + count + "次");
                break;
            }
            count++;
        }
        /**
         * break语句出现在多层嵌套的语句块中，可以通过 标签 指明要终止的是哪一层语句块
         * 标签的使用：
         * label1: {
         *     label2: {
         *         label3: {
         *             ...
         *             break label2;
         *         }
         *     }
         * }
         * 1) break语句可以指定退出哪层
         * 2) label1是标签，名字由程序员指定
         * 3) break后指定到哪个label就退出到哪里
         * 4) 在实际的开发中，尽量不要使用标签
         * 5) 如果没有指定break，默认退出最近的循环体
         */
        label1:
        for (int j = 0; j < 4; j++) {
            label2:
            for (int i = 0; i < 10; i++) {
                if (i == 2) {
                    break label1;
                }
                System.out.println("i = " + i);
            }
            System.out.println("j....");
        }

        /**
         * 1~100以内的数求和，求出 当和 第一次大于20的当前数[for + break]
         */
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            if (sum > 20) {
                System.out.println("sum大于20，i = " + i);
                break;
            }
        }

        /**
         * 实现登录验证，有3次机会，如果用户名为"turbo"，密码为"666"提示登录成功，否则提示还有几次机会[for + break]
         */
        String username = "turbo";
        String password = "666";
        int chance = 3;
        for (int i = 0; i < chance; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String inputUsername = scanner.next();
            System.out.println("请输入密码：");
            String inputPwd = scanner.next();
            // if (inputUsername.equals(username) && inputPwd.equals(password)) {
            if (username.equals(inputUsername) && password.equals(inputPwd)) { // 实际开发中使用这种写法更好，可以避免空指针
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("用户名或密码错误！");
                if ((i + 1) <= chance) {
                    System.out.println("您还有" + (chance - i - 1) + "次机会！");
                }
            }
        }
    }
}
