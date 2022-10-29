package com.byonecup.OOP_IntermediateSection.poly_;

public class PolyExercise01 {
    public static void main(String[] args) {
        double d = 13.4;
        long l = (long) d;
        System.out.println(l);

        int in = 5;
        // boolean b = (boolean) in; // 错误

        Object obj = "Hello";
        String objStr = (String) obj;
        System.out.println(objStr);

        Object objPri = new Integer(5);
        String str = (String) objPri; // 错误ClassCastException
        Integer str1 = (Integer) objPri;
    }
}
