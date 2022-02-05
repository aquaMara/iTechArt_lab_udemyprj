package com.aquam.unit_7.Encapsulation;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100)
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (tonerLevel + tonerAmount > 100)
                return -1;
            else
                return tonerLevel += tonerAmount;
        }
        return -1;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (duplex)
            pagesToPrint = pagesToPrint / 2 + pagesToPrint % 2;
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
}
