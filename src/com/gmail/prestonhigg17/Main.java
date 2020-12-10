package com.gmail.prestonhigg17;

import java.text.MessageFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        DiceRun dice = new DiceRun();
        BatteryRun battery = new BatteryRun();
        StringRun stringrun = new StringRun();
        String scannerVar = "";
        int initializer = 0;
        while ((scannerVar.equals("DiceA") || scannerVar.equals("DiceB") || scannerVar.equals("DiceC") || scannerVar.equals("Battery") || scannerVar.equals("String")) || initializer < 1)
        {
            System.out.print(MessageFormat.format("Please choose a program below or type \"exit\" to exit: \n{0}\n{1}\n{2}\n{3}\n{4}",
                    " - Type \"DiceA\" to run the Dice Class: Assignment Part A Program",
                    " - Type \"DiceB\" to run the Dice Class: Assignment Part B Program",
                    " - Type \"DiceC\" to run the Dice Class: Assignment Part C Program",
                    " - Type \"Battery\" to run the Battery Program",
                    " - Type \"String\" to run the String-Part Program\n $ "));
            scannerVar = scan.next();
            initializer++;
            if (scannerVar.equals("DiceA"))
            {
                dice.runA();
            } else if (scannerVar.equals("DiceB"))
            {
                dice.runB();
            } else if (scannerVar.equals("DiceC"))
            {
                dice.runC();
            } else if (scannerVar.equals("Battery"))
            {
                battery.run();
            } else if (scannerVar.equals("String"))
            {
                stringrun.run();
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

