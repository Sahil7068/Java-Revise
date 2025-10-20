package array;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating_Array {
    public static void main(String[] args) {


        int a[] = {9, 4, 9, 6, 7, 4};
        int n = a.length;

        Map<Integer, Integer> m = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            m.put(a[i], m.getOrDefault(a[i], 0) + 1);
        }

        Integer dup = null;
        for (int i = 0; i < n; i++) {
            if (m.get(a[i]) == 1) {
                dup = a[i];
                break;

            }
        }

        if (dup != null) {
            System.out.println("The first non repeating element is " + dup);
        } else {
            System.out.println("No repeating element found");
        }
    }

}

