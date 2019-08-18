package com.kunal.java.other.collection;



import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class DemoTreeSet{

    public static void main(String[] args) {

       /* Set<Integer> set=new TreeSet<>(new MyComparator());
        set.add(10);   set.add(40);   set.add(30);
        System.out.println(set);
        Set<Integer> set1=new TreeSet<>(
                (I1,I2) -> I1<I2 ? 1 : I1>I2 ? -1 : 0
        );

        set1.add(10);   set1.add(40);   set1.add(30);
        System.out.println(set1);
*/

        Predicate<String> p=(a)->{
            if(a.length()>1)
                return true;
            else return false;
        };

        System.out.println(p.test("Kunal"));

        Function<List<String>,Integer> f=(aray)->{

           return   aray.stream().toArray().length;

        };
        List<String> list=new ArrayList<>();
        list.add("Kunal");  list.add("Tolu");
        System.out.println(f.apply(list));
    }
}
