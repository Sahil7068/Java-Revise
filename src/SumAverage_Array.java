public class SumAverage_Array {
    public static void main(String[] args) {
        int a [] = {3, 5, 6, 6};
        int n = a.length;
        int sum = 0;

        for (int i = 0; i<a.length; i++){
            sum = sum + a[i];
        }

        System.out.println("The sum is " + sum + " average is " + sum/n);

    }
}
