import java.util.Scanner;

public class Main {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = i; j < n; j++) {
                if (nums[j] == target)
                    cnt++;

                int len = j - i + 1;
                if (cnt * 2 > len)
                    ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Main sol = new Main();
        System.out.println(sol.countMajoritySubarrays(nums, target));
        sc.close();
    }
}
