package classes.persons;

public class Guslya extends Person {
    public Guslya() {
        super("Гусля");
    }

    public void speak() {
        System.out.printf("%s сказал что-то, что всех рассмешило.\n", name);
    }
}
