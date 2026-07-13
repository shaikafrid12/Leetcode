class Solution {
    public int removeDuplicates(int[] nums) {
        // int i=1;
        // for(int j=1;j<nums.length;j++){
        //     if(nums[j]!=nums[i-1]){
        //         nums[i]=nums[j];
        //         i++;
        //     }
        // }
        // return i;
        int i=0;
        int j=1;
        int n=nums.length;
        while(j<n){
            if(nums[i]==nums[j]){
                j++;
            }else{
                i++;
                nums[i]=nums[j];
                j++;
            }
        }
        return i+1;
        
    }
}