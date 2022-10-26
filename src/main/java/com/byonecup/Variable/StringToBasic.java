package com.byonecup.Variable;

public class StringToBasic {
    public static void main(String[] args) {
        // 基本数据类型 -> String
        int n1 = 100;
        float f1 = 1.1F;
        double d1 = 4.5;
        boolean b1 = true;
        String s1 = n1 + "";
        String s2 = f1 + "";
        String s3 = d1 + "";
        String s4 = b1 + "";
        System.out.println(s1 + "\t" + s2 + "\t" + s3 + "\t" + s4);

        // String -> 基本数据类型
        // 通过基本类型的包装类调用parseXX方法即可
        int n2 = Integer.parseInt(s1);
        float f2 = Float.parseFloat(s2);
        double d2 = Double.parseDouble(s3);
        boolean b2 = Boolean.parseBoolean("true");
        System.out.println(n2 + "\t" + f2 + "\t" + d2 + "\t" + b2);

        // char -> String
        String s5 = "123";
        System.out.println(s5.charAt(0));
        System.out.println(s5.charAt(1));
        System.out.println(s5.charAt(2));
    }
}
