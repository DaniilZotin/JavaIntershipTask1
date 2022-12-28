package org.example;

import org.example.Ex2.Task_maps;
import org.example.Ex3.SortAll;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        ArrayList<String> Text = new ArrayList<>();
        Text.add("#Hello wdadwa #wda #Hello #Helflo #Helfdalo");
        Text.add("awdgr #Heldwalo wdadwa #wda #Helflo");
        Text.add("#Helflo wdadwa #wwadda wdaadw #Hello");
        Task_maps taskMaps = new Task_maps();
        taskMaps.NewFunc(Text);
        List<String> form = List.of("Cube","Culindr","Bullet");
        SortAll sortAll = new SortAll();
        sortAll.getresult(form);
    }
}