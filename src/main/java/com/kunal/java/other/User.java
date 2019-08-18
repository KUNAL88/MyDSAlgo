package com.kunal.java.other;

public class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (age != user.age) return false;
        return name.equals(user.name);
    }

    @Override
    public int hashCode() {
        int result = name.length();
        result =  result + age;
        return result;
    }

    public static void main(String[] args) {
        User user1=new User("krunal",20);
        User user2=new User("mrunal",20);

        System.out.println(user1.hashCode()+"    "+user2.hashCode());

        System.out.println(user1.equals(user2));
    }
}
