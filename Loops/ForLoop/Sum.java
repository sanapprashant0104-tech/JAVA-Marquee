package Loops.ForLoop;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // print sum first N natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("The sum of first " + N + " natural number is " + sum);
    }
}
