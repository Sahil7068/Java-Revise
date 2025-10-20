package arrayList;
import java.util.*;
import java.util.stream.*;

public class RemoveNullOrEmpty {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>(Arrays.asList("Selenium", "Java", "API", ""));

        a.removeIf(e -> e==null || e.isEmpty());

        System.out.println(a);








    }
}
