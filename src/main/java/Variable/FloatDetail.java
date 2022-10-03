package Variable;

public class FloatDetail {
    public static void main(String[] args) {
        /**
         * 关于浮点数在机器中存放形式的简单说明，浮点数 = 符号位 + 指数位 + 尾数位
         * 尾数部分可能丢失，造成精度损失（小数都是近似值）
         */

        /**
         * Java的浮点型常量默认为double型，声明float型常量，须后加'f'或'F'
         * 浮点型常量有两种表示形式
         *    十进制数形式：如：5.12 512.0f .512（必须有小数点）
         *    科学计数法形式：如：5.12e2[5.12*10的2次方] 5.12E-2[5.12/10的2次方]
         */

        // float num1 = 1.1; // 错误
        float num2 = 1.1F;
        double num3 = 1.1;
        double num4 = 1.1F;

        double num5 = 0.512;
        double num6 = .512;

        double num7 = 2.1234567851;
        float num8 = 2.1234567851F;
        System.out.println(num7);
        System.out.println(num8);

        /**
         * 浮点数使用陷阱：2.7 和 8.1 / 3 比较
         */
        double n1 = 2.7;
        double n2 = 8.1 / 3;
        System.out.println(n1);
        System.out.println(n2);
        // !!!对运算结果是小数的进行相等判断时，要以两个数的差值的绝对值，在某个精度范围内判断
        System.out.println(Math.abs(n1 - n2));
        if (Math.abs(n1 - n2) < 0.000001) {
            System.out.println("差值非常小，到规定的精度，相等");
        }
    }
}
