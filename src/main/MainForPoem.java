package main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainForPoem {

    public static void main(String[] args) throws IOException {
        /*
        Создайте файл data.txt. Запишите в него стихотворение любого автора, которого вы любите.
        Теперь создайте программу, которая считывает два числа (start, finish) с консоли - начальные и конечные номера строк.
        Задача сохранить в файл resize_data.txt только те строки из первоначального файла (оттуда надо сначала прочитать данные),
        номера которых располагаются между start и finish. */


        String inputPath = "resources/data.txt";
        String outputPath = "resources/resize_data.txt";


        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начало отрывка: ");
        int start = scanner.nextInt();
        System.out.print("Введите конец отрывка: ");
        int finish = scanner.nextInt();

        if (start > finish) {
            System.out.print("Недопустимое значение начала отрывка, давай по новой: ");
            start = scanner.nextInt();
        }

        List<String> strings = addTextFromFile(inputPath);

        createResizedFile(start, finish, outputPath, strings);

//        createResizedFileWithStream(start, finish, outputPath, strings);

    }

    public static List<String> addTextFromFile(String inputFilePath) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFilePath));

        List<String> strings = new ArrayList<>();

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            strings.add(line);
        }
        bufferedReader.close();

        return strings;
    }

    public static void createResizedFile(int start, int finish, String outputFilePath, List<String> strings) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFilePath));

        for (int i = 0; i < strings.size(); i++) {
            if (i >= start && i <= finish) {
                bufferedWriter.write(strings.get(i));
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.close();
    }

    public static void createResizedFileWithStream(int start, int finish, String outputFilePath, List<String> strings) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFilePath));

        strings.stream()
                .skip(start)
                .limit(finish - start)
                .forEach(e -> {
                    try {
                        bufferedWriter.write(e);
                        bufferedWriter.newLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

        bufferedWriter.close();
    }
}

