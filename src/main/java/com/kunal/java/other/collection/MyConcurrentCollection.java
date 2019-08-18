package com.kunal.java.other.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class MyConcurrentCollection {

    public static void main(String[] args) {

        List<Integer> list=new CopyOnWriteArrayList<>();
        list.add(10);  list.add(20);  list.add(30);
        System.out.println(list);

        Set<Integer> set=new CopyOnWriteArraySet<>();
        set.add(10);   set.add(20);     set.add(30);
        System.out.println(set);

        Map<?,?> map=new ConcurrentHashMap<>();
      
    }
}
