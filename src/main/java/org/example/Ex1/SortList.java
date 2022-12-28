package org.example.Ex1;

import java.util.Iterator;
import java.util.List;

public class SortList {
    public List<Integer> Sorting(List<Integer> list)
    {
        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
            int x = (int)itr.next();
            if(x <= 0)
            {
                itr.remove();
            }
        }
        System.out.println(list.toString());

        return list;
    }
}
