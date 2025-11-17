package hashMap;
import java.util.*;

public class FindKeyForValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("QA", 5);
        map.put("Automation", 2);
        map.put("Testing", 8);

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue().equals(5)){
                System.out.println(entry.getKey());
            }
        }
    }
}
