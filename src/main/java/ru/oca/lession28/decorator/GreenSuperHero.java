package ru.oca.lession28.decorator;

public class GreenSuperHero implements SuperHero {
    @Override
    public String getDescription() {
        return "Green superhero";
    }

    @Override
    public int getChanceOfSurvival() {
        return 50;
    }
}
