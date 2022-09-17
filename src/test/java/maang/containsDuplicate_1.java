package maang;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate_1 {
    public static void main(String[] args) {
        int[] numArr = {1, 2, 3, 1};
        int[] numArr1 = {1, 2, 3, 4};
        int[] numArr2 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containDuplicate(numArr));
        System.out.println(containDuplicate(numArr1));
        System.out.println(containDuplicate(numArr2));

    }

    public static boolean containDuplicate(int[] nums) {
        Set<Integer> values = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (values.contains(nums[i])){
                return true;
            }
            values.add(nums[i]);
        }
        return false;
    }
}
