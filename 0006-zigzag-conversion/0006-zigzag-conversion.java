class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows)
            return s;
        StringBuilder[] arr = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            arr[i] = new StringBuilder();
        }
        int row = 0;
        boolean down = true;
        for (char ch : s.toCharArray()) {
            arr[row].append(ch);
            if (row == 0)
                down = true;
            else if (row == numRows - 1)
                down = false;

            if (down)
                row++;
            else
                row--;
        }
        StringBuilder ans = new StringBuilder();

        for (StringBuilder sb : arr) {
            ans.append(sb);
        }
        return ans.toString();
    }
}