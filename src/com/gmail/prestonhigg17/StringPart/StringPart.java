package com.gmail.prestonhigg17.StringPart;

public class StringPart
{
    // the master string
    String master = "sixtyzipperswerequicklypickedfromthewovenjutebag";

    // the start and length values for this string part
    private int strt;
    private int len;

    /**
     * @param start  the starting position in the master string
     * @param length the length in the master string
     */
    public StringPart(int start, int length)
    {
        strt = start;
        len = length;
    }

    public StringPart(String input)
    {
        boolean found = false;
        while (!found)
        {
            int startIndex = master.indexOf(input);
            if (startIndex != -1)
            {
                strt = startIndex;
                len = input.length();
                found = true;
            } else
            {
                input = input.substring(0, input.length() - 1);
            }

        }
    }


    /**
     * @return the string part as a decoded string
     */
    public String getStringPart()
    {
        return master.substring(strt, strt + len);
    }

    public int getStrt()
    {
        return strt;
    }

    public int getLen()
    {
        return len;
    }
}

