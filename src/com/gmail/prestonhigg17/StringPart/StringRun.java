package com.gmail.prestonhigg17.StringPart;

public class StringRun
{
    public static void run()
    {
        StringPart sp1 = new StringPart(37, 3); // Part A
        StringPart sp[] = new StringPart[4]; // Part B
        sp[0] = new StringPart(37, 3); // Part B
        sp[1] = new StringPart(14, 2); // Part B
        sp[2] = new StringPart(46, 2); // Part B
        sp[3] = new StringPart(9, 2); // Part B
        System.out.println("Part C: " + sp[0].getStringPart() + sp[1].getStringPart() + sp[2].getStringPart() + sp[3].getStringPart());
        StringPart person = new StringPart("person");
        System.out.println("Part D: " + "strt = " + person.getStrt() + "\n        len = " + person.getLen());
    }
}
