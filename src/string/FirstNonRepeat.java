package string;
import java.util.*;

public class FirstNonRepeat {
    public static void main(String[] args) {
        String str = "aabb";
        Map<Character, Integer> m = new LinkedHashMap<>();

        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            m.put(ch, m.getOrDefault(ch, 0) + 1);
        }
        Character firstNon = null;
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(m.get(ch) == 1){
                firstNon = ch;
                break;
            }
        }

        if(firstNon != null){
            System.out.println(firstNon);
        }
        else{
            System.out.println(-1);
        }
    }
}
