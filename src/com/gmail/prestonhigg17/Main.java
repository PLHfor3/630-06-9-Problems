package com.gmail.prestonhigg17;

import com.gmail.prestonhigg17.HorseBarn.HorseBarn;
import com.gmail.prestonhigg17.SelfDivisor.SelfDivisorExecutePartA;
import com.gmail.prestonhigg17.SelfDivisor.SelfDivisorExecutePartB;
import com.gmail.prestonhigg17.StringPart.StringRun;
import com.gmail.prestonhigg17.TwoVarStatistics.VarStatsRun;

import java.text.MessageFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String scannerVar = "";
        int initializer = 0;
        while ((scannerVar.equals("DivideA") || scannerVar.equals("DivideB") || scannerVar.equals("Stats") || scannerVar.equals("Horse") || scannerVar.equals("String")) || initializer < 1)
        {
            System.out.print(MessageFormat.format("Please choose a program below or type \"exit\" to exit: \n{0}\n{1}\n{2}\n{3}\n{4}",
                    " - Type \"DivideA\" to run the Self Divisor Part A Program",
                    " - Type \"DivideB\" to run the Self Divisor Part B Program",
                    " - Type \"Horse\" to run the Horse Program",
                    " - Type \"Stats\" to run the Stats Program",
                    " - Type \"String\" to run the String-Part Program\n $ "));
            scannerVar = scan.next();
            initializer++;
            if (scannerVar.equals("DivideA"))
            {
                SelfDivisorExecutePartA.SelfDivA();
            } else if (scannerVar.equals("DivideB"))
            {
                SelfDivisorExecutePartB.SelfDivB();
            } else if (scannerVar.equals("Horse"))
            {
                HorseBarn.run();
            } else if (scannerVar.equals("Stats"))
            {
                VarStatsRun.run();
            } else if (scannerVar.equals("String"))
            {
                StringRun.run();
            } else
            {
                System.out.print("Terminating process...\n ");
                break;
            }
            try
            {
                Thread.sleep(2500);
            } catch (InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            pressEnterToContinue();
            int typeSpaceClear = 0;
            while (typeSpaceClear < 80)
            {
                System.out.print("\n");
                typeSpaceClear++;
            }
        }
    }

    private static void pressEnterToContinue()
    {
        System.out.println("\nPress Enter key to continue...");
        try
        {
            System.in.read();
        } catch (Exception e)
        {
        }
    }
}

