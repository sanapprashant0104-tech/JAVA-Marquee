import java.util.Scanner;

public class bionomial_permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int bioCoe = fact(n)/(fact(n-r)*fact(r));
        System.out.println(bioCoe);

        int permu = fact(n) / fact(n - r);
        System.out.println(permu);
        
    }

    static int fact(int x){
        int f = 1;
        for (int i = 1; i <= x; i++) {
            f *= i;
        }
        return f;
    }
}
