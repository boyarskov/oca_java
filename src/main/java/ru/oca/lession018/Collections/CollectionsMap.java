package ru.oca.lession018.Collections;

import java.util.*;

public class CollectionsMap {
    public static void main(String[] args) {
        Map<Integer, String> persons = new HashMap<Integer, String>();
        System.out.println(persons);
        persons.put(123456, "Ivanov Ivan Ivanovich");
        persons.put(789123, "Petrov Ivan Ivanovich");
        persons.put(999999, "Antonov Fedor Pavlovich");
        System.out.println(persons);
        persons.put(123456, "Ivanov Ivan Artemovich");
        System.out.println(persons);
        persons.remove(789123);
        System.out.println(persons);
        System.out.println("ID 789123: " + persons.containsKey(789123));
        System.out.println("ID 999999: " + persons.containsKey(999999));
        System.out.println(persons.containsValue("Ivanov Ivan Artemovich"));
        System.out.println("ID 789123: " + persons.get(789123));
        System.out.println("ID 999999: " + persons.get(999999));
    }
}
