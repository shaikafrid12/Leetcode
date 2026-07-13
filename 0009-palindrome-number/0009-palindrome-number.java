class Solution {
    public boolean isPalindrome(int x) {
    //     int rev=0;
    //     int temp=x;
    //     while(x>0){
    //         int y=x%10;
    //         rev=rev*10+y;
    //         x/=10;
    //     }
    //    return temp==rev;
        String s=""+x;
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}