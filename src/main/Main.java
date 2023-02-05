package main;

import classes.*;

import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {

        Child child = new Child("Vasyan");
        child.setAge(45);

        Worker secondWorker = new Worker("Thomas");
        secondWorker.setAge(50);

        System.out.println(child.compareTo(secondWorker));


        Company firstCompany = new Company("Adidas");
        Map<String, String> adidasHolidays = new HashMap<>();
        adidasHolidays.put("Новый год", "1 января");
        adidasHolidays.put("Д/р основателя", "3 ноября");
        firstCompany.setHolidays(adidasHolidays);

        System.out.println(firstCompany);


        Company secondCompany = new Company("Ryanair");
        Map<String, String> ryanairHolidays = new HashMap<>();
        ryanairHolidays.put("День святого патрика", "17 марта");
        ryanairHolidays.put("Рождество", "25 декабря");
        ryanairHolidays.put("Всемирный день кошек", "8 августа");
        secondCompany.setHolidays(ryanairHolidays);

        System.out.println(secondCompany);


    }
}