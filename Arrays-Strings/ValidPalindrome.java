/**
 * Problem: 125. Valid Palindrome
 * Pattern: Two Pointers
 * Logic: Use two pointers (start and end) to compare characters while skipping non-alphanumeric chars.
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric characters from left
            while (left < right && !Character.isOrLetterDigit(s.charAt(left))) {
                left++;
            }
            // Skip non-alphanumeric characters from right
            while (left < right && !Character.isOrLetterDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters (case-insensitive)
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}