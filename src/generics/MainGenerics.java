package generics;

import classes.Person;
import classes.Worker;

public class MainGenerics {
    public static void main(String[] args) {

        Worker worker = new Worker("Vasya");

        DataBaseWriter<Person> database = new DataBaseWriter<>("DB", worker);
        database.save();

    }
}
