package Loops.ForLoop;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        // print table of any number 'n' by using for loop
        Scanner PA = new Scanner(System.in);
        System.out.print("Enter Number : ");
        float num = PA.nextFloat();
        System.out.println("Here is table of " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
        PA.close();
    }
}
