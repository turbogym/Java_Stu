package ObjectOrientedProgramming;

public class Method02 {
    public static void main(String[] args) {
        // 遍历一个数组，输出数组的各个元素值
        int[][] map = {{0, 0, 1}, {1, 1, 1}, {1, 1, 3}};

        // 传统方式
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        // 再次遍历
        // 使用方法完成输出
        MyTools tool = new MyTools(); // 创建MyTools对象
        tool.printArr(map);

        /**
         * 成员方法的定义
         * 访问修饰符 返回数据类型 方法名 (形参列表...) { // 方法体
         *     语句;
         *     return 返回值;
         * }
         *
         * 1) 形参列表：表示成员方法输入 cal(int n), getSum(int n1, int n2)
         * 2) 数据类型(返回类型)：表示成员方法输出，void表示没有返回值
         * 3) 方法主体：表示为了实现某一功能代码块
         * 4) return语句不是必须的
         */

    }
}

// 把输出的功能，写到一个类的方法中，然后调用该方法即可
class MyTools {
    // 方法，接收一个二维数组
    public void printArr(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}