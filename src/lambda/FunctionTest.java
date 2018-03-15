package lambda;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args){
        Function<String,Boolean> f1 = s -> s.length() > 1;
        System.out.println(f1.apply("2s"));
        Function<Boolean,Integer> f2 = b -> b?1:0;
        //andThen 返回Function 实例，该实例方法 将f1处理的结果作为f2的入参，返回f2的结果
        Function<String, Integer> stringIntegerFunction = f1.andThen(f2);
        f1.andThen(f2).apply("");
        //compose 返回Function 实例，该实例方法 将f1处理的结果作为f2的入参，返回f2的结果
        //和andThen 相比只是谁调用谁的区别
        Function<String, Integer> compose = f2.compose(f1);
    }
}
