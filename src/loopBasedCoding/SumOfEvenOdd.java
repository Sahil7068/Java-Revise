package loopBasedCoding;

public class SumOfEvenOdd {
    public static void main(String[] args) {

        int num = 123456;
        int evenSum = 0;
        int oddSum = 0;

        while (num > 0) {
            int digit = num % 10; // extract last digit

            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }

            num = num / 10; // remove last digit
        }

        System.out.println("The sum of even digits is " + evenSum +
                " and the sum of odd digits is " + oddSum);
    }
}
