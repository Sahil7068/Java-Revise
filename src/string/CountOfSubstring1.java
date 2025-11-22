package string;

public class CountOfSubstring1 {
    public static void main(String[] args) {
        String str = "testertestertester";
        String sub = "tester";

        int count = 0;
        int index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            System.out.println(index);
            index = index + sub.length();
        }

        System.out.println("The count of the substring is " + count);
    }
}
