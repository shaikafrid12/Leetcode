import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int count = 0;
        Arrays.sort(costs);
        for (int i : costs) {
            if (i > coins)
                break;
            count++;
            coins -= i;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] costs = new int[n];
        for (int i = 0; i < n; i++) {
            costs[i] = sc.nextInt();
        }
        int coins = sc.nextInt();
        Solution solution = new Solution();
        System.out.println(solution.maxIceCream(costs, coins));
        sc.close();
    }
}
