package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,5,2,4,7,6);
//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        System.out.println(list);
//        Collections.sort(list, (Integer o1,Integer o2)->{return o1.compareTo(o2);});
//        System.out.println(list);
        Collections.sort(list, (o1,o2)->o1.compareTo(o2));
        System.out.println(list);
    }
}
