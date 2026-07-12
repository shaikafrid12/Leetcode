class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(temp);
        int rank = 1;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i:temp){
            if(!hm.containsKey(i)) hm.put(i,rank++);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=hm.get(arr[i]);
        }
        return arr;
    }
}