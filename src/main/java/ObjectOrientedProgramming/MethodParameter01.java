package ObjectOrientedProgramming;

public class MethodParameter01 {
    /**
     * 成员方法传参机制
     * 基本类型：形参的改变不会影响实参
     * 引用类型：形参的改变会影响到实参
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Parameter01 p = new Parameter01();
        p.swap(a, b);
        System.out.println("a = " + a + "\tb = " + b);

        Parameter02 p2 = new Parameter02();
        int[] arr = {1, 2, 3};
        p2.test100(arr);
        System.out.println("main方法中遍历数组：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        PersonTest pTest = new PersonTest();
        pTest.name = "Jack";
        pTest.age = 10;
        System.out.println(pTest.name + " " + pTest.age);
        p2.test200(pTest);
        System.out.println(pTest.name + " " + pTest.age);
    }
}

class Parameter01 {
    public void swap(int a, int b) {
        System.out.println("a = " + a + "\tb = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + "\tb = " + b);
    }
}

class Parameter02 {
    public void test100(int[] arr) {
        arr[0] = 200;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void test200(PersonTest pTest) {
        pTest.age = 200;
    }
}

class PersonTest {
    String name;
    int age;
}