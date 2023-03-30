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

        Random random = new Random();
        List<PensionFund> funds = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                funds.add(new PensionFund(
                        line,
                        FundType.getRandomType(),
                        String.valueOf(random.nextInt(1900, 2000))
                ));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return funds;
    }
}
