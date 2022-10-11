package ProgramControlStructure;

public class ForExercise {
    public static void main(String[] args) {
        /**
         * 打印1~100之间所有是9的倍数的整数，统计个数 及 总和
         */
        // 设置变量以适应后期更改需求
        int start = 1;
        int end = 100;
        int t = 9;
        int count = 0;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % t == 0) {
                System.out.print(i + " ");
                count++;
                sum += i;
            }
        }
        System.out.println("\n个数：" + count + " 总和：" + sum);

        /**
         * 完成表达式的输出：
         * 0 + 5 = 5
         * 1 + 4 = 5
         * 2 + 3 = 5
         * 3 + 2 = 5
         * 4 + 1 = 5
         * 5 + 0 = 5
         */
        int k = 5;
        for (int i = 0; i <= k; i++) {
            System.out.println(i + " + " + (k - i) + " = " + k);
        }
    }
}
