package com.byonecup.OOP_IntermediateSection.poly_;

public class PolyDetail {
    /**
     * 多态注意事项和细节
     * 多态的前提是：两个对象（类）存在继承关系
     *
     * 多态的向上转型
     * 1) 本质：父类的引用指向了子类的对象
     * 2) 语法：父类类型 引用名 = new 子类类型();
     * 3) 特点：编译类型看左边，运行类型看右边。
     *         可以调用父类中的所有成员（需遵守访问权限），
     *         不能调用子类中的特有成员；
     *
     * 多态的向下转型
     * 1) 语法 子类类型 引用名 = (子类类型) 父类引用;
     * 2) 只能强制转换父类的引用，不能强转父类的对象
     * 3) 要求父类的引用必须指向的是当前目标类型的对象
     * 4) 当向下转型后，可以调用子类类型中所有的成员
     *
     * 属性没有多态！
     *
     * instanceOf 比较操作符，用于判断对象的 运行类型 是否为XX类型或XX类型的子类型
     */
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);
        System.out.println(bb instanceof AA);

        // aa的编译类型是AA，运行类型是BB
        AA aa = new BB();
        System.out.println(aa instanceof AA);
        System.out.println(aa instanceof BB);

        Object obj = new Object();
        System.out.println(obj instanceof AA);
        String str = "hello";
//        System.out.println(str instanceof AA);
        System.out.println(str instanceof Object);
    }
}

class AA {}

class BB extends AA {}