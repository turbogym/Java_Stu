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
         * 内存形式：
         * 在栈中的a保存1个地址，在堆中的对应地址中存放2个地址，这2个地址对应的堆中的内存块才分别存放数据。
         */

        /**
         * 使用方式2-动态初始化
         * 先声明：类型 数组名[][];
         * 再定义（开辟空间）数组名 = new 类型[大小][大小]
         * 赋值（有默认值，比如int 类型的就是0）
         */

        /**
         * 使用方式3-动态初始化-列数不确定
         * 输出：
         * i = 0: 1
         * i = 1: 2 2
         * i = 2: 3 3 3
         */
        int[][] arr2 = new int[3][]; // 创建二维数组，一共有3个一维数组，但是每个以为数组还没有开辟空间
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = new int[i + 1]; // 给每个一维数组开空间 new，如果没有给一维数组开辟空间，那么arr2[i]就是null
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = i + 1;
            }
        }
        System.out.println("arr2的元素：");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }

        /**
         * 使用方式4-静态初始化
         * 定义：类型 数组名[][] = {{值1, 值2...}, {值1, 值2...}, {值1, 值2...}}
         * 直接使用即可。[固定方式访问]
         */
        int[][] arr3 = {{1, 1, 1}, {2, 2, 2, 2}, {100}};
    }
}