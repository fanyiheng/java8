package lambda;

import java.util.function.Supplier;

public class SuplierTest {
    public static void main(String[] args){
        Supplier<String> s1 = ()->"abc";
        System.out.println(s1);
        System.out.println(studentSupplier.get());

    }

    public static Supplier<Student> studentSupplier = Student::new;

    static class Student{
        private String name;
        public Student(){
            name = "123";
        }

        @Override
        public String toString() {
            return "name:"+name;
        }
    }
}
