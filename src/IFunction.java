public interface IFunction {

    void method();
    default void defaultMethod(){
        System.out.println("defaultMethod...");
    }
    static void staticMethod(){
        System.out.println("staticMethod...");
    }
}
