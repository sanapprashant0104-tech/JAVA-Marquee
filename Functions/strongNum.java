import java.util.Scanner;

public class strongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        // int myNum = n;
        // int f = 0;
        // int sum = 0;

        // while (n > 0) {
        //     int rem = n % 10;
        //     f = fact(rem);
        //     sum += f;
        //     n /= 10;
        // }

        // if (sum == myNum) {
        //     System.out.println("Strong");
        // } else {
        //     System.out.println("Not strong");
        // }


        
        // System.out.println(sum);



        System.out.println(isStrong(n));

    }

    static boolean isStrong(int n) {
        int myNum = n;
        int f = 0;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            f = fact(rem);
            sum += f;
            n /= 10;
        }

        return sum == myNum;
    }


    static int fact(int n) {
        if(n == 1) return 1;
        int res = 1;

        for (int i = 1; i <= n; i++) {
            res *= i;
        }

        return res;
    }
}
