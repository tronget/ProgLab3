import classes.location.Room;
import classes.persons.Crowd;
import classes.persons.Guslya;
import classes.persons.Znayka;
import classes.things.Bed;
import classes.things.Electricity;
import classes.things.Pillow;


public class Main {
    public static void main(String[] args) {
        Room room = new Room();
        Bed bed = new Bed();
        Pillow pillow = new Pillow();
        Electricity electricity = new Electricity();
        room.addThings(bed, pillow, electricity);

        Guslya guslya = Guslya.getInstance();
        Crowd crowd = new Crowd("Все, кроме Знайки");
        Znayka znayka = Znayka.getInstance();
        room.addPeople(guslya, crowd, znayka);

        guslya.speak("что-то, что всех рассмешило");

        crowd.laughAtPerson(znayka);
        crowd.goOut(room);
        guslya.goOut(room);

        znayka.turnOnTheElectricity(electricity);
        znayka.goToBed(bed);
    }
}
