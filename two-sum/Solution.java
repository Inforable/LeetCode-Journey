import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complement = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (complement.get(target - nums[i]) != null) {
                return new int[]{complement.get(target - nums[i]), i};
            }
            complement.put(nums[i], i);
        } 
        return null;
    }
}