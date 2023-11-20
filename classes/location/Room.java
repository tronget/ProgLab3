package classes.location;

import classes.things.Thing;
import interfaces.ThingsChangable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Room extends InnerLocation implements ThingsChangable {
    public Room() {
        super("Комната");
    }

    protected ArrayList<Thing> things = new ArrayList<>();

    @Override
    public void addThings(Thing... things) {
        this.things.addAll(Arrays.asList(things));
    }

    @Override
    public void removeThings(Thing... things) {
        this.things.removeAll(Arrays.asList(things));
    }

    @Override
    public void showThings() {
        System.out.println(things.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Room room = (Room) o;
        return Objects.equals(things, room.things);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), things);
    }
}
