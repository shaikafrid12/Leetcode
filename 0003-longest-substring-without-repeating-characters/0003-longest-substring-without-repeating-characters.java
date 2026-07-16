class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int start = 0;
        int end = 0;
        int max = 0;
        while (end < s.length()) {
            char currentChar = s.charAt(end);
            if (!charSet.contains(currentChar)) {
                charSet.add(currentChar);
                max = Math.max(max, charSet.size());
                end++;
            } else {

                charSet.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}