package ObjectOrientedProgramming_PrimarySection;

public class Method01 {
    /**
     * 成员方法
     * 基本介绍：
     * 走某些情况下，我们需要定义成员方法（简称方法）。比如人类：除了有一些属性外（年龄，姓名...），
     * 我们人类还有一些行为比如：可以说话、跑步等，通过学习，还可以做算术题。
     * 这时就需要用成员方法才能完成。
     */

    /**
     * 1) 添加speak成员方法，输出 我是一个好人
     * 2) 添加cal01成员方法，可以计算从1+2+...+1000的结果
     * 3) 添加cal02成员方法，该方法可以接收一个数n，计算从1+...+n的结果
     * 4) 添加getSum成员方法，可以计算两个数的和
     */

    public static void main(String[] args) {
        // 方法的使用
        Person1 p1 = new Person1();
        p1.speak();
        p1.cal01();
        p1.cal02(5);
        int returnRes = p1.getSum(10,30);
        System.out.println(returnRes);
    }

    /**
     * 方法的调用机制分析
     * 1) 首先Person1 p1 = new Person1();是在内存中的 栈 中创建 main栈 空间存放
     *    然后在 堆 中就有一个对象产生，这时 栈 中的p1指向这里的对象
     * 2) int returnRes = p1.getSum(10,30);在 main栈 中创建空间存放
     *    p1.getSum(10,30)会在 栈 中再开辟一个 独立空间 ，这个 独立空间 中，有 n1 -> 10, n2 -> 30, sum -> 40
     * 3) 在上述的 独立空间 中，最后return sum，这个会返回到 main栈 中的 p1.getSum(10,30);
     *    返回这个值之后，栈 中的 独立空间 这一块就被释放了
     *
     * 方法调用小结
     * 1) 当程序执行到方法时，就会开辟一个独立的空间（栈空间）
     * 2) 当一个方法执行完毕，或者执行到return语句时，就会返回
     * 3) 返回到调用方法的地方
     * 4) 返回后，继续执行方法后面的代码
     * 5) 当main方法执行完毕后，整个程序就退出了
     */
}

class Person1 {
    String name;
    int age;

    // 方法（成员方法）
    // 1. public表示方法是公开的
    // 2. void表示方法没有返回值
    // 3. speak()表示方法名；()表示形参列表
    // 4. {}表示方法体，可以写要执行的代码
    public void speak() {
        System.out.println("我是一个好人");
    }

    public void cal01() {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
        System.out.println("计算结果 = " + sum);
    }

    public void cal02(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("计算结果 = " + sum);
    }

    public int getSum(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }

}