class Solution {
    public int maxSubArray(int[] nums) {
        long maxans=Integer.MIN_VALUE;
        long currsum=0;
        for(int i=0;i<nums.length;i++){
            currsum+=nums[i];
            if(currsum>maxans) maxans=currsum;
            if(currsum<0) currsum=0;
        }
        return (int)maxans;
    }

}