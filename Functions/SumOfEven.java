import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int Sum = Add(n, m);
        System.out.println(Sum);
        
    }

    static int Add(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
