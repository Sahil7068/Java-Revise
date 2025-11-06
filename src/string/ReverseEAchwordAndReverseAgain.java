package string;

public class ReverseEAchwordAndReverseAgain {
    public static void main(String[] args) {
        String str = "My name is new";
        String rev = "";
        String rev1 = "";

        String[] s = str.split(" ");

        for (int i =s.length-1; i>=0; i--){
            rev = rev + s[i];
            rev = rev + " ";
        }

        String p[] = rev.split(" ");

        for (int i = 0; i<p.length; i++){
            char[] ch = p[i].toCharArray();

            for (int j = ch.length-1; j>=0; j--){
                rev1 = rev1 + ch[j];

            }
            rev1 = rev1 + " ";
        }

        System.out.println(rev1);

    }
}
