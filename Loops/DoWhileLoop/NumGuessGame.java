// package Loops.DoWhileLoop;

import java.util.Scanner;

public class NumGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i;
        do {
             i = sc.nextInt();
             if(i > n){
                System.out.println("High, Try lesser value");
             } else if (i < n) {
                System.out.println("Low, Try higher value");
             } else {
                System.out.println("Value matched, You Win !!");
             }
        } while(i != n);
    }
}
