package org.crazymages.archivator;

public class ZIPArchivator extends Archivator {

    @Override
    public void archive(String fileName) {
        System.out.println("file archived");
    }

    @Override
    public void dearchive(String fileName) {
        System.out.println("file dearchived");
    }
}
