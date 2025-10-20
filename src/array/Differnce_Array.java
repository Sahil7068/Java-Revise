package array;

public class Differnce_Array {
    public static void main(String[] args) {
        int[] a= {3, 6, 5, 8, 0};
        int n = a.length;
        int difference = 0;
        int max = a[0];
        int min = a[0];

        for (int i=1; i<n; i++){
            if (a[i] > max){
                max = a[i];
            }

            if (a[i] < min){
                min = a[i];
            }

        }

        difference = max - min;

        System.out.println("The difference is " + difference);
    }
}
