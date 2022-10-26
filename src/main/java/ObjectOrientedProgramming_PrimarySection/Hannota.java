package ObjectOrientedProgramming_PrimarySection;

public class Hannota {
    public static void main(String[] args) {
        Tower tower = new Tower();
        tower.move(5, 'A', 'B', 'C');
    }
}

class Tower {
    // num表示要移动的个数，a b c分别表示A塔、B塔、C塔
    public void move(int num, char a, char b, char c) {
        // 如果只有一个盘 num = 1
        if (num == 1) {
            System.out.println(a + " -> " + c);
        } else {
            // 如果有多个盘，可以看成两个，最下面的 和 上面的所有
            // 1) 先一定上面所有的盘到b，借助c
            move(num - 1, a, c, b);
            // 2) 把最下面的这个盘，移动到c
            System.out.println(a + " -> " + c);
            // 3) 再把B塔的所有盘移动到C，借助A塔
            move(num - 1, b, a, c);
        }
    }
}