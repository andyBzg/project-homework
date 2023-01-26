package main;

import classes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Worker firstWorker = new Worker("Ivan");
        List<Person> firsListOfChildren = new ArrayList<>();
        firsListOfChildren.add(new Child("Kolya"));
        firsListOfChildren.add(new Child("Tanya"));
        firsListOfChildren.add(new Child("Masha"));
        firstWorker.setChildren(firsListOfChildren);


        Worker secondWorker = new Worker("Petya");
        List<Person> secondListOfChildren = new ArrayList<>();
        secondListOfChildren.add(new Child("Vitaly"));
        secondListOfChildren.add(new Child("Sveta"));
        secondListOfChildren.add(new Child("Misha"));
        secondListOfChildren.add(new Child("Anna"));
        secondWorker.setChildren(secondListOfChildren);


        Worker thirdWorker = new Worker("Vasya");
        List<Company> companies = new ArrayList<>();
        companies.add(new Company("Google"));
        companies.add(new Company("Apple"));
        companies.add(new Company("Tesla"));
        thirdWorker.setJob(companies);


        firstWorker.showChildren();
        secondWorker.showChildren();
        thirdWorker.showCompaniesPersonWorked();

    }
}