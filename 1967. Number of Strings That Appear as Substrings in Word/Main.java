
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] patterns = new String[n];
        for (int i = 0; i < n; i++) {
            patterns[i] = sc.next();
        }
        String word = sc.next();
        System.out.println(new Main().numOfStrings(patterns, word));
        sc.close();
    }

    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                count++;
            }
        }
        return count;
    }
}
