package array;

public class RotateArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int n = a.length;

        int k = 2;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n-k; i<n; i++){
            ans[j++] = a[i];
        }
        for (int i = 0; i<n-k; i++){
            ans[j++] = a[i];
        }

        for(int m : ans){
            System.out.print(m + " ");
        }
    }
}
