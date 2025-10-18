import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * This class finds the intersection of two integer arrays.
 * The intersection contains only the common elements between the two arrays.
 */
public class Intersection_Array {
    public static void main(String[] args) {
        // Input arrays
        int a[] = {1, 2, 2, 1};
        int b[] = {2, 2};

        // Set to store unique elements from the first array
        Set<Integer> uniqueElements = new LinkedHashSet<>();
        // Set to store the intersection elements
        Set<Integer> intersection = new LinkedHashSet<>();

        // Add all elements from first array to the set (duplicates are automatically removed)
        for (int num : a) {
            uniqueElements.add(num);
        }

        // Check each element in the second array
        // If it exists in the first array, add to intersection set
        for (int num : b) {
            if (uniqueElements.contains(num)) {
                intersection.add(num);
            }
        }

        // Convert the intersection set to an array for output
        int result[] = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            result[i++] = num;
        }

        // Print the intersection array
        System.out.println("Intersection of the arrays: " + Arrays.toString(result));
    }
}
