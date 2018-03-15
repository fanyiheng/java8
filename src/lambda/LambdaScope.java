package lambda;

import java.util.Comparator;

public class LambdaScope {
    public static void main(String[] args){
        //lambda 表达式可以访问外部类变量，且该变量可以不用显示定义为final,该变量不可被修改---这个语法糖其实很鸡肋。。。
        String name = "fbc";
        Comparator<String> comparator = ((str1,str2)->str1.compareTo(name));
        System.out.println(comparator.compare("e", "b"));
    }
}
