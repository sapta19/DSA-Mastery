/**
 * Problem: 2490. Circular Sentence
 * Pattern: Circular Indexing / String Traversal
 * Logic: Compare the last character of each word with the first character of the next word.
 * Time Complexity: O(N) where N is length of sentence.
 * Space Complexity: O(N) due to split().
 */
public class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        int n = words.length;

        for (int i = 0; i < n; i++) {
            // Get last char of current word
            char lastChar = words[i].charAt(words[i].length() - 1);
            // Get first char of next word (circular wrap)
            char firstChar = words[(i + 1) % n].charAt(0);

            if (lastChar != firstChar) {
                return false;
            }
        }
        return true;
    }
}