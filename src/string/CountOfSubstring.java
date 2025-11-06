package string;

public class CountOfSubstring {
    public static void main(String[] args) {
        String str = "testertestertester";
        String sub = "tester";
        int index = 0;
        int count = 0;

        while ((index=str.indexOf(sub, index)) != -1){
            count++;
            index+=sub.length();
        }

        System.out.println("The occurrence of the substring is " + count);

    }
}
