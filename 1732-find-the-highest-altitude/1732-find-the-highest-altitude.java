class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int res[]=new int[n+1];
        res[0]=0;
        int max=0;
        for(int i=1;i<=n;i++){
            res[i]=res[i-1]+gain[i-1];
            max=Math.max(max,res[i]);
        }
        return max;
    }
}