package org.example;

import org.example.printer.InkJetPrinter;
import org.example.printer.LaserPrinter;
import org.example.printer.Printer;

public class Main {
    public static void main(String[] args) {
        String[] document = new String[3];
        document[0] = "FIRST LINE;";
        document[1] = "MORE LINE";
        document[2] = "LAST LINE";

       // InkJetPrinter inkJetPrinter = new InkJetPrinter();
        Printer.print(new LaserPrinter(), document);
    }
}