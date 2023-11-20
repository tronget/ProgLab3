package interfaces;

import classes.things.Thing;

public interface ThingsChangable {
    void addThings(Thing... things);

    void removeThings(Thing... things);

    void showThings();
}
