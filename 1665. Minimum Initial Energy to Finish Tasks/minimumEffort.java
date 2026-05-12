import java.util.*;

class Solution {
    public int minimumEffort(int[][] tasks) {
        int ans=0;
        int curr=0;
         Arrays.sort(tasks,(a,b)->{
            int t1=a[1]-a[0];
            int t2=b[1]-b[0];
            return t2-t1;
         });
         System.out.println(Arrays.deepToString(tasks));
         for(int i=0;i<tasks.length;i++){
            if(tasks[i][1]>curr){
                ans+=tasks[i][1]-curr;
                curr=tasks[i][1];
            }
            curr-=tasks[i][0];
         }
         return ans;
    }

   public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[][] tasks =new int[n][2];
        for(int i=0;i<n;i++){
            tasks[i][0]=sc.nextInt();
            tasks[i][1]=sc.nextInt();
        }

        Solution s=new Solution();
        System.out.println(s.minimumEffort(tasks));
    }
}