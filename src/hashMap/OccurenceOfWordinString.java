package hashMap;
import java.util.*;

public class OccurenceOfWordinString {
    public static void main(String[] args) {
        String str = "QA testing automation QA";
        String[] str1 = str.split(" ");

        Map<String, Integer> m = new LinkedHashMap<>();

        for (int i = 0; i<str1.length; i++){
            m.put(str1[i], m.getOrDefault(str1[i], 0) + 1);

        }

        for (Map.Entry<String, Integer> entry : m.entrySet()){
            System.out.println(entry.getKey() +  " -> " + entry.getValue() + " ");
        }







    }
}
