package org.crazymages.classes;

public class Vacation {

    private final int days;
    private final int people;


    public Vacation(int days, int people) {
        this.days = days;
        this.people = people;
    }

    public int calculate() {
        if (days >= 0 && people >= 0) {
            return days * people;
        }
        else {
            return 0;
        }
    }

}
