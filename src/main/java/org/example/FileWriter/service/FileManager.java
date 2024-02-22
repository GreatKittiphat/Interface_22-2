package org.example.FileWriter.service;

import java.util.List;

public class FileManager {
    private String filename;
    private String directory;

    public FileManager(String filename, String directory) {
        this.filename = filename;
        this.directory = directory;
    }

    public void writeData(List<?extends WriteAble> list) {
        for (String data : list){
            System.out.println(data.toCsvFormat);
        }
    }
}
