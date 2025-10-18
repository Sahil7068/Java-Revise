public class MoveZerorsToFront_Array {
    public static void main(String[] args) {
        int a[] = {0, 1, 0, 3, 12};
        int n = a.length;
        int[] result = new int[n];
        int j = 0;

        // Step 1: Copy all zeros first
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                result[j++] = 0;
            }
        }

        // Step 2: Then copy all non-zeros
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                result[j++] = a[i];
            }
        }

        // Print result
        for (int k : result) {
            System.out.print(k + " ");
        }
    }
}


