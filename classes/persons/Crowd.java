package classes.persons;

import classes.location.InnerLocation;
import enums.Mood;

public class Crowd extends Person {
    public Crowd(String name) {
        super(name);
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
