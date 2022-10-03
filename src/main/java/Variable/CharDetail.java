package Variable;

public class CharDetail {
    public static void main(String[] args) {
        // char 基本使用
        char c1 = 'a';
        char c2 = '\t';
        char c3 = '甘';
        char c4 = 97;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c4);

        // 在Java中，char的本质是一个整数，在默认输出时，是Unicode码对应的字符
        System.out.println((int) c4);

        // char类型是可以进行运算的，相当于一个整数，因为它都有对应的Unicode码
        System.out.println('a' + 10);

        char c5 = 'b' + 1;
        System.out.println((int) c5);
        // 99
        System.out.println(c5);
        // c

        /**
         * ASCII编码表 一个字节表示，一个128个字符，实际上一个字节可以表示256个字符，只用128个
         */
    }
}
