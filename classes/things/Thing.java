package classes.things;

import java.util.Objects;

public abstract class Thing {
    public abstract String getName();

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return Objects.equals(getName(), thing.getName());
    }

    @Override
    public String toString() {
        return getName();
    }
}
