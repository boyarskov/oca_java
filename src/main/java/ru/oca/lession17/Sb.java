package ru.oca.lession17;

public class Sb {
    public static void main(String[] args) {
        String name = new String("Fyodor");
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder("Ivan");
        StringBuilder three = new StringBuilder("Artyom Dostoevsky");

        three.replace(0, 6, name);
        System.out.println(three);
        three.deleteCharAt(2);
        System.out.println(three);
        three.setCharAt(1, 'e');
        System.out.println(three);
        three.append(" написал книгу БЕСЫ");
        System.out.println(three);

        String result = three.toString();
        }
    }
