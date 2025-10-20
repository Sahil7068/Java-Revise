package loopBasedCoding;

public class ReverseNumber {
    public static void main(String[] args) {

        int num = 1234;
        int x = num;
        int rev = 0;

        while(x!=0){
            int rem = x%10;
            rev = rev * 10 + rem;
            x = x/10;
        }

        System.out.println("The reverse is " + rev);



    }
}
