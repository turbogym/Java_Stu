package ObjectOrientedProgramming_PrimarySection;

public class MethodExercise01 {
    public static void main(String[] args) {
        /**
         * 编写类AA 方法：判断一个数是奇数还是偶数，返回boolean
         */
        AA aa = new AA();
        if (aa.isOdd(15)) {
            System.out.println("是一个奇数");
        } else {
            System.out.println("是一个偶数");
        }

        /**
         * 根据行、列、宇符打印 对应行数和列数的字符，
         * 比如：行：4，列：4，字符＃,则打印相应的效果
         */
        aa.print(4, 4, '#');
    }
}

class AA {
    public boolean isOdd(int num) {
//        if (num % 2 == 0) {
//            return false;
//        } else {
//            return true;
//        }

//        return num % 2 != 0 ? true : false;

        return num % 2 != 0;
    }

    public void print(int row, int col, char c) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
