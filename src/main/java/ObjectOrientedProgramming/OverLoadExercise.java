package ObjectOrientedProgramming;

public class OverLoadExercise {
    public static void main(String[] args) {
        /**
         * 编写程序，类Methods中定义三个重载方法并调用。方法名为m。
         * 三个方法分别接收一个int参数、两个int参数、一个字符串参数。
         * 分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
         * 在主类的main()方法中分别用参数区别调用三个方法。
         */
        Methods m = new Methods();
        m.m(5);
        m.m(3, 4);
        m.m("Hello~");

        /**
         * 在Methods类，定义三个重载方法max(),
         * 第一个方法，返回两个int值中的最大值，
         * 第二个方法，返回两个double值中的最大值，
         * 第三个方法，返回三个double值中的最大值，
         * 并分别调用三个方法。
         */
        System.out.println(m.max(3, 4));
        System.out.println(m.max(3.3, 4.4));
        System.out.println(m.max(1.2, 2.3, 10));
    }
}

class Methods {
    public void m(int n) {
        System.out.println(n * n);
    }

    public void m(int n1, int n2) {
        System.out.println(n1 * n2);
    }

    public void m(String str) {
        System.out.println(str);
    }

    public int max(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }

    public double max(double n1, double n2) {
        return n1 > n2 ? n1 : n2;
    }

    public double max(double n1, double n2, double n3) {
        double max1 = n1 > n2 ? n1 : n2;
        return max1 > n3 ? max1 : n3;
    }
}