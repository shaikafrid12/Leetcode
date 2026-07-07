import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(concatenateNonZeroDigits(n));
        sc.close();
    }

    static long concatenateNonZeroDigits(int n) {
        long x = 0;
        long place = 1;
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            if (d != 0) {
                x += d * place;
                place *= 10;
                sum += d;
            }
            n /= 10;
        }
        return x * sum;

    }
}