package loopBasedCoding;

public class Fibonacci {
    public static void main(String[] args) {

        int N = 7;

        int a = 0;
        int b = 1;

        System.out.print (a + " " + b + " ");
        for (int i = 1; i<=N-2; i++){
            int temp = a + b;
            System.out.print(temp + " ");
            a = b;
            b = temp;
        }





    }
}
