package com.gmail.prestonhigg17.SelfDivisor;

public class SelfDivisorExecutePartB
{
    public static void SelfDivB()
    {
        System.out.println(SelfDivisor.isSelfDivisor(24));
        int n[] = {2, 7, 10, 12, 14, 25, 30, 32, 36, 48, 128};
        int r[] = SelfDivisor.findSelfDivisors(n);

        for (int i = 0; i < r.length; i++)
        {
            System.out.printf("%4d %4d\n", i, r[i]);
        }
    }
}