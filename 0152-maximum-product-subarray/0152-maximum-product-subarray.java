class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int result = Integer.MIN_VALUE;
        int pre = 1, suf = 1;
        for (int i = 0; i < nums.length; i++) {
            if (pre == 0)
                pre = 1;
            if (suf == 0)
                suf = 1;
            pre *= nums[i];
            suf *= nums[nums.length - i - 1];
            result = Math.max(result, Math.max(pre, suf));
        }
        return result;
    }
}