package ArraysAndSortingAndLookups;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        /**
         * 二维数组
         */
        int[][] arr = {{0, 0, 0, 0, 0, 0}, {0, 0, 1, 0, 0, 0},
                {0, 2, 0, 3, 0, 0}, {0, 0, 0, 0, 0, 0,}};

        // 二维数组的关键概念
        System.out.println("二维数组的元素个数 = " + arr.length);
        System.out.println(arr[2][3]);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        /**
         * 使用方式1-动态初始化
         * 语法：
         * 类型[][] 数组名 = new 类型[大小][大小];
         * 比如 int a[][] = new int[2][3];
         */


    }
}
