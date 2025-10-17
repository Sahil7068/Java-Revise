public class Copy_Array {
    public static void main(String[] args) {
        int[] a = {3, 5, 6, 6};
        int copy[] = new int[a.length];

        for (int i = 0; i<a.length; i++){
            copy[i] = a[i];
        }

        for (int k : copy){
            System.out.print(k + " ");
        }






    }
}
