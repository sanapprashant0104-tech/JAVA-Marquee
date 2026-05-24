import java.util.Scanner;

public class holloDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hollo_diamond(n);
    }

    public static void hollo_diamond(int n){
        for (int i = 1; i < n; i++) {

            //spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }

            // star
            for(int j = 1; j <= 2*i-1; j++){
                if (j == 1 || j == 2*i-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {

            //spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }

            // star
            for(int j = 1; j <= 2*i-1; j++){
                if (j == 1 || j == 2*i-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}