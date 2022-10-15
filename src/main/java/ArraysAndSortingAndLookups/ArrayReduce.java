package ArraysAndSortingAndLookups;

import java.util.Scanner;

public class ArrayReduce {
    public static void main(String[] args) {
        /**
         * 有一个数组{1, 2, 3, 4, 5}，可以将该数组进行缩减，提示用户是否继续缩减，每次缩减最后那个元素，
         * 当只剩下最后一个元素时，提示不能再缩减。
         */
        int[] arr = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        do {
            int[] newArr = new int[arr.length - 1];
            for (int i = 0; i < newArr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
            System.out.println("删减最后一个元素后的数组为：");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
            if (arr.length == 1) {
                System.out.println("\n只剩一个元素，不允许删除！");
                break;
            }
            System.out.println("\n是否继续删除？ y/n");
            char key = scanner.next().charAt(0);
            if (key == 'n') {
                break;
            }
        } while (true);
        System.out.println("退出删除程序...");
    }
}
