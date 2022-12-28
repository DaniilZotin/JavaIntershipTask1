package org.example.Ex2;

import java.util.*;

public class Task_maps {
    public String[] words;
    public Map<String, Integer> NewFunc(ArrayList<String> Text) {


        TreeMap<String, Integer> map = new TreeMap<>();

        for (String el : Text) {
            words = Arrays.stream(el.split(" ")).distinct().toArray(String[]::new);
            for (String el1 : words) {
                if (el1.charAt(0) == '#') {
                    if (map.containsKey(el1)) {
                        int get = map.get(el1);
                        map.put(el1, ++get);
                    } else {
                        map.put(el1, 1);
                    }
                }

            }
        }

        List<Map.Entry<String, Integer>> nlist = new ArrayList<>(map.entrySet());
        nlist.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        Map<String, Integer> map1 = new LinkedHashMap<>();
        int n = 0;

        for (Map.Entry<String, Integer> entry : nlist) {
            map1.put(entry.getKey(), entry.getValue());
            n++;
            if (n == 5) {
                break;
            }
        }

        System.out.println(map1);
        return map1;
    }
}
