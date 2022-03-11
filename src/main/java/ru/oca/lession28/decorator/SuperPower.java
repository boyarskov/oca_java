package ru.oca.lession28.decorator;

public class SuperPower extends SuperHeroDecorator {

    public SuperPower(SuperHero superHero) {
        super(superHero);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with super power";
    }

    @Override
    public int getChanceOfSurvival() {
        return super.getChanceOfSurvival() + 4;
    }
}
