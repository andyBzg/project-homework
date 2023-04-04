package org.crazymages.classes;

public class VacationCalculator {

    public static int calculate(int days, int people) {
        if (days >= 0 && people >= 0) {
            return days * people;
        }
        else {
            return 0;
        }
    }

}
