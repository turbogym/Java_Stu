package Operators;

public class LogicOperator {
    public static void main(String[] args) {
        // &&（短路与） 和 &（逻辑与） 使用
        int age = 50;
        if (age > 20 && age < 90) {
            System.out.println("OK100");
        }

        if (age > 20 & age < 90) {
            System.out.println("OK200");
        }

        // &和&&区别
        int a = 4;
        int b = 9;
        if (a < 1 && ++b < 50) {
            System.out.println("OK300");
        }
        System.out.println("a = " + a + " ,b = " + b);
        if (a < 1 & ++b < 50) {
            System.out.println("OK300");
        }
        System.out.println("a = " + a + " ,b = " + b);
        /**
         * &&短路与：如果第一个条件为false，则第二个条件不会判断，最终结果为false
         * &逻辑与：不管第一个条件是否为false，第二个条件都要判断，效率低
         */

        // ||（短路或） 和 |（逻辑或） 使用
        int c = 4;
        int d = 9;
        if (c < 1 || ++d < 50) {
            System.out.println("OK300");
        }
        System.out.println("c = " + c + " ,d = " + d);
        if (c < 1 | ++d < 50) {
            System.out.println("OK300");
        }
        System.out.println("c = " + c + " ,d = " + d);
    }
}
