package array;
import java.util.*;

public class FirstRepeatableElement_WithEdgeCases {
    public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        if(n <=2){
            System.out.println("The length is " + n + ", Please enter the length more than 2");
            return;
        }
        System.out.println("Enter the array");
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int h = first(a);
        if(h == -1){
            System.out.println("No repeatable integer");

        }
        else{
            System.out.println("The first repeatable element is " + h);
        }
        sc.close();
    }

    public static int first(int[] a){
        if(a == null || a.length == 0){
            return -1;
        }
        int n = a.length;

        Map<Integer, Integer> m = new LinkedHashMap<>();
        for(int i = 0; i<n; i++){
            m.put(a[i], m.getOrDefault(a[i], 0) + 1);
        }

        for(int i = 0; i<n; i++){
            if(m.get(a[i]) > 1){
                return a[i];

            }
        }
        return -1;


    }
}
