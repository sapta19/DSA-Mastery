/**
 * Problem: 1. Two Sum
 * Pattern: Hashing (Complement Lookup)
 * Logic: Store seen numbers in a Map. For each number, check if (target - num) exists in the Map.
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
import java.util.*;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}