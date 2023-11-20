package classes.persons;

public class Guslya extends Person {
    private static Guslya instance;
    public static synchronized Guslya getInstance() {
        if (instance == null) {
            instance = new Guslya();
        }
        return instance;
    }
    private Guslya() {
        super("Гусля");
    }
}
