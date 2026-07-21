class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m; i < m+n ; i++){
            nums1[i] = nums2[i-m];
        }
        for(int j = 0; j < m+n; j++){
            for(int k = 0; k < m+n; k++){
                if(nums1[j] < nums1[k]){
                    int temp = nums1[k];
                    nums1[k] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
        return;
    }
}