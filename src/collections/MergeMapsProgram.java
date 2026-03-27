package collections;

import java.util.*;

public class MergeMapsProgram {

    public static void main(String[] args) {

        Map<String,Integer> m1 = new HashMap<>();
        m1.put("A",1);
        m1.put("B",2);

        Map<String,Integer> m2 = new HashMap<>();
        m2.put("B",3);
        m2.put("C",4);

        // merging maps
        for(String key : m2.keySet()) {
            m1.put(key, m1.getOrDefault(key,0) + m2.get(key));
        }

        System.out.println(m1);
    }
}
