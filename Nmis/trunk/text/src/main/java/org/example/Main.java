package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Tom",24),
                new User("jj",30)
        );
        List<String> result = users.stream()
                .filter(u -> u.getAge()>25)
                .map(User::getName)
                .collect(Collectors.toList());
        System.out.println(result);

        int p = users.stream()
                .mapToInt(User::getAge)
                .max()
                .orElse(0);
        System.out.println(p);

        OptionalInt a2 = null;
        String t = "did";
        System.out.println(a2 +""+p+t);

    }
}

class User{
    String name;
    int age;

    public User(String tom, int i) {
        name = tom;
        age = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
