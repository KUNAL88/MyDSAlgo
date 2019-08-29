package com.kunal.ds.hash;

public class MyHashMap<T,U> {

    private static final int initialCapacity=11;
    Node[] array=null;
    public MyHashMap(){
        array=new Node[initialCapacity];
        for(int i=0;i<initialCapacity;i++){
            array[i]=null;
        }
    }

    public U put(Object key,U value){

        Node node=new Node(key,value);
        if(array[(Integer) key%initialCapacity]==null){
            array[(Integer) key%initialCapacity]=node;
        }else {
            U temp=(U)array[(Integer) key%initialCapacity].value;
            array[(Integer) key%initialCapacity].value=value;
            value=temp;
        }

        return value;
    }

    public U get(Object key){


       if(array[(Integer) key%initialCapacity]==null){
           return null;
       }else {
          return  (U)array[(Integer) key%initialCapacity].value;
       }

    }
}

class Node<T,U>{

     T key;
     U value;
    Node(T key,U value){
        this.key=key;
        this.value=value;
    }
}
