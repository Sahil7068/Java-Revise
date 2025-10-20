package loopBasedCoding;

public class PrimeFrom1ToN {
    public static void main(String[] args) {

        int N = 10;

        System.out.print("The prime numbers are ");

        for (int i = 2; i<=N; i++){
            boolean isPrime = true;

            for (int j = 2; j<i; j++){
                if (i%j ==0){
                    isPrime = false;
                }
            }

            if (isPrime){
                System.out.print(i + " ");
            }

        }








    }
}
