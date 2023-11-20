package classes.things;

import interfaces.Switchable;

import java.util.Objects;

public abstract class SwitchableThing extends Thing implements Switchable {
    protected boolean workStatus = false;

    @Override
    public void toggle() {
        workStatus = !workStatus;
    }

    @Override
    public boolean isOn() {
        return workStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SwitchableThing that = (SwitchableThing) o;
        return workStatus == that.workStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), workStatus);
    }

    @Override
    public String toString() {
        String info = isOn() ? "Включенный предмет - " : "Выключенный предмет - ";
        return info + getName();
    }
}
