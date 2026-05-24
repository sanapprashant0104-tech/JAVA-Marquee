import java.util.*;
public class factorial2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int factorial = fact(n);

        System.out.println(factorial);
    }

    static int fact(int n){
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}