package generics;

import classes.Person;
import classes.Worker;

public class DataBaseWriter<T> {

    private String database;
    private T value;


    public DataBaseWriter(String database, T value) {
        this.database = database;
        this.value = value;
    }

    public void save() {
        System.out.printf("данные в бд записаны, тип данных = %s", value.getClass());
    }


    public static void main(String[] args) {

        Worker worker = new Worker("Vasya");

        DataBaseWriter<Person> database = new DataBaseWriter<>("DB", worker);
        database.save();

    }
}
