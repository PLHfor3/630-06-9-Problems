package com.gmail.prestonhigg17.TwoVarStatistics;


import java.io.InputStream;
import java.util.Scanner;

public class TwoVarStats
{
    double x[];
    double y[];
    int size = 0; //Current Size
    int maxSize = 0; //maxSizeArrayCanPossiblyBe

    public TwoVarStats(int maxSize)
    {
        this.maxSize = maxSize;
        x = new double[maxSize];
        y = new double[maxSize];
        size = 0;
    }

    public void addXY(double a, double b)
    {
        x[size] = a;
        y[size] = b;
        size++;
    }


    public void setX(double x[])
    {
        this.x = x;
    }

    public void setY(double y[])
    {
        this.y = y;
    }

    public double sumX()
    {
        double sumOfXValues = 0;
        for (double sumCalc : x)
        {
            sumOfXValues += sumCalc;
        }
        return sumOfXValues;
    }

    public double sumY()
    {
        double sumOfYValues = 0;
        for (double sumCalc : y)
        {
            sumOfYValues += sumCalc;
        }
        return sumOfYValues;
    }

    public double sumX2()
    {
        double sumOfXValues = 0;
        for (double sumCalc : x)
        {
            sumOfXValues += (sumCalc * sumCalc);
        }
        return sumOfXValues;
    }

    public double sumY2()
    {
        double sumOfYValues = 0;
        for (double sumCalc : y)
        {
            sumOfYValues += (sumCalc * sumCalc);
        }
        return sumOfYValues;
    }

    public double sumXY()
    {
        double sumOfXYValues = 0;
        for (int possition = 0; possition < size; possition++)
        {
            sumOfXYValues += (x[possition] * y[possition]);
        }
        return sumOfXYValues;
    }

    public double getSlope()
    {
        return (((double) size * sumXY() - sumX() * sumY()) / ((double) size * sumX2() - (sumX() * sumX())));
    }

    public double getIntercept()
    {
        return ((sumY() - (getSlope()) * sumX()) / (double) size);
    }

    public String toString()
    {
        String output = "";
        for (int amountOfValues = 0; amountOfValues < size; amountOfValues++)
        {
            output += (x[amountOfValues] + ", " + y[amountOfValues] + " | ");
        }
        output += "\n";
        return output;
    }
}
