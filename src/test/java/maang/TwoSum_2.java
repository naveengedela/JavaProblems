package maang;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_2 {
    public static void main(String[] args) {
        int[] numArr = {1, 2, 3, 1};
        int target = 5;
        System.out.println(Arrays.toString(twoSum(numArr, target)));

    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prepMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prepMap.containsKey(nums[i])) {
                return new int[]{prepMap.get(num), i};
            }
            prepMap.put(1, diff);
        }

        return new int[]{};

    }
}
