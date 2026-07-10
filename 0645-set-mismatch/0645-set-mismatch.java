class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[] = new int[2];
        int arr1[] = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            arr1[nums[i]]++;
        }
        for (int i = 1; i <= nums.length; i++) {
            if (arr1[i] == 2) {
                arr[0] = i;
            }
            if (arr1[i] == 0)
                arr[1] = i;
        }
        return arr;

    }
}