package com.kunal.java;

public final class ImmutableObj {

    private final String name;

    public ImmutableObj(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
