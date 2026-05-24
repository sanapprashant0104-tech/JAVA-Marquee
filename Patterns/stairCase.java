import java.util.Scanner;

public class stairCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int stars = sc.nextInt();
        int steps = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
            if (i % steps == 0) {
                stars += steps;
            }
        }
    }
}