package array;

import java.util.LinkedHashSet;
import java.util.Set;

public class Union_Array {
    public static void main(String[] args) {

        int a [] = {1,2,3};
        int b [] ={3,4,5};

        Set<Integer> s = new LinkedHashSet<>();

        for (int k : a){
            s.add(k);
        }

        for (int k : b){
            s.add(k);
        }

        System.out.println(s);







    }
}
