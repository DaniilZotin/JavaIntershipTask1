package org.example.Ex1;

import org.example.Ex3.SortAll;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortListTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {

    }

    @org.junit.jupiter.api.Test
    void sorting()
    {
        List <Integer> list = new ArrayList<>(){{add(1);add(0);add(-1);add(3);}};
        SortList sortList = new SortList();
        List <Integer> result = new ArrayList<>(){{add(1);add(3);}};
        assertEquals(result, sortList.Sorting(list));
    }
}