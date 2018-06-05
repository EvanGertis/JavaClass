package com.gertis;

public class Printer {
    private int pagesPrinted;
    private float tonerLevel;
    private boolean isDuplex;

    public Printer( float tonerLevel, boolean isDuplex) {
        this.pagesPrinted = 0;
        if(tonerLevel >= 0 && tonerLevel <=100 )
        {
            this.tonerLevel = tonerLevel;
        }
        else
        {
            this.tonerLevel = -1;
        }
        this.isDuplex = isDuplex;
    }

    public float FillTonerLevel(float tonerLevelPercentage)
    {
        if(this.tonerLevel >= 0 && this.tonerLevel <= 100)
        {
            if(this.tonerLevel + tonerLevelPercentage > 100)
            {
                return -1;
            }
            else
            {
                this.tonerLevel += tonerLevelPercentage;
                return this.tonerLevel;
            }
        }
        else
        {
            return -1;
        }


    }


    public int printPages(int numPagesToPrint)
    {
        if(this.isDuplex)
        {
            numPagesToPrint /= 2 + (numPagesToPrint % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += numPagesToPrint;
        return numPagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
