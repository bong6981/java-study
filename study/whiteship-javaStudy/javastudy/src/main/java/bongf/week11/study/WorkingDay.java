package bongf.week11.study;

import java.util.EnumSet;

public class WorkingDay {
    private EnumSet<Day> workedDays;

    public WorkingDay() {
        this.workedDays = EnumSet.noneOf(Day.class);
    }

    public EnumSet<Day> getWorkedDays() {
        return workedDays;
    }

    public void setWorkedDays(EnumSet<Day> days) {
        this.workedDays = days;
    }

    public boolean didWorkOn(Day day) {
        return workedDays.contains(day);
    }

    public void add(Day day) {
        workedDays.add(day);
    }

    public void remove(Day day) {
        workedDays.remove(day);
    }
}
