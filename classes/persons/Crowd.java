package classes.persons;

import classes.location.InnerLocation;
import enums.Mood;

public class Crowd extends Person {
    public Crowd() {
        super("Все, кроме Знайки");
    }
    public void laughAtZnayka(Znayka znayka) {
        System.out.printf("%s смеются над Знайкой.\n", name);
        this.setMood(Mood.FUNNY);
        znayka.beAshamed();
    }
    public void pushEachOther() {
        System.out.printf("%s толкаются.\n", name);
    }
    public void stepOnEachOtherLegs() {
        System.out.printf("%s наступают друг другу на пятки.\n", name);
    }
    @Override
    public void goOut(InnerLocation innerLocation) {
        super.goOut(innerLocation);
        pushEachOther();
        stepOnEachOtherLegs();
    }
}
