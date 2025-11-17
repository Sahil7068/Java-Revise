package string;
import java.util.*;

public class ReplaceRepeatCharacterWithFrequency {
    public static void main(String[] args) {
        String str = "Automation";
        String s = str.toLowerCase();
        String s1 = "";

        Map<Character, Integer> m = new LinkedHashMap<>();

        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            m.put(ch, m.getOrDefault(ch, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : m.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(m.get(ch)>1){
                s1 = s1 + m.get(ch);
            }
            else{
                s1 = s1 + ch;
            }
        }
        System.out.print(s1);
    }
}
