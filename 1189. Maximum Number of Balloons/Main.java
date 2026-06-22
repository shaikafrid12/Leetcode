import java.util.Scanner;

public class Main {
    public int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;
        for (char c : text.toCharArray()) {
            switch (c) {
                case 'b':
                    b++;
                    break;
                case 'a':
                    a++;
                    break;
                case 'l':
                    l++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'n':
                    n++;
                    break;
            }
        }

        return Math.min(b, Math.min(a, Math.min(n, Math.min(l / 2, o / 2))));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String text = sc.nextLine();
            Main sol = new Main();
            System.out.println(sol.maxNumberOfBalloons(text));
        }
        sc.close();
    }
}