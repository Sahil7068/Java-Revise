package loopBasedCoding;

public class SumOfDigit {
    public static void main(String[] args) {


        int num = 1234;
        int x = num;
        int sum = 0;

        while (x!=0){
            int rem = x % 10;
            sum = sum + rem;
            x = x/10;

        }

        System.out.println("The sum is " + sum);





    }
}
