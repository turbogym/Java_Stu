package ObjectOrientedProgramming;

public class RecursionExercise {
    public static void main(String[] args) {
        R1 r1 = new R1();
        int res = r1.fibonacci(5);
        System.out.println(res);

        int res2 = r1.peach(1);
        if (res2 != -1) {
            System.out.println(res2);
        }
    }
}

class R1 {
    /**
     * 请使用递归的方式求出斐波那契数1,1,2,3,5,8,13...给你一个整数n，求出它的值是多少
     */
    public int fibonacci(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        } else {
            System.out.println("要求输入的n ≥ 1");
            return -1;
        }
    }

    /**
     * 猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个；
     * 以后每天猴子都吃其中的一半，然后再多吃一个。
     * 当到第10天的时候，想再吃时（但还没吃），发现只有1个桃子了。
     * 问题：最初共多少个桃子？
     *
     * 思路分析：// 逆推
     * 1. day = 10时 有1个桃子
     * 2. day = 9时 有(day10 + 1) * 2 = 4
     * 3. day = 8时 有(day9 + 1) * 2 = 10
     * 4. 规律：前一天的桃子 = (后一天的桃子 + 1) * 2
     */
    public int peach(int day) {
        if (day == 10) {
            return 1;
        } else if (day >= 1 && day <= 9) {
            return (peach(day + 1) + 1) * 2;
        } else {
            System.out.println("day的范围为1~10");
            return -1;
        }
    }
}
