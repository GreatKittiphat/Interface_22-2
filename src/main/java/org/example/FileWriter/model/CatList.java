package org.example.FileWriter.model;

import java.util.List;

public class CatList {
    private List<Cat> catList;

    public CatList(List<Cat> catList) {
        this.catList = catList;
    }

    public List<Cat> getCatList() {
        return catList;
    }

    public void setCatList(List<Cat> catList) {
        this.catList = catList;
    }
}
