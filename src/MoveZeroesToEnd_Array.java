public class MoveZeroesToEnd_Array {
    public static void main(String[] args) {
        int[] a = {0,1,0,3,12};
        int n = a.length;
        int j = 0;

        for (int i = 0; i<n; i++){
            if (a[i]!=0){
                a[j]=a[i];
                j++;
            }
        }

        while (j<n){
            a[j] = 0;
            j++;
        }

        for (int num : a){
            System.out.println(num + " ");
        }

    }
}
