import java.util.*;

class FirstRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str.isEmpty()){
            System.out.println("No input");
            return;
        }

        Map<Character, Integer> m = new LinkedHashMap<>();

        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            m.put(ch, m.getOrDefault(ch, 0) + 1);
        }

        Character firstRepeatingChar = null;

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (m.get(ch) > 1){
                firstRepeatingChar = ch;
                break;
            }
        }

        if (firstRepeatingChar != null){
            System.out.println("The first repeating character is " + firstRepeatingChar);
        }
        else{
            System.out.println("null");
        }




        sc.close();






    }




}