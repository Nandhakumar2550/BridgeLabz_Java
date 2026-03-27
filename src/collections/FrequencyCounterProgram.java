package collections;

import java.util.*;

public class FrequencyCounterProgram {

    public static void main(String[] args) {

        // input list
        List<String> list = Arrays.asList("apple","banana","apple","orange");

        // map to store frequency
        Map<String, Integer> map = new HashMap<>();

        // counting frequency
        for(String s : list) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        // printing result
        System.out.println(map);
    }
}