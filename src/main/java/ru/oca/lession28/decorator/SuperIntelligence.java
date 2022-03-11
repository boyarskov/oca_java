package ru.oca.lession28.decorator;

public class SuperIntelligence extends SuperHeroDecorator {

    public SuperIntelligence(SuperHero superHero) {
        super(superHero);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with super power";
    }

    @Override
    public int getChanceOfSurvival() {
        return super.getChanceOfSurvival() + 7;
    }
}
