package com.gmail.prestonhigg17.SelfDivisor;

public class SelfDivisor
{
    /**
     * @param number the number to be tested
     *               Precondition: number > 0
     * @return true if every digit of is a divisor;
     * false otherwise
     */
    public static boolean isSelfDivisor(int number)
    {
        int currNumber = number;
        int digit = 0;
        while (currNumber > 0)
        {
            digit = currNumber % 10;
            if (digit == 0)
            {
                return false;
            }
            if (number % digit != 0)
            {
                return false;
            }
            currNumber = currNumber / 10;
        }
        return true;
    }

    /**
     * @param array of positive integers to be checked
     * @return an array containing the self-divisors
     */
    public static int[] findSelfDivisors(int[] array)
    {
        int currentIndex = 0;
        int returnArray[] = new int[array.length];
        for (int index = 0; index < array.length; index++)
        {
            if (isSelfDivisor(array[index]))
            {
                returnArray[currentIndex++] = array[index];
            }
        }
        return returnArray;
    }
}

