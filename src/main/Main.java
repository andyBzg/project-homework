package main;

import classes.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<PensionFund> firstPensionFundSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            firstPensionFundSet.add(new PensionFund("", FundType.getRandomType(), "27-01-2023"));
        }

        Worker firstWorker = new Worker("Vasya");

        firstWorker.setAge(63);
        firstWorker.setMinSalary(1350);
        firstWorker.setMaxSalary(2357);
        firstWorker.setPensionFundSet(firstPensionFundSet);

        Worker secondWorker = new Worker("Petya");
        secondWorker.setAge(57);
        secondWorker.setMinSalary(1897);
        secondWorker.setMaxSalary(3531);
        Set<PensionFund> secondPensionFundSet = new HashSet<>();
        secondPensionFundSet.add(new PensionFund("", FundType.SCAMMERS, "01-01-2001"));
        secondPensionFundSet.add(new PensionFund("", FundType.NON_STATE, "01-01-2001"));
        secondWorker.setPensionFundSet(secondPensionFundSet);


        double firstResult = firstWorker.calculateBestPension();
        System.out.println(firstResult);
        double secondResult = secondWorker.calculateBestPension();
        System.out.println(secondResult);

    }
}