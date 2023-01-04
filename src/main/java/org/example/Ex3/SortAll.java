package org.example.Ex3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAll {

    Cube cube = new Cube(3);
    Bullet bullet = new Bullet(4);
    Culindr culindr = new Culindr(4, 7);

    ArrayList<Double> result = new ArrayList<>();
   
    public List<Double> getResult(List<String> form)
    {
        if(form.isEmpty())
        {
            throw new IndexOutOfBoundsException("List is empty");
        }
        for (String el : form) {
            if(el.equals("Cube"))
            {
                System.out.println(cube.result());
                result.add(cube.result());
            }
            else if(el.equals("Bullet"))
            {
                System.out.println(bullet.result());
                result.add(bullet.result());
            }
            else if(el.equals("Culindr"))
            {
                System.out.println(culindr.result());
                result.add(culindr.result());
            }
            
        }
        
        System.out.println(result.stream().sorted().toList());
        return result.stream().sorted().toList();
    }
}
