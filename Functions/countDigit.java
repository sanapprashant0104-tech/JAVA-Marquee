import java.util.Scanner;

public class countDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(NumDigit(num));
    }

    static int NumDigit(int n){
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            count++;
            n /= 10;
        }
        return count;
    }
}
