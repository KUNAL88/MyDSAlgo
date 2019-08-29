package com.kunal.ds.hash;

public class HashMapDemo {

    public static void main(String[] args) {
        MyHashMap<Integer,String> myHashMap=new MyHashMap<>();
       System.out.println(myHashMap.put(10,"Kunal"));
        System.out.println(myHashMap.put(10,"Sharma"));

        System.out.println(myHashMap.get(10));
        System.out.println(myHashMap.get(11));
    }
}
