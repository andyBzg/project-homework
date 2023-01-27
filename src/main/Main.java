package main;

import classes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Worker firstWorker = new Worker("Ivan");
        List<Child> firsListOfChildren = new ArrayList<>();
        firsListOfChildren.add(new Child("Kolya"));
        firsListOfChildren.add(new Child("Tanya"));
        firsListOfChildren.add(new Child("Masha"));
        firstWorker.setChildren(firsListOfChildren);


        Worker secondWorker = new Worker("Petya");
        List<Child> secondListOfChildren = new ArrayList<>();
        secondListOfChildren.add(new Child("Vitaly"));
        secondListOfChildren.add(new Child("Sveta"));
        secondListOfChildren.add(new Child("Misha"));
        secondListOfChildren.add(new Child("Anna"));
        secondWorker.setChildren(secondListOfChildren);


        Worker thirdWorker = new Worker("Vasya");
        List<Company> companies = List.of(new Company("Apple"), new Company("Google"));
        thirdWorker.setPreviousJob(companies);


        firstWorker.showChildren();
        secondWorker.showChildren();
        thirdWorker.showCompaniesPersonWorked();

    }
}