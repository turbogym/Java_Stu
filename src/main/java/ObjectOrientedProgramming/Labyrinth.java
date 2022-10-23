package ObjectOrientedProgramming;

public class Labyrinth {
    // 老鼠出迷宫
    public static void main(String[] args) {
        // 1. 先创建迷宫，用二维数组表示 int[][] map = new int[8][7];
        // 2. 先规定 map 数组的元素值：0表示可以走 1表示障碍物
        int[][] map = new int[8][7];
        // 3. 将最上面的一行和最下面的一行，全部设置为1
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        // 4. 将最右的一列和最左的一列，全部设置为0
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        // 5. 单独的障碍物 设置
        map[3][1] = 1;
        map[3][2] = 1;
        map[2][2] = 1; // 测试一个回溯

        // 输出当前的地图
        System.out.println("当前地图情况：");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        // 使用findWay给老鼠找路
        W w1 = new W();
        w1.findWay(map, 1, 1);

        System.out.println("找路的情况如下：");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class W {
    // 使用递归回溯的思想来解决老鼠出迷宫
    // 1. findWay方法就是专门来找出迷宫的路径
    // 2. 如果找到就返回true，否则返回false
    // 3. map就是二维数组，即迷宫
    // 4. i, j 就是老鼠的位置，初始化位置为(1,1)
    // 5. 因为是递归的找路，所以先规定 map 数组的各个值的含义：
    //    0 表示可以走（未走过）  1 表示障碍物  2 表示可以走（走过）  3 表示走过但走不通
    // 6. 当map[6][5] = 2时，就说明找到通路了，否则就继续找
    // 7. 先确定老鼠找路的策略 下->右->上->左
    public boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) { // 当前这个位置0，表示可以走但还未走过
                // 假定可以走通
                map[i][j] = 2;
                // 使用策略确定该位置是否真的可以走通
                if (findWay(map, i + 1, j)) {
                    return true;
                } else if (findWay(map,i, j + 1)){
                    return true;
                } else if (findWay(map,i - 1, j)) {
                    return true;
                } else if (findWay(map,i, j - 1)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else { // map[i][j] 只能等于1或2或3
                return false;
            }
        }
    }
}