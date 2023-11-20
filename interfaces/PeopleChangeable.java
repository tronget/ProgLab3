package interfaces;

import classes.persons.Person;

public interface PeopleChangeable {
    void addPeople(Person... person);

    void removePeople(Person... person);

    void showPeople();
}
