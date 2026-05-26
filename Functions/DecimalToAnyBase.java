import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int base = sc.nextInt();
        
        if (base > 10) {
            while (base > 10) {
                System.out.println("Invalid base,\nThis generalize formula works upto base <= 10.\nTry again with base <= 10");
                base = sc.nextInt();
            }
            decToAnyBase(num, base);
        }
        
        else {
            decToAnyBase(num, base);
        }
    }

    static void decToAnyBase(int n, int base) {
        int pow = 0;
        int newValue = 0;

        while (n > 0) {
            int rem = n % base;
            newValue = newValue + (rem * (int)Math.pow(10, pow));
            pow++;
            n /= base;
        }
        System.out.println(newValue);
    }
}
