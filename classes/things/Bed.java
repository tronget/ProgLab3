package classes.things;

import classes.persons.Person;

import java.util.Objects;

public class Bed extends Thing {
    @Override
    public String getName() {
        return "кровать";
    }

    protected Person personOnBed;

    public Person getPersonOnBed() {
        return personOnBed;
    }

    public void setPersonOnBed(Person personOnBed) {
        this.personOnBed = personOnBed;
    }

    @Override
    public String toString() {
        return (personOnBed != null) ?
                "Кровать с %s на ней".formatted(personOnBed) :
                "Пустая кровать";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bed bed = (Bed) o;
        return Objects.equals(personOnBed, bed.personOnBed);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + personOnBed.hashCode();
    }
}
