class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int j = numbers.length - 1;
        int i = 0;
        while (i < j) {
            int temp = numbers[i] + numbers[j];
            if (temp == target) {
                return new int[] { i + 1, j + 1 };
            }
            if (temp > target) {
                j--;
            } else if (temp < target) {
                i++;
            }

        }

        return new int[] { -1, -1 };
    }
}