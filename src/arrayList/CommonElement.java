package arrayList;
import java.util.*;
import java.util.stream.*;

public class CommonElement {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(4);
        a.add(5);
        a.add(6);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(5);
        b.add(7);
        b.add(6);

        ArrayList<Integer> c = new ArrayList<>(a);
        c.retainAll(b);


        for (int k : c){
            System.out.print(k + " ");
        }

    }
}
