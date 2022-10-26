package com.byonecup.ArraysAndSortingAndLookups;

import java.util.Scanner;

public class SeqSearch {
    public static void main(String[] args) {
        /**
         * 在Java中，我们常用的查找有两种：
         * 1) 顺序查找
         * 2) 二分查找
         */

        /**
         * 有一个数列：白眉鹰王、金毛狮王、紫衫龙王、青翼蝠王猜数游戏：
         * 从键盘中任意输入一个名称，判断数列中是否包含此名称【顺序查找】
         * 要求：如果找到，就给出提示，并给出下标。
         */
        String[] names = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名字：");
        String findName = scanner.next();

        int index = -1;
        for (int i = 0; i < names.length; i++) {
            if (findName.equals(names[i])) {
                System.out.println("恭喜你找到" + findName);
                System.out.println("下标为：" + i);
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("没有找到~");
        }
    }
}
