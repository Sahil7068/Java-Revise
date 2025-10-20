package hashMap;

import java.util.*;

public class SortingAsPerValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("QA", 5);
        map.put("Automation", 2);
        map.put("Testing", 8);

        // Convert to a list of entries
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // Sort by value (ascending)
        list.sort(Map.Entry.comparingByValue());

        // Print sorted result
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
