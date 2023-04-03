package classes;

import enums.FundType;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FundGenerator {

    public static List<PensionFund> generate() {

        String path = "resources/fund.txt";
        int startYear = 1900;
        int endYear = 2000;

        Random random = new Random();
        List<PensionFund> funds = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                funds.add(new PensionFund(
                        line,
                        FundType.getRandomType(),
                        String.valueOf(random.nextInt(startYear, endYear))
                ));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return funds;
    }
}
