# 1189. Maximum Number of Balloons

Given a string `text`, you want to use the characters of `text` to form as many instances of the word **"balloon"** as possible.

You can use each character in `text` at most once. Return the maximum number of instances that can be formed.

## Example 1:

**Input:** `text = "nlaebolko"`  
**Output:** `1`  

## Example 2:

**Input:** `text = "loonbalxballpoon"`  
**Output:** `2`  

## Example 3:

**Input:** `text = "leetcode"`  
**Output:** `0`  

## Constraints:

* `1 <= text.length <= 10^4`
* `text` consists of lower case English letters only.

## Algorithm (Java)

1. **Count Character Frequencies:**
   * Count the occurrences of each lowercase letter in the given string `text`. Since the word is "balloon", we only need to keep track of the counts of `'b'`, `'a'`, `'l'`, `'o'`, and `'n'`.
2. **Account for Letter Duplication:**
   * The word "balloon" contains the letters `'l'` and `'o'` twice. Therefore, the number of instances we can form is limited by `l / 2` and `o / 2`.
3. **Determine the Maximum Formable Words:**
   * The maximum number of "balloon" words we can form is the minimum count among:
     * Count of `'b'`
     * Count of `'a'`
     * Count of `'l' / 2`
     * Count of `'o' / 2`
     * Count of `'n'`
4. **Return Results:**
   * Return the minimum value.