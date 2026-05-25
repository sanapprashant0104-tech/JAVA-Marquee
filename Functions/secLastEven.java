import java.util.Scanner;

public class secLastEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checksEven(n));
    }

    static boolean checksEven(int n){
        // n /= 10;
        // int dig = n % 10;
        // if (dig % 2 == 0) {
        //     return true;
        // }

        // n /= 10;
        // return (n % 10) % 2 == 0;



        // generiles formula for checking nth digit from last of the number
        int count = 0;
        while (n > 0) {
            count++;
            if (count == 2) {
                int dig = n % 10;
                if (dig % 2 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
            n /= 10;
        }
        return false;
    }
}
