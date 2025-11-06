package string;

public class CountNoOfWord {
    public static void main(String[] args) {

        String str = "My name is Sahil";
        int count = 0;

        String[] str1 = str.split(" ");

        for (int i = 0; i<str1.length; i++){
            count++;
        }

        System.out.println(count);
    }
}
