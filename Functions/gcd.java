import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int min = sc.nextInt();

        int GCD = gcd(max, min);
        System.out.println(GCD);
        
    }

    public static int gcd(int max, int min){
        while (min != 0) {
            int rem = max % min;
            max = min;
            min = rem;
        }
        return max;
    }
}
