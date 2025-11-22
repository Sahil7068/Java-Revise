package string;
import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();


        if (str.length() == str1.length()){

            char c[] = str.toCharArray();
            char d[] = str1.toCharArray();

            Arrays.sort(c);
            Arrays.sort(d);

            if(Arrays.equals(c, d)){
                System.out.println("The string is anagram");
            }
            else{
                System.out.println("The string is not anagram");
            }
        }

        else{
            System.out.println("The string is not anagram");
        }
    }
}
