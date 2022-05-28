package ru.oca.lession018.Collections;

import java.util.HashSet;

public class CollectionsHashSet {
    public static void main(String[] args) {
        HashSet<String> persons = new HashSet<>();
        System.out.println(persons);
        persons.add("Ivanov Ivan Ivanovich");
        persons.add("Petrov Ivan Ivanovich");
        persons.add("Antonov Fedor Pavlovich");
        System.out.println(persons);
        persons.add("Petrov Ivan Ivanovich");
        System.out.println(persons);
        persons.remove("Antonov Fedor Pavlovich");
        System.out.println(persons);
        persons.clear();
        System.out.println(persons);
    }
}
