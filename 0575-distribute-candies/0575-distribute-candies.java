class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> temp = new HashSet<>();
        for (int i : candyType)
            temp.add(i);
        return Math.min(temp.size(), candyType.length / 2);
    }
}