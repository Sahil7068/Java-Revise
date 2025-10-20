package loopBasedCoding;

public class CountOfDigit {
    public static void main(String[] args) {


        int num = 98765;
        int x = num;
        int count=0;

        while(x!=0){
            int rem = x % 10;
            count++;
            x = x/10;
        }

        System.out.println("The count of the digit is " + count);




    }
}
