package ProgramControlStructure;

public class SwitchDetail {
    public static void main(String[] args) {
        /**
         * switch注意事项和细节
         * 1）表达式数据类型，应和case后的常量类型一致，或者是可以自动转换成可以相互比较的类型。比如输入的是字符，而常量是int
         */
        char c = 'a';
        switch (c) {
            case 'a':
                System.out.println("ok1");
                break;
            case 'b': // 如果写case "hello": 则编译不通过；如果写case 20:则可以编译通过
                System.out.println("ok2");
                break;
            default:
                System.out.println("ok3");
        }
        /**
         * 2）switch（表达式）中表达式的返回值必须是：（byte, short, int, char, enum[枚举], String）
         */
        /**
         * double c = 1.1;
         * switch (c) { // 错误
         *     case 1.1: // 错误
         *          System.out.println("ok3");
         *          break;
         * }
         */

        /**
         * 3）case子句中的值必须是常量('b')或常量表达式('b' + 1)，而不能是变量
         */
        /**
         * char c = 'a';
         * char c2 = 'b';
         * switch (c) {
         *     case c2: // 错误！
         * }
         */

        /**
         *
         * 4）default子句是可选的，当没有匹配的case时，执行default。如果没有default，没有匹配的case时，switch没有任何执行
         */

        /**
         * 5）break语句用来在执行完一个case分支后使程序跳出switch语句块；如果没有写break，程序会顺序执行到switch结尾（穿透），除非遇到了break;。
         */

    }
}
