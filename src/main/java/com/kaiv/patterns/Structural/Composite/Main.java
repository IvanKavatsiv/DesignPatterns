package com.kaiv.patterns.Structural.Composite;

public class Main {

    public static void main(String[] args) {

        Folder rootFolder = new Folder("root folder");
        Folder usersFolders = new Folder("usersFolders folder");
        Folder aps = new Folder("apps folder");

        rootFolder.addFolder(usersFolders);
        rootFolder.addFolder(aps);

        Folder maxFolder = new Folder("max");
        Folder mikeFolder = new Folder("mike");

        usersFolders.addFolder(maxFolder);
        usersFolders.addFolder(mikeFolder);

        rootFolder.printFolders();
        usersFolders.printFolders();

    }

    public void addFolder(Folder folder){

    }
}
