class Solution {
    public boolean isAnagram(String s, String t) {
        
                int[] idk = new int[26];
                if (s.length() != t.length())
                    return false;
                for (char ch : s.toCharArray()) {
                    idk[ch - 'a']++;
                }
                for (char ch : t.toCharArray()) {
                    idk[ch - 'a']--;
                    if (idk[ch - 'a'] < 0)
                        return false;
                }
                return true;
           
    }
}