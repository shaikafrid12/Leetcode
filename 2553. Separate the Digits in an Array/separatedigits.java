import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class separatedigits{
    
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
             Stack<Integer> stack = new Stack<>();
            while(x>0){
                stack.push(x%10);
                x=x/10;
            }
            while(!stack.isEmpty()){
                temp.add(stack.pop());
            }

        }
        int temp1[]=new int[temp.size()];
        for(int i=0;i<temp.size();i++){
            temp1[i]=temp.get(i);
        }
        return temp1;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        separatedigits s=new separatedigits();
       int result[]=s.separateDigits(nums);
       System.out.println(Arrays.toString(result));
       sc.close();
    }
}
    