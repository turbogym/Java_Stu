package ArraysAndSortingAndLookups;

public class ArrayAssign {
    public static void main(String[] args) {
        /**
         * 数组赋值机制
         * 1) 基本数据类型赋值，这个值就是具体的数据，而且相互不影响。
         *    int n1 = 2; int n2 = n1;
         * 2) 数组在默认情况下是引用传递，赋的值是地址。
         *    int[] arr1 = {1, 2, 3}; int[] arr2 = arr1;
         *    在jvm内存中，栈 中给arr2赋的值是arr1的地址，不是值；堆 中对应地址中存放的才是值。
         */

        // 基本数据类型赋值，赋值方式为 值拷贝
        // n2的变化，不会影响到n1的值
        int n1 = 2;
        int n2 = n1;
        n2 = 80;
        System.out.println("n1 = " + n1 + " n2 = " + n2);

        // 数组在默认情况下是引用传递，赋的值是地址，赋值方式为 引用传递
        // 传递的是一个地址，arr2的变化会影响到arr1
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1; // 把arr1赋给arr2
        arr2[0] = 10;
        // arr1的元素
        System.out.println("arr1的元素：");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
