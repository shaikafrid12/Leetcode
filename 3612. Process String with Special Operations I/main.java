import java.util.Scanner;

class Solution {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                result.append(ch);
            } else if (ch == '*') {
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            } else if (ch == '#') {
                result.append(result.toString());
            } else if (ch == '%') {
                result.reverse();
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String s = sc.nextLine();
            Solution sol = new Solution();
            System.out.println(sol.processStr(s));
        }
        sc.close();
    }
}