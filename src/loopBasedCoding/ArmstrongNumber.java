package loopBasedCoding;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check for Armstrong");
        int n = sc.nextInt();
        int digit = String.valueOf(n).length();

        int x = n;
        double arm = 0;

        while (x != 0) {
            int rem = x % 10;
            arm = arm + Math.pow(rem, digit);
            x = x / 10;
        }

        if (n == arm) {
            System.out.println("The number is armstrong");
        } else {
            System.out.println("The number is not armstrong");
        }
    }
}
