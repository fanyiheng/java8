package lambda;

import java.util.function.Consumer;

/**
 * Consumer 将入参接收作处理，并没有返回值
 */
public class ConsumerTest {
    public static void main(String[] args){
        Consumer<String> con = System.out::println;
        con.accept("abc");
    }
}
