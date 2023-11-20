package classes.persons;

import classes.location.InnerLocation;
import enums.Mood;

import java.util.Objects;

public abstract class Person {
    protected final String name;
    private Mood mood = Mood.DEFAULT;
    public Person() {
        this.name = "Безымянный";
    }
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getMood() {
        return mood.getInfoAboutMood();
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public void goOut(InnerLocation innerLocation) {
        innerLocation.removePeople(this);
        System.out.printf("%s выбираeтся из %s.\n", name, innerLocation.getName());
    }

    @Override
    public String toString() {
        return "Персонаж - %s".formatted(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && mood == person.mood;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mood);
    }
}
