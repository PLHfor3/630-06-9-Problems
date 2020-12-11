package com.gmail.prestonhigg17.HorseBarn;

public class HorseBarn
{
    private Horse[] spaces;

    /**
     * Constructor that takes the number of stalls
     *
     * @param numStalls - the number of stalls in the barn
     */
    public HorseBarn(int numStalls)
    {
        spaces = new Horse[numStalls];
    }

    /**
     * Returns the index of the space that contains the horse with the specified name.
     * * Precondition: No two horses in the barn have the same name.
     *
     * @param name the name of the horse to find
     * @return the index of the space containing the horse with the specified name;
     * -1 if no horse with the specified name is in the barn.
     */
    public int findHorseSpace(String name)
    {
        for (int index = 0; index < spaces.length; index++)
        {
            if (spaces[index] != null)
            {
                if (name.equals(spaces[index].getName()))
                {
                    return index;
                }
            }
        }
        return -1;
    }

    public void consolidate()
    {
        int stall = 0;
        while (stall < spaces.length)
        {
            if (spaces[stall] == null)
            {
                boolean found = false;
                int next = stall + 1;
                while (!found && next < spaces.length)
                {
                    if (spaces[next] != null)
                    {
                        spaces[stall] = spaces[next];
                        spaces[next] = null;
                        found = true;

                    }
                    next++;
                }
            }
            stall++;
        }
    }

    public String toString()
    {
        String result = "";
        Horse h = null;
        for (int i = 0; i < spaces.length; i++)
        {
            h = spaces[i];
            result = result + "space " + i + " has ";
            if (h == null)
            {
                result = result + " null \n";
            } else
            {
                result = result + h.toString() + "\n";
            }
        }
        return result;
    }

    public void DisplayHorseBarn()
    {
        for (int horseStall = 0; horseStall < spaces.length; horseStall++)
        {
            if (spaces[horseStall] != null)
            {
                System.out.println(horseStall + ". " + spaces[horseStall].getName());
            }
        }
    }

    public static void run()
    {
        HorseBarn barn = new HorseBarn(7);
        barn.spaces[0] = new Horse("Trigger", 1340);
        barn.spaces[2] = new Horse("Silver", 1210);
        barn.spaces[3] = new Horse("Lady", 1575);
        barn.spaces[5] = new Horse("Patches", 1350);
        barn.spaces[6] = new Horse("Duke", 1410);

        // print out what is in the barn
        System.out.println(barn);

        // test
        System.out.println("Index of Trigger should be 0 and is " +
                barn.findHorseSpace("Trigger"));
        System.out.println("Index of Silver should be 2 and is " +
                barn.findHorseSpace("Silver"));
        System.out.println("Index of Coco should be -1 and is " +
                barn.findHorseSpace("Coco"));
        System.out.println("CONSOLIDATE");
        barn.consolidate();
        System.out.println(barn);

        System.out.println("\nPartC\n");

        HorseBarn barn2 = new HorseBarn(7);
        barn2.spaces[0] = new Horse("Trigger", 1340);
        barn2.spaces[2] = new Horse("Silver", 1210);
        barn2.spaces[5] = new Horse("Diablo", 1350);
        barn2.spaces[6] = new Horse("Loco", 1410);

        System.out.println(barn2);

        System.out.println("Index of Trigger should be 0 and is " +
                barn2.findHorseSpace("Trigger"));
        System.out.println("Index of Silver should be 2 and is " +
                barn2.findHorseSpace("Silver"));
        System.out.println("Index of Diablo should be 5 and is " +
                barn2.findHorseSpace("Diablo"));
        System.out.println("CONSOLIDATE");
        barn2.DisplayHorseBarn();
        barn2.consolidate();
        System.out.println(barn2);
        barn2.DisplayHorseBarn();
    }

}
