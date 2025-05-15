package com.kaiv.patterns.Structural.Composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Folder {

    String folderName;
    List<Folder> folderList = new ArrayList<>();

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    public void addFolder(Folder... folders){
        folderList.addAll(Arrays.asList(folders));
    }

    void printFolders(){
        for(Folder folder : folderList){

            System.out.println(folder.folderName);
            folder.printFolders();

        }
    }
}
