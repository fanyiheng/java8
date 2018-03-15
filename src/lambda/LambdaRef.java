package lambda;

public class LambdaRef {
    public static String name = "abc";
    public static void main(String[] args){
        //类方法引用
        IFunctional<Integer,String> func = String::valueOf;
        System.out.println(func.handle(123));

        //对象方法引用
        IFunctional<String,Integer> func2 = name::indexOf;
        System.out.println(func2.handle("c"));
        //构造器引用
        //PersonFactory 是函数式接口，所以可以用lambda表达式创建以下工厂
        PersonFactory factory = ((name,age)->new Person(name,age));
        //PersonFactory 是函数式接口，该接口的入参和Person构造器相同，并且该接口的返回值就是Person对象
        //因此可以使用构造器引用
        PersonFactory factory2 = Person::new;
        //构造器引用结束
    }
    static interface IFunctional<T,R>{
        R handle(T obj);
    }

    static class Person{
        private String name;
        private Integer age;
        public Person(String name,Integer age){
            this.name = name;
            this.age = age;
        }
    }

    @FunctionalInterface
    interface PersonFactory{
        Person create(String name,Integer age);
    }
}
