package array;

public class MoveZeroesToEnd_Array {
    public static void main(String[] args) {
        int a [] = {0,1,0,3,12};
        int n = a.length;

        int result[] = new int[n];
        int j = 0;

        for(int i = 0; i<n; i++){
            if (a[i]!=0){
                result[j++] = a[i];
            }
        }

        while (j<n){
            result[j++] = 0;

        }

        for (int k : result){
            System.out.print(k + " ");
        }


    }
}
