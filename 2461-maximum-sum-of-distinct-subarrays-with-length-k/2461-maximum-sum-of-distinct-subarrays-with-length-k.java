import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        long currSum = 0;
        long maxSum = 0;

        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            // Add current element
            currSum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            // Window size greater than k
            if (right - left + 1 > k) {

                currSum -= nums[left];

                map.put(nums[left], map.get(nums[left]) - 1);

                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }

                left++;
            }

            // Window size exactly k
            if (right - left + 1 == k) {

                // All elements are distinct
                if (map.size() == k) {
                    maxSum = Math.max(maxSum, currSum);
                }
            }
        }

        return maxSum;
    }
}