import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year >= 1896 && (year - 1896) % 4 == 0) {
            int edition = (year - 1896) / 4 + 1;

            System.out.println("Olympic Year");
            System.out.println("Edition: " + edition);
        } else {
            System.out.println("Not an Olympic Year");
        }

        sc.close();
    }
}