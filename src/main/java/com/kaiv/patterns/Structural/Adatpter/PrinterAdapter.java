package com.kaiv.patterns.Structural.Adatpter;

public class PrinterAdapter implements Printer {
    private final OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void print(String text) {
        oldPrinter.displayText(text);
    }
}