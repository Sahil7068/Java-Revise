package loopBasedCoding;

public class PalindromeNumber {
    public static void main(String[] args) {


        int num = 121;
        int x = num;
        int rev = 0;

        while (x!=0){
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x/10;
        }

        if (num == rev){
            System.out.println("The number is palindrome " + num);
        }
        else {
            System.out.println("The number is not palindrome " + num);
        }



    }
}
