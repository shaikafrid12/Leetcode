import java.util.Scanner;

public class Main {
    public int largestAltitude(int[] gain) {
        int currmax = 0;
        int maxaltitude = 0;
        for (int i : gain) {
            currmax += i;
            maxaltitude = Math.max(maxaltitude, currmax);
        }
        return maxaltitude;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] gain = new int[n];
            for (int i = 0; i < n; i++) {
                if (sc.hasNextInt()) {
                    gain[i] = sc.nextInt();
                }
            }
            Main m = new Main();
            int result = m.largestAltitude(gain);
            System.out.println(result);
        }
        sc.close();
    }
}