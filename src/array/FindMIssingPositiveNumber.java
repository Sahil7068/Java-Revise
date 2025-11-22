package array;

import java.util.Arrays;

public class FindMIssingPositiveNumber {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,2, 5, 7, 1};
        Arrays.sort(nums);

        int expected = 1;

        for (int num : nums) {
            if (num == expected) {
                expected++;
            }
        }

        System.out.println(expected);
    }
}
