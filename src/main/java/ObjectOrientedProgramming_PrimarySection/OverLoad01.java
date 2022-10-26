package ObjectOrientedProgramming_PrimarySection;

public class OverLoad01 {
    /**
     * 方法重载
     * Java中允许同一个类中，多个同名方法的存在，但要求 形参列表不一致！
     * 重载的好处：
     * 1) 减轻了起名的麻烦
     * 2) 减轻了记名的麻烦
     *
     * 注意事项和细节
     * 1) 方法名：必须相同
     * 2) 形参列表：必须不同（形参类型或个数或顺序，至少有一样不同，参数名无要求）
     * 3) 返回类型：无要求
     */

    public static void main(String[] args) {
        MyCalculator mc = new MyCalculator();
        System.out.println(mc.calculate(3, 5.1));
    }
}

class MyCalculator {
    // 两个整数的和
    public int calculate(int n1, int n2) {
        return n1 + n2;
    }

    // 一个整数和一个double的和
    public double calculate(int n1, double n2) {
        return n1 + n2;
    }

    // 一个double和一个int的和
    public double calculate(double n1, int n2) {
        return n1 + n2;
    }

    // 三个int的和
    public int calculate(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}