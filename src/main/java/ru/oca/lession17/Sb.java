package ru.oca.lession17;

public class Sb {
    public static void main(String[] args) {
        String name = new String("Fyodor");
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder("Artyom Dostoevsky");
        StringBuilder three = new StringBuilder("Ани Лорак");

        two.replace(0, 6, name)
                .deleteCharAt(2)
                .setCharAt(1, 'e');
        two.append(" написал книгу БЕСЫ");
        System.out.println(two);
        String result = two.toString();

        three.deleteCharAt(3)
                .reverse();
        System.out.println(three);
        }
    }