package classes.persons;

import classes.things.Electricity;

public class Znayka extends Person {
    public Znayka() {
        super("Знайка");
    }

    @Override
    public void turnOnTheElectricity(Electricity electricity) {
        if (!(getMood().equals("пристыженный"))) {
            super.turnOnTheElectricity(electricity);
        } else {
            System.out.printf("%s не зажег электричество, так как ему было стыдно.\n", name);
        }
    }
}
