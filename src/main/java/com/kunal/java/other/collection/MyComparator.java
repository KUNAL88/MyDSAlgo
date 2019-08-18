package com.kunal.java.other.collection;

import java.util.Comparator;

public class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        Integer i1=(Integer)o1;
        Integer i2=(Integer)o2;

        return i1>i2 ? -1 : i1<i2 ? 1 :0;

    }
}
