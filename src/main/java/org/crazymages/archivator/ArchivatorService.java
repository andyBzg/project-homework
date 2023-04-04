package org.crazymages.archivator;

import java.util.List;

public class ArchivatorService {

    public static void printArchivatorList(List<? extends Archivator> list) {
        for (Archivator archivator : list) {
            System.out.println(archivator);
        }
    }

    public static void addArchivatorToList(List<? super Archivator> list) {
        list.add(new ZIPArchivator());
    }
}
