package arrayList;

import java.util.*;

public class CountNumberOfItems {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Integer> m = new LinkedHashMap<>();

        for (String k : words){
            m.put(k, m.getOrDefault(k, 0) + 1);

        }

        for (Map.Entry<String, Integer> entry : m.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
