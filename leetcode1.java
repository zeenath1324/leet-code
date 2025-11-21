import java.util.*;
public class leet1 {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];

            // If pair found
            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }

            // Store value → index
            map.put(nums[i], i);
        }

        return new int[]{}; // no pair found
    }
