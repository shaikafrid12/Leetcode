class Solution {
    public void moveZeroes(int[] nums) {
        // int temp[] = new int[nums.length];
        // int j = 0;
        // for (int i : nums) {
        //     if (i == 0)
        //         continue;
        //     temp[j++] = i;
        // }
        // while (nums.length > j) {
        //     temp[j++] = 0;
        // }
        // for (int i = 0; i < temp.length; i++) {
        //     nums[i] = temp[i];
        // }
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
}