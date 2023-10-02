package ru.oca.bookschildt;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionsTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> persons = new TreeMap<>();
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
        System.out.println("All person: " + persons.values());
        System.out.println("All person: " + persons.keySet());

    }
}
