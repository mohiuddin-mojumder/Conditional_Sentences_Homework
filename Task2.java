import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int h = sc.nextInt();

        System.out.print("Enter minutes: ");
        int m = sc.nextInt();

        System.out.print("Enter seconds: ");
        int s = sc.nextInt();

        if (h < 0 || h > 23 || m < 0 || m > 59
                || s < 0 || s > 59) {
            System.out.println("Invalid time");
        } else {
            s++;

            if (s == 60) {
                s = 0;
                m++;
            }

            if (m == 60) {
                m = 0;
                h++;
            }

            if (h == 24) {
                h = 0;
            }

            System.out.printf(
                    "Time after one second: %02d:%02d:%02d%n",
                    h, m, s
            );
        }

        sc.close();
    }
}