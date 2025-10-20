package array;

public class reverse_Array {
    public static void main(String[] args) {
        int a [] = {3, 5, 6, 6};
        int n = a.length;
        int temp[] = new int [n];
        int j = 0;

        for (int i = n-1; i>=0; i--){
            temp[j++] = a[i];

        }

        for (int k : temp){
            System.out.print (k + " ");
        }






    }
}
