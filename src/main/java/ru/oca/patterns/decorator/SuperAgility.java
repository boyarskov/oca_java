package ru.oca.patterns.decorator;

public class SuperAgility extends SuperHeroDecorator {

    public SuperAgility(SuperHero superHero) {
        super(superHero);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with super power";
    }

    @Override
    public int getChanceOfSurvival() {
        return super.getChanceOfSurvival() + 3;
    }
}
