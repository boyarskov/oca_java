package ru.oca.lession018.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsArrayList {
    public static void main(String[] args) {
        ArrayList<String> persons = new ArrayList<>();
        System.out.println(persons);
        persons.add("Ivanov Ivan Ivanovich");
        persons.add("Antonov Fedor Pavlovich");
        System.out.println(persons);
        persons.add("Ivanov Ivan Ivanovich");
        persons.add("Pavlov Andrew Igorevich");
        System.out.println(persons);
        persons.remove(0);
        System.out.println(persons);
        System.out.println(persons.get(0));
    }
}
