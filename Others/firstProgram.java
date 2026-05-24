import java.util.*;
public class firstProgram {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int r = a % 10;
        // System.out.println(r);


        // float n = 10;
        // System.out.println(10.0/3);

        // float n = 10;
        // System.out.println(n/3);


        // Swapping without third variable
        int a = 10;
        int b = 50;

        // using xor operator
        a = a^b;
        b = a^b;
        a = a^b;

        // addition-subtraction operator
        a = a+b;
        b = a-b;
        a = a-b;

        // multiplication-division operator
        a = a*b;
        b = a/b;
        a = a/b;

        System.out.println(a);
        System.out.println(b);

    }
}
