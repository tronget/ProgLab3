package classes.persons;

import classes.things.Electricity;

public class Znayka extends Person {
    private static Znayka instance;
    public static synchronized Znayka getInstance() {
        if (instance == null) {
            instance = new Znayka();
        }
        return instance;
    }
    private Znayka() {
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
