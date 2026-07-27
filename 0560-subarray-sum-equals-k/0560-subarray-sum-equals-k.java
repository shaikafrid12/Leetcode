class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> temp = new HashMap<>();
        int count = 0;
        int current = 0;
        temp.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            current += nums[i];
            if (temp.containsKey(current - k)) {
                count += temp.get(current - k);
            }
            temp.put(current, temp.getOrDefault(current, 0) + 1);
        }
        return count;
    }
}