package org.example.printer;

public class InkJetPrinter implements Printable{
    @Override
    public void print(String[] document) {
        System.out.println("Feed paper");
        System.out.println("Setup for Ink Jet");

        for (String data : document) {
            System.out.println(data);
        }

    }
}
