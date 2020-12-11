package com.gmail.prestonhigg17.TwoVarStatistics;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.InputStream;
import java.util.Scanner;

public class VarStatsRun
{
    public static void run()
    {
        TwoVarStats tvs = new TwoVarStats(15);
        InputStream input = TwoVarStats.class.getResourceAsStream("data.txt");
        Scanner scan = new Scanner(input);
        int size = scan.nextInt();
        for (int record = 0; record < size; record++)
        {
            double xValue = scan.nextDouble();
            double yValue = scan.nextDouble();
            tvs.addXY(xValue, yValue);
        }
        System.out.println(tvs.toString());
        System.out.println("SumX = " + tvs.sumX());
        System.out.println("SumY = " + tvs.sumY());
        System.out.println("SumX2 = " + tvs.sumX2());
        System.out.println("SumY2 = " + tvs.sumY2());
        System.out.println("SumXY = " + tvs.sumXY());
        System.out.println("Slope = " + tvs.getSlope());
        System.out.println("Intercept = " + tvs.getIntercept());
    }
}
