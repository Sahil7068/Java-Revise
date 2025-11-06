package string;

public class NextChar {
    public static void main(String[] args) {

        String str = "aceg";
        String next = "";

        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            next = next + (char)(ch + 1) + " ";

        }

        System.out.println(next);




    }
}
