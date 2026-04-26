/**
 * Problem: 1652. Defuse the Bomb
 * Pattern: Sliding Window (Optimal)
 * Logic: Maintain a window of size |k|. Slide by subtracting 'start' and adding 'end + 1'.
 * Time Complexity: O(N)
 * Space Complexity: O(1) extra space (excluding result array).
 */
public class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];
        if (k == 0) return result;

        // Initialize window bounds
        int start = (k > 0) ? 1 : n + k;
        int end = (k > 0) ? k : n - 1;

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += code[i % n]; // % n handles initial range wrap
        }

        for (int i = 0; i < n; i++) {
            result[i] = sum;
            // Subtract element leaving window
            sum -= code[start % n];
            // Add element entering window
            sum += code[(end + 1) % n];

            start++;
            end++;
        }
        return result;
    }
}