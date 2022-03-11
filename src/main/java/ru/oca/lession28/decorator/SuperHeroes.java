package ru.oca.lession28.decorator;

public class SuperHeroes {

    public static void main(String[] params) {
        SuperHero firstHero = new SuperAgility(new SuperIntelligence(new GreenSuperHero()));
        SuperHero secondHero = new SuperPower(new SuperAgility(new RedSuperHero()));
        SuperHero doubleAgilityHero = new SuperAgility(new SuperAgility(new GreenSuperHero()));
        printInfo(firstHero);
        printInfo(secondHero);
        fight(firstHero, secondHero);
    }

    private static void fight(SuperHero first, SuperHero second) {
        if (first.getChanceOfSurvival() > second.getChanceOfSurvival()) {
            printAlive(first);
        } else if (second.getChanceOfSurvival() > first.getChanceOfSurvival()) {
            printAlive(second);
        } else {
            System.out.println("The chances of survival are equal");
        }
    }

    private static void printInfo(SuperHero superHero) {
        System.out.printf("The superhero '%1$s' has a chance of survival equal to %2$d", superHero.getDescription(), superHero.getChanceOfSurvival());
        System.out.println();
    }

    private static void printAlive(SuperHero superHero) {
        System.out.printf("The superhero `%1$s` will survive`", superHero.getDescription());
    }
}