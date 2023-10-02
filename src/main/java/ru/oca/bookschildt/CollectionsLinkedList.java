package ru.oca.bookschildt;

import java.util.LinkedList;

public class CollectionsLinkedList {
    public static void main(String[] args) {
        LinkedList<String> persons = new LinkedList<>();
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
        persons.addFirst("Petr 1");
        System.out.println(persons);
    }
}
