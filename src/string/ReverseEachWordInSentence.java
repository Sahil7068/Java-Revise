package string;

public class ReverseEachWordInSentence {
    public static void main(String[] args) {
        String str = "My name is new";
        String rev = "";

        String[] s = str.split(" ");

        for (int i = 0; i < s.length; i++) {
            char[] ch = s[i].toCharArray();

            for (int j = ch.length - 1; j >= 0; j--) {
                rev = rev + ch[j];
            }
            rev = rev + " ";
        }

        System.out.println(rev);
    }
}
