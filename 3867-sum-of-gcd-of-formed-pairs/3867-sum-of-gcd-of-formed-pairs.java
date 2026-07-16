class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int prefix[]=new int[n];
        int mx=0;
        for(int i=0;i<n;i++){
            mx=Math.max(mx,nums[i]);
            prefix[i]=gcd(nums[i],mx);
        }
        Arrays.sort(prefix);
        long ans=0;
        for(int i=0;i<n/2;i++){
            ans+=gcd(prefix[i],prefix[n-i-1]);
        }

        return ans;

    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}