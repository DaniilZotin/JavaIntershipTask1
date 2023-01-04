package org.example.Ex2;

import java.util.*;
import java.util.stream.Collectors;

public class TaskMaps {
    public String[] words;
    public Map<String, Integer> NewFunc(ArrayList<String> Text) {
        if (Text.isEmpty()) {
            throw new IndexOutOfBoundsException("Text is empty");
        } else {
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
            nlist.stream().limit(5).toList().forEach(x -> map1.put(x.getKey(),x.getValue()));

            System.out.println(map1);
            return map1;

        }
    }
}
