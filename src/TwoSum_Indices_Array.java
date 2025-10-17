public class TwoSum_Indices_Array {
    public static void main(String[] args) {
        int a [] = {2,7,11,15,1,8};
        int target = 9;
        int n = a.length;

        for(int i = 0; i<n-1; i++){
            for (int j = i+1; j<n; j++){
                if (a[i] + a[j] == target){
                    System.out.println("The indices are " + i + " " + j +  " ");


                }
            }
        }

    }
}
