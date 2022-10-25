package ObjectOrientedProgramming;

public class VarParameterExercise {
    /**
     * 有三个方法，分别实现返回姓名和两门课成绩（总分），返回姓名和三门课成绩（总分），返回姓名和五门课成绩（总分）。
     * 封装成一个可变参数的方法
     * 类名HspMethodEx  方法名showScore
     */
    public static void main(String[] args) {
        MethodEx hspMethodEx = new MethodEx();
        System.out.println(hspMethodEx.showScore("Jack", 80.5, 60.5));
        System.out.println(hspMethodEx.showScore("Terry", 90, 78.5, 89));
    }
}

class MethodEx {
    public String showScore(String name, double... scores) {
        double totalScore = 0;
        for (int i = 0; i < scores.length; i++) {
            totalScore += scores[i];
        }
        return name + "的" + scores.length + "门课总分为：" + totalScore;
    }
}