// Problem: Given an array of integers and a target, return the indices of two numbers that add up to the target.
// Time Complexity: O(N)
// Auxiliary Space: O(N)

import java.util.*;

class Main {

    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (seen.containsKey(need)) {
                return new int[] { seen.get(need), i };
            }
            seen.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}

/* Test Case:
Input: nums = [2, 7, 11, 15], target = 9
Output: [0, 1]
*/