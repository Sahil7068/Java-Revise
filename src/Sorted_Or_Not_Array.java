public class Sorted_Or_Not_Array {
    public static void main(String[] args) {
        int[] a = {3, 6, 5, 8, 0};
        int n = a.length;
        for (int i= 0; i<n-1; i++){
            for (int j = 0; j<n-1-i ; j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                }

            }
        }

        boolean isSorted = true;

        for (int i = 0; i<n-1; i++){
            if (a[i] > a[i+1]){
                isSorted = false;
                break;
            }
        }

        if (isSorted != false){
            System.out.println("The array is sorted");
        }
        else {
            System.out.println("The array is not sorted");
        }
    }
}
