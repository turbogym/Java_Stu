package Variable;

public class Start {
    public static void main(String[] args) {
        start2();
    }

    public static void start1() {
        // 变量有三个基本要素（类型 + 名称 + 值）
        int a = 1;
        int b = 3;
        b = 89;
        System.out.println(a);
        System.out.println(b);

        /**
         * 变量相当于内存中一个数据存储空间的表示。
         * 变量使用的基本步骤：
         * 1）声明变量：int a;
         * 2）赋值：a = 89;
         * 3）使用System.out.println(a);
         */
    }

    public static void start2() {
        int a = 1;
        int b = 3;
        b = 89;
        System.out.println(a);
        System.out.println(b);

        /**
         * 变量使用注意事项：
         * 1. 变量表示内存中的一个存储区域[不同的变量，类型不同，占用的空间大小不同，比如int4个字节、double8个字节]
         * 2. 该区域有自己的名称[变量名]和类型[数据类型]
         * 3. 变量必须先声明，后使用，即有顺序
         * 4. 该区域的数据可以在同一类型范围内不断变化
         * 5. 变量在同一个作用域内不能重名
         * 6. 变量 = 变量名 + 值 + 数据类型
         */
    }
}
