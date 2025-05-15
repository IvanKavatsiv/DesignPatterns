package com.kaiv.patterns.Structural.Adatpter;

public class Main {

    public static void main(String[] args) {
        OldPrinter oldPrinter = new OldPrinter();
        Printer adapter = new PrinterAdapter(oldPrinter);
        adapter.print("Hello world!");
    }
}
