class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int n = nums.length;
        ArrayList temp = new ArrayList<>();
        boolean arr[] = new boolean[101];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : nums) {
            max = Math.max(max, i);
            min = Math.min(min, i);
            arr[i] = true;
        }

        for (int i = min; i <= max; i++) {
            if (!arr[i])
                temp.add(i);
        }

        return temp;

    }
}