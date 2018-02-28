package Chapter11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercise9
{
    public static void main(String[] args)
    {
        /*
            Write a method hasEven that accepts a set of integers as a parameter and returns
            true if the set contains at least one even integer and false otherwise. If passed
            the empty set, your method should return false.
         */

        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(3);
        set.add(5);
        set.add(6);

        System.out.println(hasEven(set));

    }

    public static boolean hasEven(Set<Integer> set)
    {
        if(set.isEmpty())
        {
            return false;
        }

        Iterator<Integer> iterator = set.iterator();

        while(iterator.hasNext())
        {
            int current = iterator.next();

            if(current % 2 == 0)
            {
                return true;
            }
        }

        return false;

    }
}
