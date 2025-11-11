package string;
import java.util.*;

public class MostFrequentLessFrequentChar {
    public static void main(String[] args) {

        String str = "saahilll";

        Map<Character, Integer> m = new LinkedHashMap<>();

        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            m.put(ch, m.getOrDefault(ch, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (char c : m.keySet()){
            int count = m.get(c);

            if (count > max){
                max = count;
            }

            if (count < min){
                min = count;
            }
        }

        System.out.println("Max is " + max + " and the min is " + min );





    }
}
