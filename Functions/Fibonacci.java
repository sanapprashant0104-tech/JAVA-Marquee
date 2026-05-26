import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("Fibonacci Series: ");
        fiboSeries(n);

        System.out.println();

        System.out.print(n+"th term of fibonacci series is: " + nthTermOffibo(n));
    }

// Print fibonacci series
    static void fiboSeries(int n){
        int a = 0;
        int b = 1;
        
        System.out.print(a + " " + b + " ");

        for (int i = 3; i <= n; i++) {

            int next = a + b;
            System.out.print(next + " ");

            a = b;
            b = next;

        }
    }

// return the nth term of fibonacci series.
    static int nthTermOffibo(int n){
        int a = 0;
        int b = 1;

        if (n == 1) return a;
        if (n == 2) return b;

        int next = 0;

        for (int i = 3; i <= n; i++) {

            next = (a + b);

            a = b;
            b = next;

        }
        return next;
    }
}
