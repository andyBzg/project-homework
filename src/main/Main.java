package main;

import classes.*;
import enums.FundType;

import java.io.IOException;
import java.util.List;


public class Main {

    private static final int MAX_NAME_LENGTH = 15;

    public static void main(String[] args) throws IOException {

        List<PensionFund> pensionFunds = FundGenerator.generate();

        pensionFunds.stream()
                .filter(f -> f.getFundType() != null)
                .filter(f -> f.getFundType().equals(FundType.STATE))
                .filter(f -> f.getName() != null)
                .filter(f -> f.getName().length() < MAX_NAME_LENGTH)
                .forEach(System.out::println);

    }
}