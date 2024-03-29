package org.crazymages.archivator;

public class RARArchivator extends Archivator {

    @Override
    public void archive(String fileName) {
        System.out.printf("file '%s' archived\n", fileName);
    }

    @Override
    public void dearchive(String fileName) {
        System.out.printf("file '%s' dearchived\n", fileName);
    }
}
