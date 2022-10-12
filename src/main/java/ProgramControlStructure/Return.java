package ProgramControlStructure;

public class Return {
    public static void main(String[] args) {
        /**
         * 跳转控制语句-return
         * 介绍：
         * return使用在方法，表示跳出所在的方法。
         */
        for (int i = 0; i < 5; i++) {
            if (i==3) {
                System.out.println("turbo~" + i);
                return;
//                 continue;
//                 break;
            }
            System.out.println("Hello World");
        }
        System.out.println("go on...");
    }
}
