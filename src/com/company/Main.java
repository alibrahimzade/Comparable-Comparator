package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Azer","Safarov",20));
        users.add(new User("Edil","Enserli",21));
        users.add(new User("Ali","Ibrahimzade",19));

        System.out.println("Before sort");
        users.forEach(System.out::println);
        System.out.println("*************************************");

        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o2.getAge().compareTo(o1.getAge()) ;
            }
        });
        System.out.println("After Sort");
        users.forEach(System.out::println);

    }
}
