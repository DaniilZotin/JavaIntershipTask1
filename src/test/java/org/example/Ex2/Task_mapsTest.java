package org.example.Ex2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Task_mapsTest {

    @Test
    void newFunc()
    {
        ArrayList<String> Text = new ArrayList<>();
        Text.add("#Hello wdadwa #wda #Hello #Helflo #Helfdalo");
        Text.add("awdgr #Heldwalo wdadwa #wda #Helflo");
        Text.add("#Helflo wdadwa #wwadda wdaadw #Hello");
        Task_maps taskMaps = new Task_maps();
        Map<String, Integer> result = new HashMap<>();
        result.put("#Helflo",3);
        result.put("#Hello",2);
        result.put("#wda",2);
        result.put("#Heldwalo",1);
        result.put("#Helfdalo",1);
        assertEquals(result,taskMaps.NewFunc(Text));
    }
}