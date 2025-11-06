package string;

public class compression {
    public static void main(String[] args) {
        String str = "aaabbcc";
        int count = 1;
        String value= str.charAt(0) + "";

        for (int i =1; i<str.length(); i++){
            char pre = str.charAt(i-1);
            char curr = str.charAt(i);


            if (pre == curr){
                count++;
            }

            else{
                value = value + count;
                count = 1;
                value = value + curr;


            }
        }
        value = value + count;

        System.out.println(value);
    }
}
