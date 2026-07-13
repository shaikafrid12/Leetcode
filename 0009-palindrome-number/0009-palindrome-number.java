class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int temp=x;
        while(x>0){
            int y=x%10;
            rev=rev*10+y;
            x/=10;
        }
       return temp==rev;
    }
}