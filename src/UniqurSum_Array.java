import java.util.LinkedHashSet;
import java.util.Set;

public class UniqurSum_Array {
    public static void main(String[] args) {
        int a [] = {1, 5, 7, -1, 5};
        int target = 6;
        int n = a.length;

        Set<String> s = new LinkedHashSet<>();

        for(int i = 0; i<n-1; i++){
            for (int j = i+1; j<n; j++){

                if (a[i] + a[j] == target){
                    int first = Math.min(a[i] , a[j]);
                    int second = Math.max(a[i], a[j]);

                    String pair = first + " , " + second;

                    // add pair only if not already present
                    if (s.add(pair)) {
                        System.out.println("(" + pair + ")");                  }


                }
            }

        }
    }
}
