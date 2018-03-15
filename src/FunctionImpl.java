public class FunctionImpl implements IFunction{
    @Override
    public void method() {
        System.out.println("impl method...");
    }


    public static void main(String[] args){
        IFunction.staticMethod();
        new FunctionImpl().defaultMethod();
    }
}
