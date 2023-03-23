package classes;

import enums.Sex;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonGenerator {

    public static List<Person> generate() throws IOException {

        String inputFilePath = "resources/names.txt";

        File file = new File(inputFilePath);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        List<Person> list = new ArrayList<>();

        Random random = new Random();

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            Worker worker = new Worker(
                    line,
                    random.nextInt(18, 80),
                    setGender(line));
            list.add(worker);
        }
        bufferedReader.close();

        return list;
    }

    private static Sex setGender(String line) {
        String checkSymbol = "а";
        if (line.endsWith(checkSymbol)) {
            return Sex.FEMALE;
        } else {
            return Sex.MALE;
        }
    }
}
