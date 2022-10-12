package ProgramControlStructure;

public class Continue {
    public static void main(String[] args) {
        /**
         * 基本介绍：
         * 1) continue语句用于结束本次循环，继续执行下一次循环。
         * 2) continue语句出现在多层嵌套的循环语句体中时，可以通过标签指明要跳过的是哪一层循环，这个和前面的标签使用的规则一样。
         *
         * 基本语法：
         * {
         *     ...
         *     continue;
         *     ...
         * }
         */
        int i = 1;
        while (i <= 4) {
            i++;
            if (i == 2) {
                continue;
            }
            System.out.println("i = " + i);
        }

        label1:
        for (int j = 0; j < 4; j++) {
            label2:
            for (int k = 0; k < 10; k++) {
                if (k == 2) {
                    // 观察以下分别输出的值
//                    continue; // 等价于 contin label2;
//                    continue label2;
                    continue label1;
                }
                System.out.println("k = " + k);
            }
        }
    }
}
