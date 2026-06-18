import java.util.Scanner;

public class Main {
    public double angleClock(int hour, int minutes) {
        double hourAngle = (hour % 12) * 30.0 + minutes * 0.5;
        double minAngle = minutes * 6.0;
        double diff = Math.abs(hourAngle - minAngle);
        return Math.min(diff, 360.0 - diff);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int hour = sc.nextInt();
            if (sc.hasNextInt()) {
                int minutes = sc.nextInt();
                Main m = new Main();
                double result = m.angleClock(hour, minutes);
                System.out.println(result);
            }
        }
        sc.close();
    }
}