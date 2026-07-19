class Solution {
    public String smallestSubsequence(String s) {
        int n = s.length();

        // Last occurrence of each character
        int[] last = new int[26];
        for (int i = 0; i < n; i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        boolean[] visited = new boolean[26];
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            // Skip if already used
            if (visited[c - 'a']) continue;

            // Maintain lexicographical order
            while (!stack.isEmpty() &&
                   c < stack.peek() &&
                   last[stack.peek() - 'a'] > i) {

                visited[stack.pop() - 'a'] = false;
            }

            stack.push(c);
            visited[c - 'a'] = true;
        }

        // Build result
        StringBuilder result = new StringBuilder();
        for (char c : stack) result.append(c);

        return result.toString();
    }
}