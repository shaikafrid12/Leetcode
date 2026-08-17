class Solution {
    public int maxSubArray(int[] nums) {
        // int maxans=Integer.MIN_VALUE;
        // int currsum=0;
        // for(int i=0;i<nums.length;i++){
        //     currsum+=nums[i];
        //     if(currsum>maxans) maxans=currsum;
        //     if(currsum<0) currsum=0;
        // }
        // return maxans;

        int curr = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(curr + nums[i], nums[i]);
            res = Math.max(res, curr);
        }
        return res;
    }

}