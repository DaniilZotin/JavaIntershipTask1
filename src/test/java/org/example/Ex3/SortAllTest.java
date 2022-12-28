package org.example.Ex3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortAllTest {

    @Test
    void getresult()
    {
        List<Double> result = new ArrayList<>(){{add(27.0);add(262.0);add(352.0);}};
        List<String> form = List.of("Cube","Culindr","Bullet");
        SortAll sortAll = new SortAll();
        assertEquals(result,sortAll.getresult(form));

    }
}