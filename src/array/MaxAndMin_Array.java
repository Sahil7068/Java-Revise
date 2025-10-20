package array;

public class MaxAndMin_Array {
    public static void main(String[] args) {

        int a[] = {3, 5, 1, 2, 6, 10, 12, 66};

        int max = a[0];
        int min = a[0];

        for (int i =1; i<a.length; i++){
            if (a[i]>max){
                max = a[i];
            }

            if(a[i] < min){
                min = a[i];
            }
        }

        System.out.println("The max is " + max + " " + "The min is " + min);





    }
}
