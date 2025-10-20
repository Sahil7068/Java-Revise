package hashMap;
import java.util.*;

public class CountOccurence {

    public static void main(String[] args) {
        int[] a = {2, 3, 2, 5, 3, 4, 2};
        int n = a.length;

        Map<Integer, Integer> m = new LinkedHashMap<>();

        for (int i = 0; i<n; i++){
            m.put(a[i], m.getOrDefault(a[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry: m.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }








    }
}
