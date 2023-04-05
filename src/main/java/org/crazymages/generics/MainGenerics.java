package org.crazymages.generics;

import org.crazymages.classes.Person;
import org.crazymages.classes.Worker;

public class MainGenerics {
    public static void main(String[] args) {

        Worker worker = new Worker("Vasya");

        DataBaseWriter<Person> databasePerson = new DataBaseWriter<>("DB", worker);
        DataBaseWriter<String> dataBaseString = new DataBaseWriter<>("MySQL", "привет");
        DataBaseWriter<Integer> dataBaseInt = new DataBaseWriter<>("PostgreSQL", 5);

        databasePerson.save();
        dataBaseString.save();
        dataBaseInt.save();

    }
}
