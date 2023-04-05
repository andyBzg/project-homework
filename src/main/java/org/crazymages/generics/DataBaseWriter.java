package org.crazymages.generics;

public class DataBaseWriter<T> {

    private String database;
    private T value;


    public DataBaseWriter(String database, T value) {
        this.database = database;
        this.value = value;
    }

    public void save() {
        System.out.printf("данные в базу данных %s записаны, тип данных = %s\n", database, value.getClass());
    }

}
