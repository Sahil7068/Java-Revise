package arrayList;
import java.util.*;
import java.util.stream.*;

public class MaxMin {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(10, 30, 20, 40));

        List<Integer> b = a.stream().sorted().collect(Collectors.toList());

        System.out.println("The highest number is " + b.get(b.size() - 1) + " and the smallest number is " + b.get(0));
    }
}
