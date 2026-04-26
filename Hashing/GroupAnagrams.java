/**
 * Problem: 49. Group Anagrams
 * Pattern: Hashing / Canonical Representation
 * Logic: Sort each string to create a "key". All anagrams will have the same sorted key.
 * Time Complexity: O(N * K log K) where N is number of strings, K is max string length.
 * Space Complexity: O(N * K) to store the groups in a HashMap.
 */
import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            // Create the key by sorting the characters
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);

            // Group the original string under the sorted key
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}