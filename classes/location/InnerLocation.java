package classes.location;

import classes.persons.Person;
import interfaces.PeopleChangeable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public abstract class InnerLocation extends Location implements PeopleChangeable {
    protected ArrayList<Person> persons = new ArrayList<>();

    public InnerLocation() {
    }

    public InnerLocation(String name) {
        super(name);
    }

    @Override
    public void addPeople(Person... persons) {
        this.persons.addAll(Arrays.asList(persons));
    }

    @Override
    public void removePeople(Person... persons) {
        this.persons.removeAll(Arrays.asList(persons));
    }

    @Override
    public void showPeople() {
        System.out.println(persons.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        InnerLocation innerLocation = (InnerLocation) o;
        return Objects.equals(persons, innerLocation.persons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), persons);
    }
}
