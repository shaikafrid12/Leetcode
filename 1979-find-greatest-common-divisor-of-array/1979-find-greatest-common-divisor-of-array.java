class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int x = nums[0];
        int y = nums[nums.length - 1];
        return gcd(x, y);
    }

    public int gcd(int x, int y) {
        while (x > 0 && y > 0) {
            if (x > y)
                x = x % y;
            else
                y = y % x;
        }
        if (x == 0)
            return y;
        return x;
    }
}