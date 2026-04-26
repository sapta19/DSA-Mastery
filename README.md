# 🚀 DSA Mastery & Revision Tracker
*6 YOE Java Backend Developer | Mastering Optimal Patterns*

## 📊 Problem Dashboard

### 🧱 Hashing & Frequency
*Pattern: Using `Map`, `Set`, or `int[]` for O(1) lookups.*

| # | Problem | Difficulty | Logic Shortcut | Status |
| :--- | :--- | :--- | :--- | :--- |
| 1 | [Two Sum](./Hashing/TwoSum.java) | Easy | Use a Map to store `(target - num)`. | ✅ |
| 242 | [Valid Anagram](./Hashing/ValidAnagram.java) | Easy | Frequency array `int[26]` for char counts. | ✅ |
| 217 | [Contains Duplicate](./Hashing/ContainsDuplicate.java) | Easy | `HashSet.add()` returns false if duplicate exists. | ✅ |
| 49 | [Group Anagrams](./Hashing/GroupAnagrams.java) | Medium | Sort string to create a "Canonical Key" for Map. | ✅ |

### 🎡 Circular & Sliding Window
*Pattern: Handling wrap-around and converting O(N²) to O(N).*

| # | Problem | Difficulty | Logic Shortcut | Status |
| :--- | :--- | :--- | :--- | :--- |
| 1652 | [Defuse the Bomb](./Sliding-Window/DefuseBomb.java) | Easy | Slide window: `sum - outgoing + incoming`. | ✅ |
| 2490 | [Circular Sentence](./Arrays-Strings/CircularSentence.java) | Easy | Match `word[i].last` with `word[(i+1)%n].first`. | ✅ |

### ↔️ Two Pointers
*Pattern: Symmetric checks or searching from both ends.*

| # | Problem | Difficulty | Logic Shortcut | Status |
| :--- | :--- | :--- | :--- | :--- |
| 125 | [Valid Palindrome](./Arrays-Strings/ValidPalindrome.java) | Easy | Converging `left` and `right` pointers; skip non-alphanumeric. | ✅ |

---

## 💡 Quick Logic Reference

### 1. The "Wrap-Around" Formula
In a circular array of size `n`:
* Moving Forward: `(i + 1) % n`
* Moving Backward: `(i - 1 + n) % n`

### 2. Sliding Window Mechanics
Instead of re-summing everything, reuse the previous sum:
```java
currentSum = currentSum - code[start % n] + code[(end + 1) % n];
