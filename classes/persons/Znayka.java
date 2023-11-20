package classes.persons;

import classes.things.Bed;
import classes.things.Electricity;
import enums.Mood;

public class Znayka extends Person {
    public Znayka() {
        super("Знайка");
    }
    public void turnOnTheElectricity(Electricity electricity) {
        if (!(getMood().equals("пристыженный"))) {
            electricity.toggle();
            System.out.printf("%s включил электричество.\n", name);
        } else {
            System.out.printf("%s не зажег электричество, так как ему было стыдно.\n", name);
        }
    }
    public void beAshamed() {
        setMood(Mood.ASHAMED);
        System.out.printf("%s стыдится.\n", name);
    }
    public void goToBed(Bed bed) {
        bed.setPersonOnBed(this);
        System.out.println("Знайка с размаху бросился на кровать.\n");
    }
}
