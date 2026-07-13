class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] dp = new int[nums.length + 1];

        for (int i = 1; i <= nums.length; i++) {
            dp[i] = dp[i - 1] + nums[i - 1];
        }

        int sum = dp[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int left = dp[i];
            int right = sum - dp[i + 1];

            if (left == right)
                return i;
        }

        return -1;
    }
}