package com.byonecup.OOP_IntermediateSection.poly_.Object_;

public class HashCode_ {
    /**
     * hashCode方法
     * 1) 提高具有哈希结构的容器的效率！
     * 2) 两个引用，如果指向的是同一个对象，则哈希值肯定是一样的！
     * 3) 两个引用，如果指向的是不同对象，则哈希值是不一样的（极大概率）
     * 4) 哈希值主要根据地址号来的！， 不能完全将哈希值等价于地址。
     * 5) 案例演示[HashCode_.java]: obj.hashCode() [测试：A obj1 = new A(); A obj2 = new A(); A obj3 = obj1]
     * 6) 后面在集合，中 hashCode 如果需要的话，也会重写, 在讲解集合时，再说如何重写 hashCode()
     */
    public static void main(String[] args) {

        AA aa = new AA();
        AA aa2 = new AA();
        AA aa3 = aa;
        System.out.println("aa.hashCode()=" + aa.hashCode());
        System.out.println("aa2.hashCode()=" + aa2.hashCode());
        System.out.println("aa3.hashCode()=" + aa3.hashCode());

    }
}

class AA {
}