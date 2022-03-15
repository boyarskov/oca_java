package ru.oca.patterns.decorator;

public class RedSuperHero implements SuperHero {
    @Override
    public String getDescription() {
        return "Red superhero";
    }

    @Override
    public int getChanceOfSurvival() {
        return 52;
    }
}
